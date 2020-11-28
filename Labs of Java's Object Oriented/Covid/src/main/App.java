package main;

import exception.FelipeQueueException;
import views.Console;

public class App {
    public static void main(String[] args)throws FelipeQueueException{

        Console app = new Console();
        app = app.mainMenu(app);
        System.out.println("A aplicação foi finalizada, até mais :)");
    }

}
