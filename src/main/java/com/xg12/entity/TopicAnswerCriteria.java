package com.xg12.entity;

import java.util.ArrayList;
import java.util.List;

public class TopicAnswerCriteria {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TopicAnswerCriteria() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andTopicAnswerIdIsNull() {
			addCriterion("topic_answer_id is null");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdIsNotNull() {
			addCriterion("topic_answer_id is not null");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdEqualTo(Integer value) {
			addCriterion("topic_answer_id =", value, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdNotEqualTo(Integer value) {
			addCriterion("topic_answer_id <>", value, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdGreaterThan(Integer value) {
			addCriterion("topic_answer_id >", value, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("topic_answer_id >=", value, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdLessThan(Integer value) {
			addCriterion("topic_answer_id <", value, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdLessThanOrEqualTo(Integer value) {
			addCriterion("topic_answer_id <=", value, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdIn(List<Integer> values) {
			addCriterion("topic_answer_id in", values, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdNotIn(List<Integer> values) {
			addCriterion("topic_answer_id not in", values, "topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdBetween(Integer value1, Integer value2) {
			addCriterion("topic_answer_id between", value1, value2,
					"topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andTopicAnswerIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("topic_answer_id not between", value1, value2,
					"topicAnswerId");
			return (Criteria) this;
		}

		public Criteria andIstrueIsNull() {
			addCriterion("isTrue is null");
			return (Criteria) this;
		}

		public Criteria andIstrueIsNotNull() {
			addCriterion("isTrue is not null");
			return (Criteria) this;
		}

		public Criteria andIstrueEqualTo(Boolean value) {
			addCriterion("isTrue =", value, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueNotEqualTo(Boolean value) {
			addCriterion("isTrue <>", value, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueGreaterThan(Boolean value) {
			addCriterion("isTrue >", value, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueGreaterThanOrEqualTo(Boolean value) {
			addCriterion("isTrue >=", value, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueLessThan(Boolean value) {
			addCriterion("isTrue <", value, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueLessThanOrEqualTo(Boolean value) {
			addCriterion("isTrue <=", value, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueIn(List<Boolean> values) {
			addCriterion("isTrue in", values, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueNotIn(List<Boolean> values) {
			addCriterion("isTrue not in", values, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueBetween(Boolean value1, Boolean value2) {
			addCriterion("isTrue between", value1, value2, "istrue");
			return (Criteria) this;
		}

		public Criteria andIstrueNotBetween(Boolean value1, Boolean value2) {
			addCriterion("isTrue not between", value1, value2, "istrue");
			return (Criteria) this;
		}

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andSequenceIsNull() {
			addCriterion("sequence is null");
			return (Criteria) this;
		}

		public Criteria andSequenceIsNotNull() {
			addCriterion("sequence is not null");
			return (Criteria) this;
		}

		public Criteria andSequenceEqualTo(Integer value) {
			addCriterion("sequence =", value, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceNotEqualTo(Integer value) {
			addCriterion("sequence <>", value, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceGreaterThan(Integer value) {
			addCriterion("sequence >", value, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
			addCriterion("sequence >=", value, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceLessThan(Integer value) {
			addCriterion("sequence <", value, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceLessThanOrEqualTo(Integer value) {
			addCriterion("sequence <=", value, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceIn(List<Integer> values) {
			addCriterion("sequence in", values, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceNotIn(List<Integer> values) {
			addCriterion("sequence not in", values, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceBetween(Integer value1, Integer value2) {
			addCriterion("sequence between", value1, value2, "sequence");
			return (Criteria) this;
		}

		public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
			addCriterion("sequence not between", value1, value2, "sequence");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}