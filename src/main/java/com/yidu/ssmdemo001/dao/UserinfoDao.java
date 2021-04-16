package com.yidu.ssmdemo001.dao;

import com.yidu.ssmdemo001.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-12 14:40:34
 */
@Mapper
@Repository   //仓库
public interface UserinfoDao {

    /**
     * 用户登录
     * @param userName 用户名
     * @param userPass 用户密码
     * @return 登录是否成功
     */
    Userinfo login(String userName,String userPass);

    /**
     * 用户注册
     * @param userinfo 用户对象
     * @return 注册是否成功
     */
    int register(Userinfo userinfo);

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Userinfo queryById(Integer userid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Userinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userinfo 实例对象
     * @return 对象列表
     */
    List<Userinfo> queryAll(Userinfo userinfo);

    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 影响行数
     */
    int insert(Userinfo userinfo);

    /**
     * 修改数据
     *
     * @param userinfo 实例对象
     * @return 影响行数
     */
    int update(Userinfo userinfo);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 影响行数
     */
    int deleteById(Integer userid);

}