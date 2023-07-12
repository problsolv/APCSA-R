/**
 * @author Simon Chung
 * @version 05/31/2022
 * @purpose This program converts an amount of money from a specific country into the equivalent
 * currency of another country given the current exchange rate.
 */
public class M01_13Currency {
    public static void main(String [ ] args) {
        double startingUsDollars = 6500.00;

        // Mexico Variables (found in the example)
        double pesosSpent = 7210.25;
        double pesoExchangeRate = 19.57852;
        double dollarsSpentInMexico;
        double dollarsAfterMexico;

        // Hong Kong Variables (found on https://www.exchangerate.com)
        double hkdSpent = 5030.2;
        double hkdExchangeRate = 7.85;
        double dollarsSpentInHK;
        double dollarsAfterHK;

        // Great Britain Variables (found on https://www.bankofamerica.com/foreign-exchange/foreign-currency-exchange/)
        double ukSpent = 543.52;
        double ukExchangeRate = 0.79;
        double dollarsSpentInUK;
        double dollarsAfterUK;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("This program converts an amount of money\n");
        System.out.println("from a specific country into the equivalent");
        System.out.print("currency of another country given the current\n");
        System.out.print("exchange rate.\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();


        System.out.println("Starting US Dollars:\t$" + startingUsDollars + "\n");

        // For Mexico
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = 6500 - dollarsSpentInMexico;
        System.out.println("Mexico:");
        System.out.println("Pesos spent:\t\t\t₱" + pesosSpent);
        System.out.println("US Dollars Equivalent:\t$" + dollarsSpentInMexico);
        System.out.println("US Dollars Remaining:\t$" + dollarsAfterMexico + "\n");

        // For Hong Kong
        dollarsSpentInHK = hkdSpent / hkdExchangeRate;
        dollarsAfterHK = dollarsAfterMexico - dollarsSpentInHK;
        System.out.println("Hong Kong:");
        System.out.println("Hong Kong Dollars spent: $" + hkdSpent);
        System.out.println("US Dollars Equivalent: \t $" + dollarsSpentInHK);
        System.out.println("US Dollars Remaining:\t $" + dollarsAfterHK + "\n");

        // For Great Britain
        dollarsSpentInUK = ukSpent / ukExchangeRate;
        dollarsAfterUK = dollarsAfterHK - dollarsSpentInUK;
        System.out.println("Great Britain:");
        System.out.println("British Pounds spent: \t £" + ukSpent);
        System.out.println("US Dollars Equivalent: \t $" + dollarsSpentInUK);
        System.out.println("US Dollars Remaining: \t $" + dollarsAfterUK + "\n");

        // Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println("(all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //Calculations for Souvenir #1
        int costItem1 = 12, budget1 = 100, totalItems1 = (budget1 / costItem1), fundsRemaining1 = budget1 % costItem1;

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $" + budget1);
        System.out.println("   Total items purchased: " + totalItems1);
        System.out.println("   Funds remaining: $"  + fundsRemaining1 + "\n");

        //Calculations for Souvenir #2
        double costItem2 = 29.99;
        int budget2 = 500, totalItems2 = (int) (budget2 / costItem2);
        double fundsRemaining2 = budget2 % costItem2;

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $" + budget2);
        System.out.println("   Total items purchased: " + totalItems2);
        System.out.println("   Funds remaining: $" + String.format("%.02f", fundsRemaining2));
    }
}