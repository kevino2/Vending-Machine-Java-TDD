package vendingMachine;

import coin.Coin;
import coin.CoinReturn;
import drawer.Drawer;
import drawer.DrawerCode;
import product.Product;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer>drawers;
    private ArrayList<Coin>enteredCoins;
    private CoinReturn coinReturn;

    public VendingMachine () {
        drawers = new ArrayList<Drawer>();
        enteredCoins = new ArrayList<Coin>();
        coinReturn = new CoinReturn();
    }

//    public void addDrawer (Drawer drawer) {
//        this.drawers.add(drawer);
//    }

    public void addCoin (Coin coin) {
        if (coin.getCoinValue() > 2) {
            this.enteredCoins.add(coin);
        } else {
            this.coinReturn.addCoin(coin);
        }
    }


    public int getEnteredCoinsValue() {
        int total = 0;
        for (Coin coin : this.enteredCoins) {
            total += coin.getCoinValue();
        } return total;
    }

    public int getCoinReturnValue() {
       return coinReturn.getTotalValue();
    }

    public Product DispenseProduct (DrawerCode drawerCode) {
        for (Drawer drawer : drawers) {
            if (drawerCode == drawer.getDrawerCode()) {
                return drawer.returnProduct();
            }
        } return null;
    }

    public int getPrice (DrawerCode drawerCode) {
        for (Drawer drawer : drawers) {
            if (drawerCode == drawer.getDrawerCode()) {
                return drawer.getPrice();
            }
        } return null;
    }

    public void makePurchase () {
        if (this.getEnteredCoinsValue() >= drawer.getPrice());
    }



}


//
//    Create a Vending Machine class with a list of drawers, list of coins entered and coin return.
//        Write a method to add a coin to the machine.
//        Write a method to check if coin is valid.
//        Amend addCoin method to check if coin is valid and if not add the coin to the coin return.
//        Write a method to buy product taking in a code. If there is enough money to buy selected product.
//        If there is enough money then the vend method is called and will return the product and set the credit to 0.00.