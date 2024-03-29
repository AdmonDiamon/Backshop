package org.admon.oven;

import org.admon.cake.Cake;
import org.admon.cake.Flavour;

/**
 * Oven implementation for baking chimney cakes.
 */
public class ChimneyCakeOven implements Oven{

    /**
     * Bakes a cake with the specified flavour.
     *
     * @param flavour The flavour of the cake to be baked.
     * @return A new Cake instance with the specified flavour and a base price.
     */
    @Override
    public Cake bakeCake(Flavour flavour) {
        return new Cake(flavour, 200);
    }
}
