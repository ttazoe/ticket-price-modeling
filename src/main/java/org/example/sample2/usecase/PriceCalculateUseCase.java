package org.example.sample2.usecase;

import org.example.sample2.domain.audience.Audience;
import org.example.sample2.domain.price.Price;
import org.example.sample2.domain.price.PriceCategory;
import org.example.sample2.domain.screen.Screen;
import org.example.sample2.domain.screen.ScreenDateTimeType;

public class PriceCalculateUseCase {
    public Price run(Audience audience, Screen screen){
        PriceCategory priceCategory = audience.getCategory();
        ScreenDateTimeType screenDateTimeType = screen.getScreenDateTimeType();
        return priceCategory.calcPrice(screenDateTimeType);
    }
}
