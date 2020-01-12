package com.company;

public class Main {

    public static void main(String[] args) {

        Dubai dubai =new Dubai();

        System.out.println("departure day from Bishkek to Dubai is Monday"   +    " "
                + "arrival day in Dubai from Bishkek is Saturday " +    " "
                + "and weather is " + "+" +40 + "in Dubai");
        dubai.buyGifts(200);
        dubai.buyGifts("For_Mother_and_Brother");

        London London = new London (+10);
        System.out.println("the weather in  London is "+" 10");

    }
}
