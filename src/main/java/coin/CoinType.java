package coin;

public enum CoinType {

    ONEPENCE (1),
    TWOPENCE (2),
 FIVEPENCE (5),
 TENPENCE (10),
 TWENTYPENCE (20),
 FIFTYPENCE (50),
 ONEPOUND (100),
 TWOPOUND (200);

 private final int coinValue;
    CoinType (int coinValue) {
        this.coinValue = coinValue;
    }

    public int getCoinValue () {
        return coinValue;
    }



}
