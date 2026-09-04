package com.mycompany.timeclient;

import java.time.LocalDateTime;

public class DigitalClockClient implements TimeClient {

    @Override
    public void updateTime(LocalDateTime currentTime) {
        System.out.println("Digital Clock updated: " + currentTime);
    }
}