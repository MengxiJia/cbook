package cn.chenjia.core.bean;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer bid;

    private String bname;

    private String bauthor;

    private String bnation;

    private Double bprice;

    private String bstock;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor == null ? null : bauthor.trim();
    }

    public String getBnation() {
        return bnation;
    }

    public void setBnation(String bnation) {
        this.bnation = bnation == null ? null : bnation.trim();
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public String getBstock() {
        return bstock;
    }

    public void setBstock(String bstock) {
        this.bstock = bstock == null ? null : bstock.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", bname=").append(bname);
        sb.append(", bauthor=").append(bauthor);
        sb.append(", bnation=").append(bnation);
        sb.append(", bprice=").append(bprice);
        sb.append(", bstock=").append(bstock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}