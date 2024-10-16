
/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

// Import InputMismatchException
import java.util.InputMismatchException;

// Import Scanner 
import java.util.Scanner;

// AdvancedPotionsClass class
public class AdvancedPotionsClass {
    // Make scanner
    private static Scanner scanner = new Scanner(System.in);

    // TODO: Add new ingredients DONE
    /*
     * Possible ingredients:
     * ("Bicorn Horn", 5)
     * ("Dragon Blood", 7)
     * ("Armadillo Bile", 10)
     * ("Wormwood Essence", 4)
     * ("Moonstone", 3)
     */

    // Make static Ingredients so they can be seen by the class
    static Ingredient bicornHorn = new Ingredient("Bicorn Horn", 5);
    static Ingredient dragonBlood = new Ingredient("Dragon Blood", 7);
    static Ingredient armadilloBile = new Ingredient("Armadillo Bile", 10);
    static Ingredient wormwoodEssence = new Ingredient("Wormwood Essence", 4);
    static Ingredient moonstone = new Ingredient("Moonstone", 3);

    // Set count variable called ingredientCount for control flow of select
    // Ingredients method
    public static int ingredientCount = 1;

    // Arguments
    public static void main(String[] args) {

        // TODO: Create a new potion Done
        Potion myPotion = new Potion(0, 0, 0);

        // TODO: Prompt the user about ingredient options DONE
        selectIngredients(myPotion);
        // TODO: Prompt the user to stir and heat the potion DOne
        stirPotion(myPotion);
        // Stir method done, now heat method
        heatPotion(myPotion);
        // Evauates potion (defined in potion class)

        // TODO: Evaluate the potion and print the result1 DONE
        myPotion.evaluatePotion();
        // TODO: uncomment DONE
        scanner.close();

    }

    // TODO: Implement selectIngredients(...) Done
    // Allow the user to choose ingredients
    // Prompt the user again for invalid choices
    public static void selectIngredients(Potion myPotion) {
        // Print statements
        System.out.println("Choose 4 ingredients to add to your potion:");
        System.out
                .println("(1) Bicorn Horn, (2) Dragon Blood, (3) Armadillo Bile, (4) Wormwood Essence, (5) Moonstone");
        // While statement with count variable
        while (ingredientCount < 5) {
            // try catch so we do not run into problems later with evauatePotion method
            try {
                System.out.println("Pick your ingredient NO." + ingredientCount);
                int userInput = scanner.nextInt();
                /*
                 * If statments used to check the user input
                 * Onec it gets the right one, it prints the choice
                 * It also adds the ingredent to the potion by incuring addIngredent method
                 * Lastly, it increments the count variable
                 */
                if (userInput == 1) {
                    System.out.println("Added to the potion:" + bicornHorn.getName());
                    myPotion.addIngredient(bicornHorn.getpotency());
                    ingredientCount++;
                } else if (userInput == 2) {
                    System.out.println("Added to the potion:" + dragonBlood.getName());
                    myPotion.addIngredient(dragonBlood.getpotency());
                    ingredientCount++;
                } else if (userInput == 3) {
                    System.out.println("Added to the potion:" + armadilloBile.getName());
                    myPotion.addIngredient(armadilloBile.getpotency());
                    ingredientCount++;
                } else if (userInput == 4) {
                    System.out.println("Added to the potion:" + wormwoodEssence.getName());
                    myPotion.addIngredient(wormwoodEssence.getpotency());
                    ingredientCount++;
                } else if (userInput == 5) {
                    System.out.println("Added to the potion:" + moonstone.getName());
                    myPotion.addIngredient(moonstone.getpotency());
                    ingredientCount++;
                }
                // Catch allows for the input to work with if statements
            } catch (InputMismatchException e) {
                System.out.println("Use a number to pick");
                scanner.nextLine();
            }
        }
    }

    // TODO: Implement stirPotion(...) DONE
    // to prompt the user on how often they would like to stir the potion
    // Then stir the potion as many times

    public static void stirPotion(Potion myPotion) {
        // Print statements
        System.out.println("Next, you need to stir and heat your potion.");
        System.out.println("How many times would you like to stir the potion (1-3)?");
        // try catch so we do not run into problems later with evauatePotion method
        try {
            // User input
            int userInput2 = scanner.nextInt();
            /*
             * if statements use use the stir potion method 
             * It then prints what the result of the stirs are
             */
            if (userInput2 == 1) {
                myPotion.stirPotion();
                System.out.println("Potion stirred. Stirring level:" + myPotion.getstirringLevel());

            }
            if (userInput2 == 2) {
                myPotion.stirPotion();
                System.out.println("Potion stirred. Stirring level:" + myPotion.getstirringLevel());
                myPotion.stirPotion();
                System.out.println("Potion stirred. Stirring level:" + myPotion.getstirringLevel());

            }
            if (userInput2 == 3) {
                myPotion.stirPotion();
                System.out.println("Potion stirred. Stirring level:" + myPotion.getstirringLevel());
                myPotion.stirPotion();
                System.out.println("Potion stirred. Stirring level:" + myPotion.getstirringLevel());
                myPotion.stirPotion();
                System.out.println("Potion stirred. Stirring level:" + myPotion.getstirringLevel());
            }
            if(userInput2 > 3){
                stirPotion( myPotion );
            }
            // Catch spefiies how to input
        } catch (InputMismatchException b) {
            System.out.println("Use a number to pick");
            scanner.nextLine();
        }
    }

    // TODO: Implememt heatPotion(...) DONE
    // That prompts the user to input the heat level of the potion
    public static void heatPotion(Potion myPotion) {
        // Print statements
        System.out.println(
                "By how much would you like to increase the heat of your potion (1-3)? Be careful, it may explode!");
        // try catch so we do not run into problems later with evauatePotion method
        try {
            // User Input
            int userInput3 = scanner.nextInt();
            /* If statements check the input then incur heatPotion method
            Then prints results
             */
            if (userInput3 == 1) {
                myPotion.heatPotion();
                System.out.println("Potion heated. Heat level:" + myPotion.getheatLevel());

            }
            if (userInput3 == 2) {
                myPotion.heatPotion();
                System.out.println("Potion heated. Heat level:" + myPotion.getheatLevel());
                myPotion.heatPotion();
                System.out.println("Potion heated. Heat level:" + myPotion.getheatLevel());

            }
            if (userInput3 == 3) {
                myPotion.heatPotion();
                System.out.println("Potion heated. Heat level:" + myPotion.getheatLevel());
                myPotion.heatPotion();
                System.out.println("Potion heated. Heat level:" + myPotion.getheatLevel());
                myPotion.heatPotion();
                System.out.println("Potion heated. Heat level:" + myPotion.getheatLevel());
            }
            if(userInput3 > 3){
                heatPotion( myPotion );
            }
            // Catch spefiies how to input

        } catch (InputMismatchException b) {
            System.out.println("Use a number to pick");
            scanner.nextLine();
        }
    }

}
