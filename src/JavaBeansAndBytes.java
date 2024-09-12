import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    CoffeeDrink latte;
    CoffeeDrink mocha;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        /** Update the year founded and print the new yearFounded in a sentence**/

        yearFounded = 1008;
        System.out.println("Just kidding! We were actually founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        /** Add parameter to specialOfTheDay (drink of your choice)**/
        specialOfTheDay("Hot Chocolate");
        countCups();
        baristasChoice();


        // TODO
        /** Create two CoffeeDrink objects**/

        latte = new CoffeeDrink(1, "milk", false);
        mocha = new CoffeeDrink(2,"chocolate", true);

        // TODO
        /** Print out the order details**/

        latte.printInfo();
        mocha.printInfo();

    }

    // Method to generate a random discount
    public void randomDiscount() {
        int randomNum;
        randomNum = (int)(Math.random()*31);
        System.out.println("Whoop whoop! You got a "+randomNum+"% discount on your order today!");

        // TODO
        /** Make this method generate a random integer discount (0-30%)
        // and print the result.**/
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        System.out.println("Today's special is "+special);
        // TODO
        /** Make this method accept a parameter representing the day’s special.
        Print the day's special.**/
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        for(int x=1; x<=5; x=x+1){
            System.out.print(x+", ");
        }
        System.out.println();
        for(int x=2; x<=11; x=x+3){
            System.out.println(x);
        }
        for(int x=8; x>=0; x=x-1){
            System.out.println(x);
        }
        // TODO
        /** Write three different for loops that print the indicated numbers:
        // Print 1 to 5
        // Print 2, 5, 8, 11
        // Print 8 to 0**/
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        double randomNumber;
        randomNumber = Math.random();

        if(randomNumber<=.25){
            System.out.println("The barista recommends an iced mocha!");
        }
        if(randomNumber>.25&&randomNumber<=0.5){
            System.out.println("The barista recommends a matcha!");
        }
        if(randomNumber>0.5&&randomNumber<=0.75){
            System.out.println("The barista recommends the daily special!");
        }
        if(randomNumber>0.75){
            System.out.println("The barista recommends a latte!");
        }

        // TODO
        /** Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.**/
    }
}

