package org.example;

public abstract class Test {
    private String test;
    public Test(String test){
        this.test=test;
    }
    public void print(){
        System.out.printf(this.test);
    }
    public abstract void print1();
}
