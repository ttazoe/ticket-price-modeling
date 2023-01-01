package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PlayTimeTest {
    @Test
    public void isLateShow(){
        PlayTime lateShow1 = new PlayTime(LocalDateTime.of(2022,12,30,20,00));
        PlayTime lateShow2 = new PlayTime(LocalDateTime.of(2022,12,30,23,59));
        PlayTime notlateShow1 = new PlayTime(LocalDateTime.of(2022,12,30,5,01));
        PlayTime notLateShow2 = new PlayTime(LocalDateTime.of(2022,12,30,19,59));

        assertTrue(lateShow1.isLateShow());
        assertTrue(lateShow2.isLateShow());
        assertFalse(notlateShow1.isLateShow());
        assertFalse(notlateShow1.isLateShow());
    }

}