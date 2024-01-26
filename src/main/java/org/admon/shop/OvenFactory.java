package org.admon.shop;

import org.admon.oven.Oven;
import org.admon.oven.ChimneyCakeOven;
import org.admon.oven.PancakeOven;

/**
 * Factory class for creating different types of ovens.
 */
public class OvenFactory {

    /**
     * Creates a new PancakeOven.
     *
     * @param hasOil Indicates if the oven has oil.
     * @return A new instance of PancakeOven.
     */
    public Oven createPancakeOven(boolean hasOil) {
        return new PancakeOven(hasOil);
    }

    /**
     * Creates a new ChimneyCakeOven.
     *
     * @return A new instance of ChimneyCakeOven.
     */
    public Oven createChimneyCakeOven() {
        return new ChimneyCakeOven();
    }
}
