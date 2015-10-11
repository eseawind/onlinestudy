package com.xg12.entity;

public class TopicAnswer {
    private Integer topicAnswerId;

    private Boolean istrue;

    private String content;

    private Integer sequence;

    public Integer getTopicAnswerId() {
        return topicAnswerId;
    }

    public void setTopicAnswerId(Integer topicAnswerId) {
        this.topicAnswerId = topicAnswerId;
    }

    public Boolean getIstrue() {
        return istrue;
    }

    public void setIstrue(Boolean istrue) {
        this.istrue = istrue;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}