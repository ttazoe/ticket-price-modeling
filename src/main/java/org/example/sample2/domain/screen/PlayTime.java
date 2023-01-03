package org.example.sample2.domain.screen;

import java.time.LocalDateTime;

public class PlayTime {
    final LocalDateTime time;

    public PlayTime(LocalDateTime time) {
        this.time = time;
    }

    boolean isLateShow() {
        if (time.getHour() >= 20) return true;
        return false;
    }
}
