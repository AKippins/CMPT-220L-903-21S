package base;

public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;
    static int lemonade_price = 8;
    static int pretzel_price = 2;


    public static void main(String[] args) {
        //	Replace this with your dry inventory function!
        //	wet_inventory();
        dry_inventory();
    }

    /**
     * Is it here? Whatever I put here will show up when I hover over the function.
     */
    static void dry_inventory() {
        /**
         * If I put a description here
         */
        int[][] customerData = {
            {4,1,4},
            {2,3,0},
            {3,0,0},
            {1,2,0},
            {0,6,10},
            {0,4,5},
            {2,0,0},
            {10,8,10},
            {6,0,0},
            {0,1,0},
            {1,0,0},
            {0,7,4},
            {2,0,0},
            {6,3,0},
            {9,2,3}
        };

        for (int[] customer: customerData){
            itemsPurchased(customer[0], customer[1], customer[2]);
        }
//         // Customer 1
//         itemsPurchased(4,1,4);
//
//         // Customer 2
//         itemsPurchased(2,3,0);
//
//         // Customer 3
//         itemsPurchased(3,0,0);
//
//         // Customer 4
//         itemsPurchased(1,2,0);
//
//         // Customer 5
//         itemsPurchased(0,6,10);
//
//         // Customer 6
//         itemsPurchased(0,4,5);
//
//         // Customer 7
//         itemsPurchased(2,0,0);
//
//         // Customer 8
//         itemsPurchased(10,8,10);
//
//         // Customer 9
//         itemsPurchased(6,0,0);
//
//         // Customer 10
//         itemsPurchased(0,1,0);
//
//         // Customer 11
//         itemsPurchased(1,0,0);
//
//         // Customer 12
//         itemsPurchased(0,7,4);
//
//         // Customer 13
//         itemsPurchased(2,0,0);
//
//         // Customer 14
//         itemsPurchased(6,3,0);
//
//         // Customer 15
//         itemsPurchased(9,2,3);

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }

    static void itemsPurchased(int pretzel_purchased, int lemonades_purchased, double tip){
        cash += pretzel_purchased * pretzel_price;
        pretzels_available -= pretzel_purchased;

        cash += lemonades_purchased * lemonade_price;
        lemonades_available -= lemonades_purchased;

        tips += tip;
    }

    static void wet_inventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */
        //Customer 1
        pretzels_available -= 4;
        cash += 8;
        lemonades_available -= 1;
        cash += 8;
        tips += 4;

        //Customer 2
        pretzels_available -= 2;
        cash += 4;
        lemonades_available -= 3;
        cash += 24;

        //Customer 3
        pretzels_available -= 3;
        cash += 6;

        //Customer 4
        pretzels_available -= 1;
        cash += 2;
        lemonades_available -= 2;
        cash += 16;

        //Customer 5
        lemonades_available -= 6;
        cash += 48;
        tips += 10;

        //Customer 6
        lemonades_available -= 4;
        cash += 32;
        tips += 5;

        //Customer 7
        pretzels_available -= 2;
        cash += 4;

        //Customer 8
        pretzels_available -= 10;
        cash += 20;
        lemonades_available -= 8;
        cash += 64;
        tips += 10;

        //Customer 9
        pretzels_available -= 6;
        cash += 12;

        //Customer 10
        lemonades_available -= 1;
        cash += 8;

        //Customer 11
        pretzels_available -= 1;
        cash += 2;

        //Customer 12
        lemonades_available -= 7;
        cash += 56;
        tips += 4;

        //Customer 13
        pretzels_available -= 2;
        cash += 4;

        //Customer 14
        pretzels_available -= 6;
        cash += 12;
        lemonades_available -= 3;
        cash += 24;

        //Customer 15
        pretzels_available -= 9;
        cash += 18;
        lemonades_available -= 2;
        cash += 16;
        tips += 3;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}
