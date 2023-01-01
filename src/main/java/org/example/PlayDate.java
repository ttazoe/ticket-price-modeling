package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class PlayDate {
    private final LocalDateTime date;

    public PlayDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isHoliday(){
        // Sunday or Saturday
        DayOfWeek dayOfWeek = this.date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY) return true;

        // Public holiday
        if (PublicHolidays.isPublicHolidays(date)) return true;

        // 振替休日
        return false;
    }

    public boolean isMovieDay() {
        if (date.getDayOfMonth() == 1) return true;
        return false;
    }

}
