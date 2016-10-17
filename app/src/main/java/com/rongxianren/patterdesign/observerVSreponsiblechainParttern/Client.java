package com.rongxianren.patterdesign.observerVSreponsiblechainParttern;

import java.util.Scanner;

/**
 * Created by wty on 16/10/14.
 */

public class Client {
    public static void main(String[] args) {
        DnsServer shDnsServer = new SHDnsServer();
        DnsServer chianServer = new ChinaTopDnsServer();
        DnsServer topDnsServer = new TopDnsServer();
        shDnsServer.setUpperServer(chianServer);
        chianServer.setUpperServer(topDnsServer);
        while (true) {
            System.out.println("\n请输入域名(输入N退出):");
            Scanner scanner = new Scanner(System.in);
            String domain = scanner.nextLine();
            System.out.println(domain);
            if (domain.equalsIgnoreCase("n")) {
                return;
            }
            Recorder recorder = shDnsServer.resolve(domain);
            System.out.println(recorder);
        }
    }
}
