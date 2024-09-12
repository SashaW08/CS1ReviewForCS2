// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;


    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pnumberOfCups, String pflavor, boolean phasWhippedCream) {
        numberOfCups=pnumberOfCups;
        flavor=pflavor;
        hasWhippedCream=phasWhippedCream;


        // TODO
        /** Edit this constructor to accept three parameters,**/
        /** one for each CoffeeDrink variable.**/
        /** Assign those parameter values to the class-wide variables.**/
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {

        System.out.println("Your order includes "+numberOfCups+" cups with "+flavor+" flavor and it is "+hasWhippedCream+" that it has whipped cream");

        // TODO
        /** Make this method print order details.
        // Include information stored in each variable.**/

    }
}
