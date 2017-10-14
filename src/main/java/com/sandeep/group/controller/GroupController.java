package com.sandeep.group.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.group.dto.GroupDTO;
import com.sandeep.group.services.GroupService;

@RestController
@RequestMapping(value="/group")
public class GroupController {

	@Autowired
	GroupService groupService;
	
@RequestMapping(value = "/add", method = RequestMethod.POST)
public GroupDTO add(@RequestBody GroupDTO groupDTO)
{
	System.out.println(groupDTO.getGroupName());
	groupService.create(groupDTO);
	return groupDTO;
}


@RequestMapping(value = "/addMember", method = RequestMethod.POST)
public GroupDTO addMember(@RequestBody GroupDTO groupDTO)
{
GroupDTO groupDTO2=groupService.addMember(groupDTO);

return groupDTO2;
}

@RequestMapping(value = "/allGroup", method = RequestMethod.GET)
public List<GroupDTO> findALL(){
List<GroupDTO> groups=groupService.findAll();
return groups;
	
}

}
