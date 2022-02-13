package io.hel.tx.entity;

import java.util.Date;

/**
 * hel
 * 2022/2/13 2:37 下午
 * description:
 */
@SuppressWarnings({"all"})
public class ActiveInfo {
    public ActiveInfo() {
    }

    public ActiveInfo(Integer id, String activeName, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.activeName = activeName;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    private Integer id;
    private String activeName;
    private Date gmtCreate;
    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "ActiveInfo{" +
                "id=" + id +
                ", activeName='" + activeName + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
