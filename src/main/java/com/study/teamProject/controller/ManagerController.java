package com.study.teamProject.controller;

import com.study.teamProject.model.aws.dto.ManagerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.teamProject.service.ManagerService;
import java.util.List;


@RestController
@RequestMapping("/api1")
public class ManagerController {
    private final ManagerService managerService;

    @Autowired
    public ManagerController( ManagerService managerService){
        this.managerService = managerService;
    }
    @Transactional
    @PostMapping("/manager")
    public List<ManagerDTO> manager(@RequestBody ManagerDTO managerDTO) {
        return managerService.getAllDataList();
    }

}
