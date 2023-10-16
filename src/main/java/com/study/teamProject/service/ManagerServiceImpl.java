package com.study.teamProject.service;

import java.util.List;
import com.study.teamProject.model.aws.dao.ManagerMapper;
import com.study.teamProject.model.aws.dto.ManagerDTO;
import com.study.teamProject.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService{
    private final ManagerMapper managerMapper;

    @Override
    public List<ManagerDTO> getAllDataList(){
        return managerMapper.getAllDataList();
    }
}
