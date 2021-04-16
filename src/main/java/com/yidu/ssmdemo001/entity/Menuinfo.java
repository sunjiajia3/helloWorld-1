package com.yidu.ssmdemo001.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Menuinfo)实体类
 *
 * @author makejava
 * @since 2021-04-12 14:09:06
 */
@Component
public class Menuinfo implements Serializable {
    private static final long serialVersionUID = 808403358389121515L;
    
    private String menuid;
    
    private String title;
    
    private Integer state;
    
    private String url;
    
    private String pid;
    
    private String iconcls;


    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    @Override
    public String toString() {
        return "Menuinfo{" +
                "menuid='" + menuid + '\'' +
                ", title='" + title + '\'' +
                ", state=" + state +
                ", url='" + url + '\'' +
                ", pid='" + pid + '\'' +
                ", iconcls='" + iconcls + '\'' +
                '}';
    }
}