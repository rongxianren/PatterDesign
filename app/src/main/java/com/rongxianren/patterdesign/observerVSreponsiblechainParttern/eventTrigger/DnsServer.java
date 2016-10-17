package com.rongxianren.patterdesign.observerVSreponsiblechainParttern.eventTrigger;

import com.rongxianren.patterdesign.observerVSreponsiblechainParttern.Recorder;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * Created by wty on 16/10/15.
 */

public abstract class DnsServer extends Observable implements Observer {

    @Override
    public void update(Observable observable, Object data) {
        Recorder recorder = (Recorder) data; //
        if (isLocal(recorder)) {
            recorder.setIp(genIpAddress());
        } else {//             DNS
            responsFromUpperServer(recorder);
        }
        sign(recorder);
    }


    public void setUpperServer(DnsServer dnsServer) {
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    private void responsFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }


    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);


    private String genIpAddress() {
        Random rand = new Random();
        String address = rand.nextInt(255) + "." + rand.nextInt(255) + "." + rand.nextInt(255) + "." + rand.nextInt(255);
        return address;
    }
}
