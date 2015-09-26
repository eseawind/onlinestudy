package com.xg12.entity;

public class TopicType {
	private Integer topicTypeId;

	private String description;

	public Integer getTopicTypeId() {
		return topicTypeId;
	}

	public void setTopicTypeId(Integer topicTypeId) {
		this.topicTypeId = topicTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}