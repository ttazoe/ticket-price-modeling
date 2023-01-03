package org.example.sample2.usecase;

import org.example.sample2.domain.audience.Age;
import org.example.sample2.domain.audience.Audience;
import org.example.sample2.domain.audience.Sex;
import org.example.sample2.domain.audience.StudentCategory;
import org.example.sample2.domain.price.Price;
import org.example.sample2.domain.screen.Screen;
import org.junit.jupiter.api.Test;
import org.example.sample2.domain.screen.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculateUseCaseTest {
    @Test
    public void testRun(){
        Audience audience = new Audience(
                new Age(20),
                Sex.MALE,
                StudentCategory.NONE,
                true,
                false
                );

        Screen screen = new Screen(
                new PlayDate(LocalDateTime.of(2023,1,1,20,15)),
                new PlayTime(LocalDateTime.of(2023,1,1,20,15)));

        PriceCalculateUseCase priceCalculateUseCase = new PriceCalculateUseCase();
        assertTrue(priceCalculateUseCase.run(audience, screen).equals(new Price(1100)));
    }

}