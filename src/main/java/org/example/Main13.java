package org.example;

public class Main13 {

  public static void main(String[] args){
    Greeting greeting = new Greeting();
    String message = greeting.sayHello(" Sho Higashizono");

    Printer printer = new Printer();
    printer.printMessage(message);

    Speaking speaking = new Greeting();

  };
}
