drop table if exists t_class;

drop table if exists t_class_course;

drop table if exists t_course;

drop table if exists t_course_exam;

drop table if exists t_course_section;

drop table if exists t_exam;

drop table if exists t_exam_topic;

drop table if exists t_operation;

drop table if exists t_practice;

drop table if exists t_practice_answer;

drop table if exists t_role;

drop table if exists t_role_operation;

drop table if exists t_section;

drop table if exists t_student_class;

drop table if exists t_term;

drop table if exists t_topic;

drop table if exists t_topic_answer;

drop table if exists t_topic_topic_answer;

drop table if exists t_topic_type;

drop table if exists t_user;

drop table if exists t_user_role;

/*==============================================================*/
/* Table: t_class                                               */
/*==============================================================*/
create table t_class
(
   class_id             int not null auto_increment,
   term_id              int,
   description          varchar(30),
   primary key (class_id)
);

/*==============================================================*/
/* Table: t_class_course                                        */
/*==============================================================*/
create table t_class_course
(
   class_id             int,
   course_id            int
);

/*==============================================================*/
/* Table: t_course                                              */
/*==============================================================*/
create table t_course
(
   course_id            int not null auto_increment,
   description          varchar(30),
   primary key (course_id)
);

/*==============================================================*/
/* Table: t_course_exam                                         */
/*==============================================================*/
create table t_course_exam
(
   exam_id              int,
   course_id            int
);

/*==============================================================*/
/* Table: t_course_section                                      */
/*==============================================================*/
create table t_course_section
(
   course_id            int,
   section_id           int
);

/*==============================================================*/
/* Table: t_exam                                                */
/*==============================================================*/
create table t_exam
(
   exam_id              int not null auto_increment,
   description          varchar(30),
   primary key (exam_id)
);

/*==============================================================*/
/* Table: t_exam_topic                                          */
/*==============================================================*/
create table t_exam_topic
(
   exam_id              int,
   topic_id             int,
   sequence             int
);

/*==============================================================*/
/* Table: t_operation                                           */
/*==============================================================*/
create table t_operation
(
   operation_id         int not null auto_increment,
   parent_operation_id  int,
   view                 varchar(225),
   description          varchar(100),
   primary key (operation_id)
);

/*==============================================================*/
/* Table: t_practice                                            */
/*==============================================================*/
create table t_practice
(
   practice_id          int not null auto_increment,
   exam_id              int,
   user_id              int,
   start_time           datetime,
   end_time             datetime,
   primary key (practice_id)
);

/*==============================================================*/
/* Table: t_practice_answer                                     */
/*==============================================================*/
create table t_practice_answer
(
   topic_id             int,
   practice_id          int,
   score                int,
   content              varchar(225),
   sequence             int
);

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   role_id              int not null auto_increment,
   role_name            varchar(30) not null,
   description          varchar(30),
   primary key (role_id)
);

/*==============================================================*/
/* Table: t_role_operation                                      */
/*==============================================================*/
create table t_role_operation
(
   role_id              int,
   operation_id         int
);

/*==============================================================*/
/* Table: t_section                                             */
/*==============================================================*/
create table t_section
(
   section_id           int not null,
   content              varchar(500),
   primary key (section_id)
);

/*==============================================================*/
/* Table: t_student_class                                       */
/*==============================================================*/
create table t_student_class
(
   class_id             int,
   user_id              int
);

/*==============================================================*/
/* Table: t_term                                                */
/*==============================================================*/
create table t_term
(
   term_id              int not null auto_increment,
   start_date           date,
   end_date             date,
   primary key (term_id)
);

/*==============================================================*/
/* Table: t_topic                                               */
/*==============================================================*/
create table t_topic
(
   topic_id             int not null auto_increment,
   topic_type_id        int,
   section_id           int,
   content              varchar(225),
   score                int,
   primary key (topic_id)
);

/*==============================================================*/
/* Table: t_topic_answer                                        */
/*==============================================================*/
create table t_topic_answer
(
   topic_answer_id      int not null auto_increment,
   isTrue               boolean,
   content              varchar(225),
   sequence             int,
   primary key (topic_answer_id)
);

/*==============================================================*/
/* Table: t_topic_topic_answer                                  */
/*==============================================================*/
create table t_topic_topic_answer
(
   topic_id             int,
   topic_answer_id      int
);

/*==============================================================*/
/* Table: t_topic_type                                          */
/*==============================================================*/
create table t_topic_type
(
   topic_type_id        int not null auto_increment,
   description          varchar(30),
   primary key (topic_type_id)
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   user_id              int not null auto_increment,
   username             varchar(30),
   password             varchar(30),
   name                 varchar(18),
   status               bool,
   mobile               varchar(11),
   address              varchar(50),
   signature            varchar(225),
   mail                 varchar(30),
   primary key (user_id)
);

/*==============================================================*/
/* Table: t_user_role                                           */
/*==============================================================*/
create table t_user_role
(
   user_id              int,
   role_id              int
);

alter table t_class add constraint FK_Reference_15 foreign key (term_id)
      references t_term (term_id) on delete restrict on update restrict;

alter table t_class_course add constraint FK_Reference_11 foreign key (class_id)
      references t_class (class_id) on delete restrict on update restrict;

alter table t_class_course add constraint FK_Reference_12 foreign key (course_id)
      references t_course (course_id) on delete restrict on update restrict;

alter table t_course_exam add constraint FK_Reference_16 foreign key (course_id)
      references t_course (course_id) on delete restrict on update restrict;

alter table t_course_exam add constraint FK_Reference_17 foreign key (exam_id)
      references t_exam (exam_id) on delete restrict on update restrict;

alter table t_course_section add constraint FK_Reference_31 foreign key (course_id)
      references t_course (course_id) on delete restrict on update restrict;

alter table t_course_section add constraint FK_Reference_32 foreign key (section_id)
      references t_section (section_id) on delete restrict on update restrict;

alter table t_exam_topic add constraint FK_Reference_18 foreign key (exam_id)
      references t_exam (exam_id) on delete restrict on update restrict;

alter table t_exam_topic add constraint FK_Reference_19 foreign key (topic_id)
      references t_topic (topic_id) on delete restrict on update restrict;

alter table t_operation add constraint FK_opeartion_operation foreign key (parent_operation_id)
      references t_operation (operation_id) on delete restrict on update restrict;

alter table t_practice add constraint FK_Reference_24 foreign key (exam_id)
      references t_exam (exam_id) on delete restrict on update restrict;

alter table t_practice add constraint FK_Reference_35 foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_practice_answer add constraint FK_Reference_25 foreign key (topic_id)
      references t_topic (topic_id) on delete restrict on update restrict;

alter table t_practice_answer add constraint FK_Reference_26 foreign key (practice_id)
      references t_practice (practice_id) on delete restrict on update restrict;

alter table t_role_operation add constraint FK_Reference_29 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;

alter table t_role_operation add constraint FK_Reference_30 foreign key (operation_id)
      references t_operation (operation_id) on delete restrict on update restrict;

alter table t_student_class add constraint FK_Reference_34 foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_student_class add constraint FK_Reference_9 foreign key (class_id)
      references t_class (class_id) on delete restrict on update restrict;

alter table t_topic add constraint FK_Reference_22 foreign key (topic_type_id)
      references t_topic_type (topic_type_id) on delete restrict on update restrict;

alter table t_topic add constraint FK_Reference_33 foreign key (section_id)
      references t_section (section_id) on delete restrict on update restrict;

alter table t_topic_topic_answer add constraint FK_Reference_20 foreign key (topic_id)
      references t_topic (topic_id) on delete restrict on update restrict;

alter table t_topic_topic_answer add constraint FK_Reference_21 foreign key (topic_answer_id)
      references t_topic_answer (topic_answer_id) on delete restrict on update restrict;

alter table t_user_role add constraint FK_Reference_27 foreign key (user_id)
      references t_user (user_id) on delete restrict on update restrict;

alter table t_user_role add constraint FK_Reference_28 foreign key (role_id)
      references t_role (role_id) on delete restrict on update restrict;
      
/* init */
INSERT INTO t_user(username, password, name, status) VALUES ('000000','000000','Mortimer', 1);
INSERT INTO t_role(role_name, description) values ('admin','系统管理员');
INSERT INTO t_role(role_name, description) values ('teacher','教师');
INSERT INTO t_role(role_name, description) values ('student','学生');
INSERT INTO t_user_role(user_id, role_id) VALUES (1, 1);
INSERT INTO t_user_role(user_id, role_id) VALUES (1, 2);
INSERT INTO t_user_role(user_id, role_id) VALUES (1, 3);
