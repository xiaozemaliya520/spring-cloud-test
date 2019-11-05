package com.itheima.domain;

public class Goods {

    private  Integer id;
    private Integer status;
    private String  name;
    private  Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
