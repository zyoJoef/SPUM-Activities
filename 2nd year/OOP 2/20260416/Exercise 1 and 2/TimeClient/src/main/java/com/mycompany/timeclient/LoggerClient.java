package com.mycompany.timeclient;

import java.time.LocalDateTime;

public class LoggerClient implements TimeClient {

    @Override
    public void updateTime(LocalDateTime currentTime) {
        System.out.println("Logging time: " + currentTime);
    }
}