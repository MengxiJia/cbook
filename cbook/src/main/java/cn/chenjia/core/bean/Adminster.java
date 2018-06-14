package cn.chenjia.core.bean;

import java.io.Serializable;

public class Adminster implements Serializable {
    private Integer adid;

    private String adname;

    private String adpassword;

    private String adgender;

    private String adphone;

    private String ademail;

    private String adaddress;

    private static final long serialVersionUID = 1L;

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname == null ? null : adname.trim();
    }

    public String getAdpassword() {
        return adpassword;
    }

    public void setAdpassword(String adpassword) {
        this.adpassword = adpassword == null ? null : adpassword.trim();
    }

    public String getAdgender() {
        return adgender;
    }

    public void setAdgender(String adgender) {
        this.adgender = adgender == null ? null : adgender.trim();
    }

    public String getAdphone() {
        return adphone;
    }

    public void setAdphone(String adphone) {
        this.adphone = adphone == null ? null : adphone.trim();
    }

    public String getAdemail() {
        return ademail;
    }

    public void setAdemail(String ademail) {
        this.ademail = ademail == null ? null : ademail.trim();
    }

    public String getAdaddress() {
        return adaddress;
    }

    public void setAdaddress(String adaddress) {
        this.adaddress = adaddress == null ? null : adaddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adid=").append(adid);
        sb.append(", adname=").append(adname);
        sb.append(", adpassword=").append(adpassword);
        sb.append(", adgender=").append(adgender);
        sb.append(", adphone=").append(adphone);
        sb.append(", ademail=").append(ademail);
        sb.append(", adaddress=").append(adaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}