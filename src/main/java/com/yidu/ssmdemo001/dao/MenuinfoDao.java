package com.yidu.ssmdemo001.dao;

import com.yidu.ssmdemo001.entity.Menuinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Menuinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-12 14:09:06
 */
@Mapper
@Repository
public interface MenuinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    Menuinfo queryById(String menuid);

    /**
     * 查询指定行数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Menuinfo> queryAllByLimit(int page,int limit);

    /**
     * 查询所有
     * @return
     */
    List<Menuinfo> selectAll();

    /**
     * 查询总行数
     * @return 总行数
     */
    int count();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param menuinfo 实例对象
     * @return 对象列表
     */
    List<Menuinfo> queryAll(Menuinfo menuinfo);

    /**
     * 新增数据
     *
     * @param menuinfo 实例对象
     * @return 影响行数
     */
    int insert(Menuinfo menuinfo);

    /**
     * 修改数据
     *
     * @param menuinfo 实例对象
     * @return 影响行数
     */
    int update(Menuinfo menuinfo);

    /**
     * 通过主键删除数据
     *
     * @param menuid 主键
     * @return 影响行数
     */
    int deleteById(String menuid);

}