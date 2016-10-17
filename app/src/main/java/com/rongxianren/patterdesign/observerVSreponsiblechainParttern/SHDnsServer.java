package com.rongxianren.patterdesign.observerVSreponsiblechainParttern;

/**
 * Created by wty on 16/10/14.
 */

public class SHDnsServer extends DnsServer {


    @Override
    protected boolean isLocal(String domain) {
        if (domain.endsWith(".sh.cn")) {
            return true;
        }
        return false;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海解析站");
        return recorder;
    }
}
