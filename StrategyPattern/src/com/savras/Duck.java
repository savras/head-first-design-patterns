package com.savras;

public abstract class Duck {
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck() { }
    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(IFlyBehaviour newBehaviour) {
        flyBehaviour = newBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour newBehaviour) {
        quackBehaviour = newBehaviour;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
