package com.rongxianren.patterdesign.observerVSreponsiblechainParttern;

/**
 * Created by wty on 16/10/14.
 */

public class Recorder {
    private String domain;
    private String ip;
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "域名: " + domain + "\np地址: " + ip + "\nDNS解析站: " + owner;
    }
}
