package com.savras;

public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< ... >>");
    }
}
