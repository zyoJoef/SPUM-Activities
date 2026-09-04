package com.mycompany.timeclient;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TimeServer {

    private List<TimeClient> clients = new ArrayList<>();

    public void registerClient(TimeClient client) {
        clients.add(client);
    }

    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (TimeClient client : clients) {
            client.updateTime(now);
        }
    }

    public static void main(String[] args) {
        TimeServer server = new TimeServer();

        TimeClient clock = new DigitalClockClient();
        TimeClient logger = new LoggerClient();

        server.registerClient(clock);
        server.registerClient(logger);

        server.notifyClients();
    }
}