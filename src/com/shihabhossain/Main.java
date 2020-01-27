package com.shihabhossain;

public class Main {

//    public means it can be accessible anywhere in the codebase
//    static means we can call this method directly without having to create an instance of the main class
    public static void main(String[] args) {
        User user = new User("Shihab", 30);
        user.sayHello();

//      An Interface is a contract that specifies the capabilities that a class should provide
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

//      Encapsulation restricting of direct access to some of an object component's
        Account account = new Account();
        account.withdraw(5);
        account.deposit(20);
        System.out.println(account.getBalance());

//      Abstraction reducing the complexity by hiding unnecessary details. We can change the implementation details without affecting other classes
        MailService mailService = new MailService();
        mailService.sendMail("Hello Shihab");

//      Inheritance is a mechanism for reusing code across our classes.
//      We implement all common behaviors in a parent or base class and then have all these other classes inherit those behaviors.
        TextBox textBox = new TextBox();
        textBox.enable();

//      Polymorphism means many forms it is basically the ability of an object to take on many forms
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
