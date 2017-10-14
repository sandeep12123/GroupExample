package com.sandeep.group.services;

import java.util.List;

import com.sandeep.group.dto.GroupDTO;

public interface GroupService {

	void create(GroupDTO groupDTO);
	List<GroupDTO> findAll();
	GroupDTO addMember(GroupDTO groupDTO);
	
}
