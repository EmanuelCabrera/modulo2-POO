package com.mindhub.excersice3.domain;

import com.mindhub.excersice3.interfaces.IMovementBehavior;

public class WalkingMovement implements IMovementBehavior {
    
    @Override
    public void move() {
        System.out.println("Walking movement");
    }
}
