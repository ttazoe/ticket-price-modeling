package org.example.sample2.domain.price;

import org.example.sample2.domain.screen.ScreenDateTimeType;

public enum PriceCategory {
    CINEMACITIZEN_REGULAR(1000, 1000, 1300, 1000, 1100),
    CINEMACITIZEN_OVER60(1000, 1000, 1000, 1000, 1000),

    REGULAR(1900, 1400, 1900, 1400, 1200),

    SENIOR(1200, 1200, 1200, 1200, 1200),

    UNIVERSITY_STUDENT(1500, 1400, 1500, 1400, 1200),
    HIGHSCHOOL_STUDENT(1000, 1000, 1000, 1000, 1000),
    JUNIORHIGHSCHOOL_STUDENT(1000, 1000, 1000, 1000, 1000),
    ELEMENTARYSCHOOL_STUDENT(1000, 1000, 1000, 1000, 1000),
    HANDICAPPED_OVER_HIGHSCHOOL(1000, 1000, 1000, 1000, 1000),
    HANDICAPPED_UNDER_HIGHSHCHOOL(900, 900, 900, 900, 900);

    final int weekdayRegular;
    final int weekdayLate;
    final int holidayRegular;
    final int holidayLate;
    final int movieday;

    PriceCategory(final int weekdayRegular,
                  final int weekdayLate,
                  final int holidayRegular,
                  final int holidayLate,
                  final int movieday) {
        this.weekdayRegular = weekdayRegular;
        this.weekdayLate = weekdayLate;
        this.holidayRegular = holidayRegular;
        this.holidayLate = holidayLate;
        this.movieday = movieday;
    }

    public Price calcPrice(ScreenDateTimeType screenDateTimeType) {
        switch (screenDateTimeType) {
            case WEEKDAY_REGULAR:
                return new Price(this.weekdayRegular);
            case WEEKDAY_LATE:
                return new Price(this.weekdayLate);
            case HOLIDAY_REGULAR:
                return new Price(this.holidayRegular);
            case HOLIDAY_LATE:
                return new Price(this.holidayLate);
            case MOVIEDAY:
                return new Price(this.movieday);
        }
        throw new IllegalArgumentException("Unknown ScreenDateTimeType");
    }
}
