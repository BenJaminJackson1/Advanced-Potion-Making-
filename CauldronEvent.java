/*
 * Created on 2024-09-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

/* ** NO NEED TO CHANGE THIS FILE ** */

import java.util.Random;

public class CauldronEvent {
    public boolean triggerEvent() {
        Random random = new Random();
        int event = random.nextInt(3);

        if (event == 0) {
            System.out.println("Oh no! Your potion exploded and is useless!");
            return true;
        }
        return false;
    }
}
