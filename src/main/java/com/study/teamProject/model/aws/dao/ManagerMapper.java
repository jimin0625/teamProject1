package com.study.teamProject.model.aws.dao;

import com.study.teamProject.model.aws.dto.ManagerDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface ManagerMapper {
    List<ManagerDTO> getAllDataList();
}
