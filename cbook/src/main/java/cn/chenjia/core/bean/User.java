package cn.chenjia.core.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String uid;

    private String uname;

    private String upassword;

    private String ugender;

    private String uphone;

    private String uaddress;

    private String uemail;

    private Date uregisteredtime;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender == null ? null : ugender.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public Date getUregisteredtime() {
        return uregisteredtime;
    }

    public void setUregisteredtime(Date uregisteredtime) {
        this.uregisteredtime = uregisteredtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", upassword=").append(upassword);
        sb.append(", ugender=").append(ugender);
        sb.append(", uphone=").append(uphone);
        sb.append(", uaddress=").append(uaddress);
        sb.append(", uemail=").append(uemail);
        sb.append(", uregisteredtime=").append(uregisteredtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}