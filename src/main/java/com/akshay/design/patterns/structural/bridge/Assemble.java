package com.akshay.design.patterns.structural.bridge;

class Assemble implements Workshop {
    public void work()
    {
        System.out.print(" And");
        System.out.println(" Assembled.");
    }
}