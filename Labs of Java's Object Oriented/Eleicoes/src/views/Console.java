package views;

import classes.*;
import exception.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private Scanner insert = new Scanner(System.in);
    private ListCandidate list = new ListCandidate();

    public Console mainMenu(Console console) throws FelipeException {
        System.out.println("Bem vindo ao Sistema das Eleicoes 2020: Eleicoes1.0 xD");
        int selection = 0;

        do {

            System.out.println("[1] Adicionar Candidato");
            System.out.println("[2] Listagem Final");
            System.out.println("[3] Sair");

            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();
            switch (selection) {
                case 1:
                    addCandidate();
                    return console.mainMenu(console);
                case 2:
                    printList();
                    return console.mainMenu(console);
                case 3:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 3);

        insert.close();
        return console;
    }

    public void addCandidate() {
        Scan scan = new Scan();
        try {
            Candidate candidate = new Candidate(scan.inString("Insira o nome do Candidato:"),
                    scan.inInt("Insira a Idade do Candidato:"),
                    scan.inInt("Insira a Quantidade de Votos do Candidaato:"));
            list.setCandidates(candidate);
        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        }
    }

    public void printList(){
        System.out.println(
        "\n" + " Candidato mais jovem" + list.getNewerCandidate() 
      + "\n" + " Candidato mais velho" + list.getElderCandidate() 
      + "\n" + " Candidato mais votado"+ list.getMostVotadedCandidate() 
      + "\n" + " Candidato menos votado"+ list.getLessVotadedCandidate() 
      + "\n" + " Total de votos recebidos por todos os candidatos " + list.calcTotalVotes()
      + "\n" + " Média de votação recebida pelos candidatos " + list.calcAverageVotes());
        
    }
}