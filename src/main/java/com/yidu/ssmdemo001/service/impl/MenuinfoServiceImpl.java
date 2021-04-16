package com.yidu.ssmdemo001.service.impl;

import com.yidu.ssmdemo001.entity.Menuinfo;
import com.yidu.ssmdemo001.dao.MenuinfoDao;
import com.yidu.ssmdemo001.service.MenuinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Menuinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-12 14:09:07
 */
@Service("menuinfoService")
public class MenuinfoServiceImpl implements MenuinfoService {
    @Resource
    private MenuinfoDao menuinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    @Override
    public Menuinfo queryById(String menuid) {
        return this.menuinfoDao.queryById(menuid);
    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Menuinfo> queryAllByLimit(int page, int limit) {
        return this.menuinfoDao.queryAllByLimit((page-1)*limit, limit);
    }

    @Override
    public List<Menuinfo> selectAll() {
        return this.menuinfoDao.selectAll();
    }

    @Override
    public int count() {
        return this.menuinfoDao.count();
    }

    /**
     * 新增数据
     *
     * @param menuinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Menuinfo insert(Menuinfo menuinfo) {
        this.menuinfoDao.insert(menuinfo);
        return menuinfo;
    }

    /**
     * 修改数据
     *
     * @param menuinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Menuinfo update(Menuinfo menuinfo) {
        this.menuinfoDao.update(menuinfo);
        return this.queryById(menuinfo.getMenuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param menuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String menuid) {
        return this.menuinfoDao.deleteById(menuid) > 0;
    }
}