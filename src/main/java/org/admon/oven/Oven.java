package org.admon.oven;

import org.admon.cake.Cake;
import org.admon.cake.Flavour;

/**
 * Interface representing an oven that can bake cakes.
 */
public interface Oven {

    /**
     * Bakes a cake with the specified flavour.
     *
     * @param flavour The flavour of the cake to be baked.
     * @return A Cake instance baked in this oven.
     */
    Cake bakeCake(Flavour flavour);
}
