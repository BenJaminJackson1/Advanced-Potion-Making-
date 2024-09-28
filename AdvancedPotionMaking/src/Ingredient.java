/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */
// Ingredient class
public class Ingredient {
    // TODO: Implement Ingredient. Add useful variables, methods, getters, setters,
    // and constructor(s) DONE
    // Hint: An ingredient has a name and a potency effect that should be max. 10
    // Variables
    private String name;
    private int potency;
    // Ingredent constrctors 
    Ingredient(String name, int potency) {
        this.name = name;
        this.potency = potency;
    }

    Ingredient() {
        name = "name";
        potency = 0;
    }
    // Getters 
    public String getName() {
        return this.name;
    }

    public int getpotency() {
        return this.potency;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

}
