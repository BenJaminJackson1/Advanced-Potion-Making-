Fall 2024 - CMPINF 0401 - Assignment 1
# Problem Statement: Advanced Potion-Making
## Learning Goals
In this assignment, you will practice creating and accessing objects, as well as writing methods.

## Background Story
*You are attending Professor Snape’s Advanced Potion-Making class at Hogwarts School for Witchcraft and Wizardry.
You are currently working through *Moste Potente Potions*, a potions book by Phineas Bourne that gives instructions on how to brew hundreds of advanced potions.
You find it difficult to find the correct ingredients and their stirring and heating levels, so you decide to practice a little more outside of class.
Some potions are difficult to brew and can explode, so be careful!*

## Context
Implement a program that simulates potion brewing.

Each potion-making attempt involves:
1. **Choosing Ingredients**: Ingredients have different potency effects; choosing the correct combination is crucial (the potion's potency)
2. **Stirring**: The potion must be stirred a certain amount of times, which influences the success of the potion (the potion's stirring level)
3. **Heating**: The potion must be heated to a certain level, which influences the success of the potion (the potion's heating level)
4. **Potion Evaluation**: Professor Snape will evaluate your potion very thoroughly!

## Code Template
You are provided with a code template: https://github.com/Pitt-0401/AdvancedPotionMaking-template

- Implement the necessary classes (i.e., **Ingredient**, **Potion**, **AdvancedPotionsClass**), and define appropriate attributes, getters, setters, methods, and constructors. Make sure to use appropriate visibilities.
- The potion brewing process should consist of adding 4 ingredients, selecting 1 to 3 stirs, and 1 to 3 heating levels. 
- Use random values to determine the effects of stirring and heating.
- After stirring and heating, the potion needs some time to take effect. A random variable determines the effect on the potion, which should be implemented in each method, e.g., add a random number between 1 and 5 (`random.nextInt(5) + 1`) to the stirring/heating level.

### Logic
Please make sure to follow the logical rules below:
1. **Ingredients**: Each potion requires exactly **four ingredients**. The student can choose from a list of **five possible ingredients**, each with a different effect.
Some ingredients increase the potion’s potency, others have no effect.
2. **Stirring and Heating**: After adding all ingredients, the student must first **stir** the potion and then adjust the **heat level**. After each of these actions, the potion shows a **randomized outcome**: Its stirring level / heat level is increased by a random amount (see template). 
3. **Potion Evaluation**: The outcome of the potion is determined by the combination of ingredients (potency), stirring, and heating level. 
In addition, while the potion is being evaluated, there is a 25% chance that it explodes (**CauldronEvent**, *already implemented*), which should be triggered during the evaluation process.
The potion can result in one of several outcomes:
   - **Success**: The potion is perfectly brewed.
   - **Partial Success**: The potion works but is less effective.
   - **Failure**: The potion fails.

### Where to Start
Have a look at the code template. There are some TODOs that should help you understand what to do.
The following is a suggestion to help you start:
1. Begin by implementing the **Ingredient** class. Ingredients have a name and a potency effect on the potion.
2. Next, implement the **Potion** class. Ingredients can be added and potions can be stirred and heated. You should track the potency of the ingredients added, the stirring level, and the heat level. Potion should also have an indication of its state (is it ruined or not). *Ingredients do not have to be stored in the Potion!* 
3. Implement the logic for **AdvancedPotionsClass** (see TODOs in the code).
4. Test the brewing process by simulating different ingredient combinations, stirring, and heating levels to see how the potion outcome changes.

### Hints
- Each ingredient has a unique effect on the potion’s outcome (e.g., increasing or decreasing its potency).
- Stirring and heating should be represented as methods that take random values as inputs to determine how they affect the potion.

### Sample Output
The following is an example output to help you understand the idea of the program. Feel free to make up your own prompts!

```
Choose 4 ingredients to add to your potion:
(1) Bicorn Horn, (2) Dragon Blood, (3) Armadillo Bile, (4) Wormwood Essence, (5) Moonstone
Select ingredient No.1: Enter your choice (1-5):
Phoenix tears                    
Invalid input. Please enter a number.
Select ingredient No.1: 4
Added Wormwood Essence to the potion.
Select ingredient No.2: 2
Added Dragon Blood to the potion.
Select ingredient No.3: 3
Added Armadillo Bile to the potion.
Select ingredient No.4: 1
Added Bicorn Horn to the potion.

Next, you need to stir and heat your potion.

How many times would you like to stir the potion (1-3)? 3
Potion stirred. Stirring level: 2
Potion stirred. Stirring level: 7
Potion stirred. Stirring level: 12

By how much would you like to increase the heat of your potion (1-3)? Be careful, it may explode! 2
Potion heated. Heat level: 1
Potion heated. Heat level: 5

Potion Result: Your potion is okay, but is a bit unstable.
```