package com.yidu.ssmdemo001.service;

import com.yidu.ssmdemo001.entity.Roleinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleinfoService {

    /**
     * 根据Id查出角色
     * @param roleid
     * @return
     */
    Roleinfo selectById(int roleid);

}
