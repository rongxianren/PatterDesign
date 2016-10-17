package com.rongxianren.patterdesign.observerVSreponsiblechainParttern;

/**
 * Created by wty on 16/10/14.
 */

public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        if (domain.endsWith(".cn")) {
            return true;
        }
        return false;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("DNS中国解析站");
        return recorder;
    }
}
