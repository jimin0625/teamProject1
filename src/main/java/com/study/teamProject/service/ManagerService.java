package com.study.teamProject.service;

import java.util.List;
import com.study.teamProject.model.aws.dto.ManagerDTO;
import org.springframework.transaction.annotation.Transactional;

public interface ManagerService {
    public List<ManagerDTO> getAllDataList();
    public int getAutoIncrementValue();
}
