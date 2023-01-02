package org.example.sample2.domain.screen;

import org.example.sample1.PublicHolidays;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PlayDate {
    final LocalDateTime date;

    PlayDate(LocalDateTime date) {
        this.date = date;
    }

    boolean isHoliday(){
        // Sunday or Saturday
        DayOfWeek dayOfWeek = this.date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY) return true;

        // Public holiday

        // 振替休日
        return false;
    }

    boolean isWeekday(){
        return !isHoliday();
    }

    boolean isMovieDay() {
        if (date.getDayOfMonth() == 1) return true;
        return false;
    }

}
