package com.study.teamProject.model.aws.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//API 1. 방장의 이름과 이메일을 입력받는다.
public class ManagerDTO {

    private String managerName;
    private String managerEmail;
    private int roomId;

    public ManagerDTO(String managerName, String managerEmail, int roomId){
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.roomId = roomId;
    }
    //getter
    public String getManagerName(){
        return managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }
    public int getRoomId() {
        return roomId;
    }
    //setter
    public void setManagerName(String managerName){
        this.managerName = managerName;
    }

    public void setManagerEmail(String managerEmail){
        this.managerEmail = managerEmail;
    }
    public void setRoomId(int roomId){
        this.roomId = roomId;
    }

}
