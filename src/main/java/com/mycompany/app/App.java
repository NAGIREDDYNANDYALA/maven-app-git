package com.mycompany.app;

/**
 * Hello world!
 */
// commit test
public class App
{
    //Test
    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        String test = this.message;
        System.out.println(new App().getMessage());
        System.out.println(test);
    }

    private final String getMessage() {
        return message;
    }

}
