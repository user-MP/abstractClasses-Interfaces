package org.example.interfaces;

import java.time.LocalDateTime;

public interface ServerNotify {
    void setCurrentDateWithTime(int day, int month, int year, int hour, int        minute, int second);
    LocalDateTime getLastDateNotify();
    LocalDateTime getCurrentDateWithTime();

}
