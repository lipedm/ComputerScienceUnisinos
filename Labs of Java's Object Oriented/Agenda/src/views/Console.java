package views;

import classes.*;
import exception.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private Scanner insert = new Scanner(System.in);
    private ListCall listcall = new ListCall();
    private ListContact listcontact = new ListContact();

    public Console mainMenu(Console console) throws FelipeException {
        System.out.println("Bem vindo ao Sistema de Agenda: AgendaToperigena 1.0 xD");
        int selection = 0;

        do {

            System.out.println("[1] Cadastrar Contato");
            System.out.println("[2] Remover Contato");
            System.out.println("[3] Cadastrar chamada não atendida");
            System.out.println("[4] Mostrar lista de chamadas não atendidas");
            System.out.println("[5] Excluir todas chamadas não atendidas ");
            System.out.println("[6] Sair");

            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();
            switch (selection) {
                case 1:
                    addContact();
                    return console.mainMenu(console);
                case 2:
                    removeContact();
                    return console.mainMenu(console);
                case 3:
                    addCall();
                    return console.mainMenu(console);
                case 4:
                    listcall.printCalls(listcontact.getContacts());
                    return console.mainMenu(console);
                case 5:
                    removeCalls();
                    return console.mainMenu(console);
                case 6:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 6);

        insert.close();
        return console;
    }

    public void addContact() {
        Scan scan = new Scan();
        try {
            Contact contact = new Contact(scan.inString("Insira o nome do Contato:"),
                    scan.inInt("Insira o Número do Contato:"));
            listcontact.setContacts(contact);
        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        }
    }

    public void removeContact() throws FelipeException {

        Scan scan = new Scan();
        try {
            Contact contact = listcontact.getContact(scan.inString("Insira o nome do Contato:"));
            listcontact.removeContact(contact);
        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        } catch(FelipeException d){
            d.getMessage();
        }

    }

    public void addCall() {

        Scan scan = new Scan();
        try {
            Call call = new Call(scan.inInt("Insira o Número:"));
            listcall.setCalls(call);
        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        }

    }

    public void removeCalls() {

        try {
            listcall.removeCalls();
        } catch (InputMismatchException e) {
            System.out.println("Deu pau");
        }

    }

}