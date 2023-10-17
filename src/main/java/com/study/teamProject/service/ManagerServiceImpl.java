package com.study.teamProject.service;

import java.util.List;
import com.study.teamProject.model.aws.dao.ManagerMapper;
import com.study.teamProject.model.aws.dto.ManagerDTO;
import com.study.teamProject.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService{
    private final ManagerMapper managerMapper;
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public List<ManagerDTO> getAllDataList(){
        return managerMapper.getAllDataList();
    }

    @Override
    public int getAutoIncrementValue() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // Mapper 인터페이스 객체 생성
            ManagerMapper managerMapper = sqlSession.getMapper(ManagerMapper.class);

            // getAutoIncrementValue 메서드 호출
            int autoIncrementValue = managerMapper.getAutoIncrementValue();

            // sqlSession 닫기
            sqlSession.close();

            return autoIncrementValue;
        }
    }
}
