package com.jiwira.designpattern;



class cat extends animals {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        animals myAnimal = new cat();
        animals.testClassMethod();
        myAnimal.testInstanceMethod();
        cat.testClassMethod();
    }
}