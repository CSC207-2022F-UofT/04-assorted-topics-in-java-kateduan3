/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
class DrivableTrader extends Trader<Drivable>{

    public DrivableTrader(int money) {
        super(money);
    }
    private Drivable inventory;
    private Drivable wishlist;
    private int money;

    public int getSellingPrice(Drivable d){
        if (d instanceof Tradable){
            return (((Tradable) d).getPrice() + d.getMaxSpeed());
        }

        return Tradable.MISSING_PRICE;

    }


}
