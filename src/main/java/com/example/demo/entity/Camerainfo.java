package com.example.demo.entity;

public class Camerainfo {
    private Long id;

    private Integer cameranum;

    private String cameraip;

    private Integer cameraport;

    private String camerauser;

    private String camerapassword;

    private Integer lanenum;

    private String pilenum;

    private String brand;

    private Integer pixel;

    private String resolution;

    private String shootposition;

    private String status;

    private String isonline;

    private Integer master;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCameranum() {
        return cameranum;
    }

    public void setCameranum(Integer cameranum) {
        this.cameranum = cameranum;
    }

    public String getCameraip() {
        return cameraip;
    }

    public void setCameraip(String cameraip) {
        this.cameraip = cameraip == null ? null : cameraip.trim();
    }

    public Integer getCameraport() {
        return cameraport;
    }

    public void setCameraport(Integer cameraport) {
        this.cameraport = cameraport;
    }

    public String getCamerauser() {
        return camerauser;
    }

    public void setCamerauser(String camerauser) {
        this.camerauser = camerauser == null ? null : camerauser.trim();
    }

    public String getCamerapassword() {
        return camerapassword;
    }

    public void setCamerapassword(String camerapassword) {
        this.camerapassword = camerapassword == null ? null : camerapassword.trim();
    }

    public Integer getLanenum() {
        return lanenum;
    }

    public void setLanenum(Integer lanenum) {
        this.lanenum = lanenum;
    }

    public String getPilenum() {
        return pilenum;
    }

    public void setPilenum(String pilenum) {
        this.pilenum = pilenum == null ? null : pilenum.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }

    public String getShootposition() {
        return shootposition;
    }

    public void setShootposition(String shootposition) {
        this.shootposition = shootposition == null ? null : shootposition.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsonline() {
        return isonline;
    }

    public void setIsonline(String isonline) {
        this.isonline = isonline == null ? null : isonline.trim();
    }

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }
}