/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

// Imports random
import java.util.Random;

// Potion class
public class Potion {
    // TODO: Implement Potion. Add useful variables, methods, getters, setters, and
    // constructor(s) DONE
    // Hint: A potion should have a potency, stirring level, and heat level, as well
    // as an indicator of whether it has been ruined
    // Ingredients do not need to be stored within the Potion class!

    // Variables
    private int potency;
    private int stirringLevel;
    private int heatLevel;


    // Constructors
    Potion(int potency, int stirringLevel, int heatLevel) {
        this.potency = potency;
        this.stirringLevel = stirringLevel;
        this.heatLevel = heatLevel;
    }

    Potion() {
        potency = 0;
        stirringLevel = 0;
        heatLevel = 0;
    }

    // Getters
    public int getpotency() {
        return this.potency;
    }

    public int getstirringLevel() {
        return this.stirringLevel;
    }

    public int getheatLevel() {
        return this.heatLevel;
    }

    public void setPotencyy() {
        this.potency = potency;
    }
    // Setters
    public void setStirringLevel(int stirringLevel) {
        this.stirringLevel = stirringLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }

    // TODO: Implement addIngredient(...) DONE
    // The ingredient's potency effect should be added to the potion's potency

    //  adds input to the potency 
    public void addIngredient(int input) {
        this.potency += input;

    }

    // TODO: Implement stirPotion(...) DONE
    // Stir the potion with a random effect: add a random value between 1 and 5

    // adds to stirringLevel to a random  vaiable between 1-5
    public void stirPotion() {
        this.stirringLevel = stirringLevel + (1 + (int)(Math.random() * ((5 - 1) + 1)));
    }

    // TODO: Implement heatPotion(...) DONE
    // Heat the potion with a random effect: add a random value between 0 and 7


    // adds to heatLevel to a random  vaiable between 0-7
    public void heatPotion() {
        this.heatLevel = heatLevel + (0 + (int)(Math.random() * ((7 - 0) + 1)));;
    }

    // TODO: Implement evaluatePotion(...)DONE
    /*
     * Criteria:
     * If the potion is not ruined, and its potency is greater than 15, the stirring
     * level is greater than 5,
     * and the heat level is greater than 3, it is brewed perfectly
     * If the potion is not ruined and its potency is less than 15 but greater than
     * 10,
     * the stirringLevel is greater than 3 and the heatLevel is greater than 3, the
     * potion is a bit unstable but ok
     * Otherwise, the potion is ruined.
     */


    // Evaulates potion 
    public void evaluatePotion() {
        // Creates new CauldronEvent object named event
        CauldronEvent event = new CauldronEvent();
       /* Makes boolean named exploded
        * Sets it to true or false with the triggerEvent method
       */
        boolean exploded = event.triggerEvent();
        /* If statements check mutiple variables
         * If true, they print out a statement and set exploded to true
         * Exploded is then used to control what if statements the program runs
         */
        if (!exploded && potency > 15 && stirringLevel > 5 && heatLevel < 4) {
            System.out.println("Potion Result: it is brewed perfectly");
            exploded = true;
        }
        if (!exploded && potency < 15 && stirringLevel > 3 && heatLevel > 3) {
            System.out.println("Potion Result: the potion is a bit unstable but ok");
            exploded = true;
        }

        if (!exploded) {
            System.out.println("Potion Result: the potion is ruined");
        }
    }

}