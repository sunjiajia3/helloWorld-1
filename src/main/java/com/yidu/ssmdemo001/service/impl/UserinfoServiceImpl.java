package com.yidu.ssmdemo001.service.impl;

import com.yidu.ssmdemo001.entity.Userinfo;
import com.yidu.ssmdemo001.dao.UserinfoDao;
import com.yidu.ssmdemo001.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-12 14:40:34
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    private UserinfoDao userinfoDao;

    @Override
    public Userinfo login(String userName, String userPass) {
        return this.userinfoDao.login(userName,userPass);
    }

    @Override
    public int register(Userinfo userinfo) {
        return this.userinfoDao.register(userinfo);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public Userinfo queryById(Integer userid) {
        return this.userinfoDao.queryById(userid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Userinfo> queryAllByLimit(int offset, int limit) {
        return this.userinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Userinfo insert(Userinfo userinfo) {
        this.userinfoDao.insert(userinfo);
        return userinfo;
    }

    /**
     * 修改数据
     *
     * @param userinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Userinfo update(Userinfo userinfo) {
        this.userinfoDao.update(userinfo);
        return this.queryById(userinfo.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userid) {
        return this.userinfoDao.deleteById(userid) > 0;
    }
}