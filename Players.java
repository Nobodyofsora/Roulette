package Roulette;

import java.util.ArrayList;

public class Players {
    private String name;
    public double credit;
    private int bet; // odd number: 37/ even number: 38 / number 0-36 / red / black
    private int moneyBet;
    public int win;

    public Players(String name, double credit) {
        this.name = name;
        this.credit = credit;
        this.win=0;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet, int money) {
        this.bet = bet;
        this.moneyBet= money;
    }

    public int getMoneyBet() {
        return moneyBet;
    }

    @Override
    public String toString() {
        return  name +
                "\n Credit =" + credit +
                "\n}" +
                "";
    }
}
