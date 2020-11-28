package views;

import classes.*;
import exception.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private Scanner insert = new Scanner(System.in);
    private Queue queue = new Queue();

    public Console mainMenu(Console console)throws FelipeQueueException {
        System.out.println("Bem vindo ao Sistema de Notas: CovidFila1.0 xD");
        int selection = 0;

        do {

            System.out.println("[1] Paciente");
            System.out.println("[2] Fila");
            System.out.println("[3] Sair");

            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();
            switch (selection) {
                case 1:
                    return console.patientMenu(console);
                case 2:
                    return console.queueMenu(console);
                case 3:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 3);

        insert.close();
        return console;
    }

    public Console patientMenu(Console console)throws FelipeQueueException {
        System.out.println("Adicionar Pacientes");

        int selection = 0;

        Scanner insert = new Scanner(System.in);
        do {
            System.out.println("[1] Inserir Paciente");
            System.out.println("[2] Vacinar Paciente");
            System.out.println("[3] Voltar");
            System.out.println("[4] Sair");
            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();

            switch (selection) {
                case 1:
                    addPatient();
                    return console.patientMenu(console);
                case 2:
                    addVacPatient();
                    return console.patientMenu(console);
                case 3:
                    return console.mainMenu(console);
                case 4:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 4);
        insert.close();
        return console;
    }

    public Console queueMenu(Console console)throws FelipeQueueException {
        System.out.println("Fila");

        int selection = 0;

        Scanner insert = new Scanner(System.in);
        do {
            System.out.println("[1] Exibir Fila Não Vacinados");
            System.out.println("[2] Exibir Fila Vacinados");
            System.out.println("[3] Próximo Paciente Prioritário ");
            System.out.println("[4] Voltar");
            System.out.println("[5] Sair");
            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();

            switch (selection) {
                case 1:
                    queue.printPatients();
                    return console.queueMenu(console);
                case 2:
                    queue.printVacPatients();
                    return console.queueMenu(console);
                case 3:
                    System.out.println(queue.nextPatient()); 
                    return console.queueMenu(console);
                case 4:
                    queue.printVacPatients();
                    return console.queueMenu(console);
                case 5:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 5);
        insert.close();
        return console;
    }

    public void addPatient() {
        Scan scan = new Scan();
        try {
            Patient patient = new Patient(scan.inString("Insira o nome do Paciente:"),
                    scan.inInt("Insira a Idade do Paciente:"));
            queue.setPatients(patient);
        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        }
    }

    public void addVacPatient() throws FelipeQueueException {
        Scan scan = new Scan();
        try {
            queue.setVacPatients(queue.getPatient(scan.inString("Insira o nome do Paciente:")));

        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        } catch(FelipeQueueException c){
            c.getMessage();
        }
    }
}