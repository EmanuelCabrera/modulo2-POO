package com.mindhub.excersice3.domain;

import com.mindhub.excersice3.interfaces.IMovementBehavior;
import com.mindhub.excersice3.interfaces.IAttackBehavior;

import lombok.Data;

@Data
public class Character {
    private String name;
    private IMovementBehavior movementBehavior;
    private IAttackBehavior attackBehavior;

    public Character(String name, IMovementBehavior movementBehavior, IAttackBehavior attackBehavior) {
        this.name = name;
        this.movementBehavior = movementBehavior;
        this.attackBehavior = attackBehavior;
    }

    public void move() {
        movementBehavior.move();
    }

    public void attack() {
        attackBehavior.attack();
    }
}
