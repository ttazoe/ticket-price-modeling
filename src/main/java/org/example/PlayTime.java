package org.example;

import java.time.LocalDateTime;

public class PlayTime {
    private final LocalDateTime time;

    public PlayTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isLateShow() {
        if (time.getHour() >= 20) return true;
        return false;
    }
}
