package com.tjetc.entity;

public class Product {
    private String pId;//商品Id
    private String pName;//商品名称
    private double pPrice;//商品单价
    private int pCount;//商品数量
    private String pImag;//商品图片
    private String pBriefly;//商品简介
    private String pdetails;//商品详情
    private String ptype;//商品类别


    public Product() {
    }
    public Product(String pId, String pName, double pPrice, int pCount, String pImag, String pBriefly, String pdetails, String ptype) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pCount = pCount;
        this.pImag = pImag;
        this.pBriefly = pBriefly;
        this.pdetails = pdetails;
        this.ptype = ptype;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pCount=" + pCount +
                ", pImag='" + pImag + '\'' +
                ", pBriefly='" + pBriefly + '\'' +
                ", pdetails='" + pdetails + '\'' +
                ", ptype='" + ptype + '\'' +
                '}';
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public int getpCount() {
        return pCount;
    }

    public void setpCount(int pCount) {
        this.pCount = pCount;
    }

    public String getpImag() {
        return pImag;
    }

    public void setpImag(String pImag) {
        this.pImag = pImag;
    }

    public String getpBriefly() {
        return pBriefly;
    }

    public void setpBriefly(String pBriefly) {
        this.pBriefly = pBriefly;
    }

    public String getPdetails() {
        return pdetails;
    }

    public void setPdetails(String pdetails) {
        this.pdetails = pdetails;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
}

