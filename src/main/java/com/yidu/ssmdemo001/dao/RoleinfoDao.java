package com.yidu.ssmdemo001.dao;

import com.yidu.ssmdemo001.entity.Roleinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleinfoDao {

    /**
     * 根据Id查出角色
     * @param roleid
     * @return
     */
    Roleinfo selectById(int roleid);

}
