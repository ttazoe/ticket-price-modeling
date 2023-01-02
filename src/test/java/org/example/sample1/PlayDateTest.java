package org.example.sample1;

import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PlayDateTest {
    /**
     * Case 1 : 2022/12/31 Sat : True
     * Case 2 : 2023/1/1 Sun : True
     * Case 3 : 2023/1/2 Mon : False
     * Case 4 : 2023/1/3 Tue : False
     * Case 5 : 2023/1/4 Wed : False
     * Case 6 : 2023/1/5 Thu : False
     * Case 7 : 2023/1/6 Fri : False
     * Case 8 : 2023/11/23 : True (JP Holiday & Weekday)
     *
     */
    @Test
    public void testIsHoliday(){
        PlayDate satPlayDate = new PlayDate(LocalDateTime.of(2022,12,31,20,00));
        PlayDate sunPlayDate = new PlayDate(LocalDateTime.of(2023,1,22,20,00));
        PlayDate monPlayDate = new PlayDate(LocalDateTime.of(2023,1,2,20,00));
        PlayDate tuePlayDate = new PlayDate(LocalDateTime.of(2023,1,3,20,00));
        PlayDate wedPlayDate = new PlayDate(LocalDateTime.of(2023,1,4,20,00));
        PlayDate thuPlayDate = new PlayDate(LocalDateTime.of(2023,1,5,20,00));
        PlayDate friPlayDate = new PlayDate(LocalDateTime.of(2023,1,6,20,00));
        PlayDate publicHolidayPlayDate = new PlayDate(LocalDateTime.of(2023,11,23,20,00));

        // Normal weekday test
        assertTrue(satPlayDate.isHoliday());
        assertTrue(sunPlayDate.isHoliday());
        assertFalse(monPlayDate.isHoliday());
        assertFalse(tuePlayDate.isHoliday());
        assertFalse(wedPlayDate.isHoliday());
        assertFalse(thuPlayDate.isHoliday());
        assertFalse(friPlayDate.isHoliday());

        // Public holiday test
        // TODO : 成人の日、体育の日
        assertTrue(publicHolidayPlayDate.isHoliday());
    }

    @Test
    /**
     * Case 1 : 2023/2/1 : True
     * Case 2:  2023/10/5 : False
     */
    public void testIsMovieDay(){
        PlayDate movieDay = new PlayDate(LocalDateTime.of(2023,2,1,20,00));
        PlayDate notMovieDay = new PlayDate(LocalDateTime.of(2023,10,5,20,00));

        assertTrue(movieDay.isMovieDay());
        assertFalse(notMovieDay.isMovieDay());
    }


}