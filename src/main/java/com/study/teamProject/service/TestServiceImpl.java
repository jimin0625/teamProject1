package com.study.teamProject.service;

import java.util.List;

import com.study.teamProject.model.aws.dao.TestMapper;
import com.study.teamProject.model.aws.dto.portfolio;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }
}