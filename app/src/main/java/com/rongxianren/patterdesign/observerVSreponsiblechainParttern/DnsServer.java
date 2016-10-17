package com.rongxianren.patterdesign.observerVSreponsiblechainParttern;

import java.util.Random;

/**
 * Created by wty on 16/10/14.
 */

public abstract class DnsServer {
    private DnsServer upperServer;


    public Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            recorder = this.upperServer.resolve(domain);
        }
        return recorder;
    }

    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    protected abstract boolean isLocal(String domain);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setDomain(domain);
        recorder.setIp(getIpAddress());
        return recorder;
    }

    private String getIpAddress() {
        Random rand = new Random();
        String address = rand.nextInt(255) + "." + rand.nextInt(255) + "." + rand.nextInt(255) + "." + rand.nextInt(255);
        return address;
    }
}
