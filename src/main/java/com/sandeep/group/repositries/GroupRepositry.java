package com.sandeep.group.repositries;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sandeep.group.dto.GroupDTO;


@Transactional
public interface GroupRepositry extends MongoRepository<GroupDTO, String>{

}
