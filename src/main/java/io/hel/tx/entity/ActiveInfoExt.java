package io.hel.tx.entity;

import java.util.Date;

/**
 * hel
 * 2022/2/13 2:42 下午
 * description:
 */
@SuppressWarnings({"all"})
public class ActiveInfoExt {
    public ActiveInfoExt() {
    }

    public ActiveInfoExt(Integer id, String extMsg, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.extMsg = extMsg;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    private Integer id;
    private String extMsg;
    private Date gmtCreate;
    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExtMsg() {
        return extMsg;
    }

    public void setExtMsg(String extMsg) {
        this.extMsg = extMsg;
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
        return "ActiveInfoExt{" +
                "id=" + id +
                ", extMsg='" + extMsg + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
