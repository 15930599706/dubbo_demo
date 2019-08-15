package cn.yd.api.model;

import java.io.Serializable;
import java.sql.Date;//年月日

public class User implements Serializable {

    private static final long serialVersionUID = 1313050543933483942L;

    private int id;
    private String username;//用户名
    private Date birthday;//生日
    private String sex;//性别
    private String address;//地址

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
