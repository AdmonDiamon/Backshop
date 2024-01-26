package org.admon.cake;

import org.admon.oven.ChimneyCakeOven;
import org.junit.jupiter.api.Test;
import org.admon.cake.Cake;
import org.admon.cake.Flavour;
import static org.junit.jupiter.api.Assertions.*;

class ChimneyCakeOvenTest {

    @Test
    void testChimneyCakeOven() {
        ChimneyCakeOven oven = new ChimneyCakeOven();
        Cake cake = oven.bakeCake(Flavour.STRAWBERRY);

        assertEquals(255, cake.getPrice()); // 2 euros base price + 55 cents for strawberry
    }
}
