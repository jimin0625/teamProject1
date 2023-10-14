package com.study.teamProject.model.aws.dao;

import java.util.List;

import com.study.teamProject.model.aws.dto.portfolio;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<portfolio> getAllDataList();
}