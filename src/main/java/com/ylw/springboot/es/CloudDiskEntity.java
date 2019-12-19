package com.ylw.springboot.es;

import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "clouddisk", type = "disk")
public class CloudDiskEntity {
    private String id;
    // 名称
    private String name;
    // 来源
    private String source;
    // 描述
    private String describe;
    // 分享时间
    private Date shartime;
    // 浏览次数
    private Long browsetimes;
    // 文件大小
    private Double filesize;
    // 分享人
    private String sharpeople;
    // 收录时间
    private String collectiontime;
    // 地址
    private String baiduaddres;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getShartime() {
        return shartime;
    }

    public void setShartime(Date shartime) {
        this.shartime = shartime;
    }

    public Long getBrowsetimes() {
        return browsetimes;
    }

    public void setBrowsetimes(Long browsetimes) {
        this.browsetimes = browsetimes;
    }

    public Double getFilesize() {
        return filesize;
    }

    public void setFilesize(Double filesize) {
        this.filesize = filesize;
    }

    public String getSharpeople() {
        return sharpeople;
    }

    public void setSharpeople(String sharpeople) {
        this.sharpeople = sharpeople;
    }

    public String getCollectiontime() {
        return collectiontime;
    }

    public void setCollectiontime(String collectiontime) {
        this.collectiontime = collectiontime;
    }

    public String getBaiduaddres() {
        return baiduaddres;
    }

    public void setBaiduaddres(String baiduaddres) {
        this.baiduaddres = baiduaddres;
    }
}
