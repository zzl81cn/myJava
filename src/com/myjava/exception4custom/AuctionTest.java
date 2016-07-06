package com.myjava.exception4custom;

/**
 * Created by zhouzilong on 2016/7/6.
 */
public class AuctionTest {
    private double initPrice = 30.0;
    public void bid(String bidPrice) throws AuctionException {
        double d = 0.0;
        try {
            d = Double.parseDouble(bidPrice);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AuctionException("no decimal");
        }
        if (initPrice > d) {
            throw new AuctionException("Bid price is low than initPrice.");
        }
        initPrice = d;
    }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try {
//            at.bid("df");
            at.bid("29.0");
        } catch (AuctionException ae){
            System.err.println(ae.getMessage());
        }
    }
}
