package com.mindhub.excersice3.domain;

import com.mindhub.excersice3.interfaces.IAttackBehavior;

public class SwordAttack implements IAttackBehavior {
    
    @Override
    public void attack() {
        System.out.println("Sword attack");
    }
}
