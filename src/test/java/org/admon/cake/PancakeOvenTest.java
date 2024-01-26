package org.admon.cake;

import org.junit.jupiter.api.Test;
import org.admon.cake.Cake;
import org.admon.cake.Flavour;
import org.admon.oven.PancakeOven;
import static org.junit.jupiter.api.Assertions.*;

class PancakeOvenTest {

    @Test
    void testPancakeOvenWithOil() {
        PancakeOven oven = new PancakeOven(true);
        Cake cake = oven.bakeCake(Flavour.VANILLA);

        assertEquals(130, cake.getPrice()); // 1 euro base price + 30 cents for vanilla
    }

    @Test
    void testPancakeOvenWithoutOil() {
        PancakeOven oven = new PancakeOven(false);

        assertThrows(IllegalStateException.class, () -> oven.bakeCake(Flavour.CHOCOLATE));
    }
}
