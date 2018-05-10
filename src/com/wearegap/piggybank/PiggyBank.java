package com.wearegap.piggybank;

/**
 *
 * @author David Cardona
 */
public class PiggyBank {
    
    int coin50, coin100, coin200, coin500, coin1000;
    double total;
    
    public PiggyBank() {
        
        coin50 = 0;
        coin100 = 0;
        coin200 = 0;
        coin500 = 0;
        coin1000 = 0;
        total = 0;
    }
    
    public void insertCoins(int c50, int c100, int c200, int c500, int c1000) {
        
        coin50 += c50;
        coin100 += c100;
        coin200 += c200;
        coin500 += c500;
        coin1000 += c1000;
    }
    
    public double calculateTotals() {
        
        total = (coin50 * 50) + (coin100 * 100) + (coin200 * 200) + (coin500 * 500) + (coin1000 * 1000);
        return total;
    }

    public int getCoin50() {
        return coin50;
    }

    public void setCoin50(int coin50) {
        this.coin50 = coin50;
    }

    public int getCoin100() {
        return coin100;
    }

    public void setCoin100(int coin100) {
        this.coin100 = coin100;
    }

    public int getCoin200() {
        return coin200;
    }

    public void setCoin200(int coin200) {
        this.coin200 = coin200;
    }

    public int getCoin500() {
        return coin500;
    }

    public void setCoin500(int coin500) {
        this.coin500 = coin500;
    }

    public int getCoin1000() {
        return coin1000;
    }

    public void setCoin1000(int coin1000) {
        this.coin1000 = coin1000;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
