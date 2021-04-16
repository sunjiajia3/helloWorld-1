package com.yidu.ssmdemo001.service.impl;

import com.yidu.ssmdemo001.dao.RoleinfoDao;
import com.yidu.ssmdemo001.entity.Roleinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleinfoServiceImpl {

    @Autowired
    RoleinfoDao roleinfoDao;

    public Roleinfo selectById(int roleid){
        return this.roleinfoDao.selectById(roleid);
    }

}
