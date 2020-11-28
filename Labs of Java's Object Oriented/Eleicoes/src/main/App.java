package main;

import exception.FelipeException;
import views.Console;

public class App {
    public static void main(String[] args)throws FelipeException{

        Console app = new Console();
        app = app.mainMenu(app);
        System.out.println("A aplicação foi finalizada, até mais :)");
    }

}
