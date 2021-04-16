package com.yidu.ssmdemo001.service;

import com.yidu.ssmdemo001.entity.Menuinfo;
import java.util.List;

/**
 * (Menuinfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-12 14:09:07
 */
public interface MenuinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    Menuinfo queryById(String menuid);

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Menuinfo> queryAllByLimit(int page, int limit);

    /**
     * 查询所有信息
     * @return
     */
    List<Menuinfo> selectAll();

    /**
     * 查询总行数
     * @return 总行数
     */
    int count();

    /**
     * 新增数据
     *
     * @param menuinfo 实例对象
     * @return 实例对象
     */
    Menuinfo insert(Menuinfo menuinfo);

    /**
     * 修改数据
     *
     * @param menuinfo 实例对象
     * @return 实例对象
     */
    Menuinfo update(Menuinfo menuinfo);

    /**
     * 通过主键删除数据
     *
     * @param menuid 主键
     * @return 是否成功
     */
    boolean deleteById(String menuid);

}