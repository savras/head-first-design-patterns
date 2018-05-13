package com.savras;

public class FlyNoWings implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
