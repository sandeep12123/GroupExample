package com.sandeep.group.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GroupDTO {
	@Id
	private String groupId;
	private String groupName;
	private String ownerId;
	private List<String> groupMembers;

	public GroupDTO() {
		super();
	}

	public GroupDTO(String groupId, String groupName, String ownerId, List<String> groupMembers) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.ownerId = ownerId;
		this.groupMembers = groupMembers;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public List<String> getGroupMembers() {
		return groupMembers;
	}

	public void setGroupMembers(List<String> groupMembers) {
		this.groupMembers = groupMembers;
	}

	@Override
	public String toString() {

		return "Group{" + "groupId=" + groupId + ", groupName='" + groupName + ", ownerId='" + ownerId
				+ ", groupMembers='" + groupMembers + '}';

	}
}
