package org.admon.shop;


import org.admon.cake.Flavour;
import org.admon.oven.ChimneyCakeOven;
import org.admon.oven.Oven;
import org.admon.oven.PancakeOven;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CakeShopTest {
    static Stream<Object[]> dataProvider() {
        return Stream.of(
                new Object[]{new PancakeOven(true), Flavour.PLAIN, "1,00 €"},
                new Object[]{new PancakeOven(true), Flavour.VANILLA, "1,30 €"},
                new Object[]{new ChimneyCakeOven(), Flavour.CHOCOLATE, "2,40 €"},
                new Object[]{new ChimneyCakeOven(), Flavour.STRAWBERRY, "2,55 €"}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testSellCake(Oven oven, Flavour flavour, String expectedIncome) {
        CakeShop shop = new CakeShop();
        shop.sellCake(oven, flavour);

        assertEquals(expectedIncome, shop.getCost());
    }
}
