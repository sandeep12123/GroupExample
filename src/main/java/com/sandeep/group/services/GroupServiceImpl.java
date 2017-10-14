package com.sandeep.group.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import com.sandeep.group.config.AppConfig;
import com.sandeep.group.dto.GroupDTO;
import com.sandeep.group.repositries.GroupRepositry;
@Service("groupService")
@Import(AppConfig.class)
public class GroupServiceImpl implements GroupService {
	@Autowired
	GroupRepositry groupRepositry;
	@Override
	public void create(GroupDTO groupDTO) {
		if(groupDTO.getGroupMembers() == null){
			groupDTO.setGroupMembers(new ArrayList());
		}
		groupDTO.getGroupMembers().add(groupDTO.getOwnerId());
		groupRepositry.save(groupDTO);
	}

	@Override
	public List<GroupDTO> findAll() {
		List<GroupDTO> groups= groupRepositry.findAll();
		return groups;
	}

	@Override
	public GroupDTO addMember(GroupDTO groupDTO) {
	GroupDTO oldMember=groupRepositry.findOne(groupDTO.getGroupId());
	List<String> list=groupDTO.getGroupMembers(); 
	List<String> oldList=oldMember.getGroupMembers();
    Set<String> newSet = new HashSet<String>(oldList);

    newSet.addAll(list);
   List<String> newList = new ArrayList<String>(newSet);
	/*List<String> newList=new ArrayList<>();
	newList.addAll(list);
	newList.addAll(oldList);*/
   oldMember.setGroupMembers(newList);
	groupRepositry.save(oldMember);
	return oldMember;
	}

}
