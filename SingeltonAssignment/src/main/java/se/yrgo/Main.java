package se.yrgo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lazy -----------------");
        System.out.println(RootUser.getInstance().toString());
        System.out.println("With final static -------------");
        System.out.println(RootUserTwo.INSTANCE.toString());
        System.out.println("With Enum ---------------");
        System.out.println(RootUserThree.INSTANCE.toString());

    }
}