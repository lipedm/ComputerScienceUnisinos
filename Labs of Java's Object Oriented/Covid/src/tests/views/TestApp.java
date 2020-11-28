package tests.views;

import exception.*;
import views.Console;

public class TestApp {
    public static void main(String[] args)throws FelipeQueueException{
        Console app = new Console();
        app = app.mainMenu(app);
        System.out.println("Teste");
    }

}
