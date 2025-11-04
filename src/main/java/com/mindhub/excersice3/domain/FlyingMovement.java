package com.mindhub.excersice3.domain;

import com.mindhub.excersice3.interfaces.IMovementBehavior;

public class FlyingMovement implements IMovementBehavior {
    
    @Override
    public void move() {
        System.out.println("Flying movement");
    }
}
