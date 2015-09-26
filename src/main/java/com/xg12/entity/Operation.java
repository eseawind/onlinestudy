package com.xg12.entity;

public class Operation {
	private Integer operationId;

	private Integer parentOperationId;

	private String view;

	private String description;

	public Integer getOperationId() {
		return operationId;
	}

	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
	}

	public Integer getParentOperationId() {
		return parentOperationId;
	}

	public void setParentOperationId(Integer parentOperationId) {
		this.parentOperationId = parentOperationId;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view == null ? null : view.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}