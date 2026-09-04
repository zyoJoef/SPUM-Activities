package com.mycompany.timeclient;

import java.time.LocalDateTime;

public interface TimeClient {
    void updateTime(LocalDateTime currentTime);
}