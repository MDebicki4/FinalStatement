package com.michaldebicki;

// nie można extends Math bo Math jest finałowa i nie może być subklasą
public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        //one.instanceNumber = 4;

        System.out.println(Math.PI);
        //Math m = new Math();
        //Math jest private więc nie możemy stworzyć obiektu tej klasy

        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(251350);
        password.letMeIn(-1);
        password.letMeIn(6743120);


        System.out.println("Main method called");
        SiBTest test = new SiBTest();
        test.someMethod();
        System.out.println("Owner is " + SiBTest.owner);

    }
}
