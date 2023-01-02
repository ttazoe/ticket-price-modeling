package org.example.sample2.domain.screen;

public class Screen {
    final PlayDate playDate;
    final PlayTime playTime;

    public Screen(final PlayDate playDate, final PlayTime playTime) {
        this.playDate = playDate;
        this.playTime = playTime;
    }

    public ScreenDateTimeType getScreenDateTimeType(){
        if (playDate.isMovieDay()) return ScreenDateTimeType.MOVIEDAY;
        if (playDate.isHoliday()) {
            if(playTime.isLateShow()) return ScreenDateTimeType.HOLIDAY_LATE;
            if(!playTime.isLateShow()) return ScreenDateTimeType.HOLIDAY_REGULAR;
        }
        if (playDate.isWeekday()) {
            if(playTime.isLateShow()) return ScreenDateTimeType.WEEKDAY_LATE;
            if(!playTime.isLateShow()) return ScreenDateTimeType.WEEKDAY_REGULAR;
        }
        return ScreenDateTimeType.UNKNOWN;
    }
}
