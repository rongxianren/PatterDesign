package com.rongxianren.patterdesign.observerVSreponsiblechainParttern;

/**
 * Created by wty on 16/10/14.
 */

public class TopDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("DNS全球顶级解析站");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return true;
    }
}
