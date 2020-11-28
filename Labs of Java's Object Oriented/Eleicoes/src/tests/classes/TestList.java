package tests.classes;
import classes.*;
import exception.FelipeException;

public class TestList {
    public static void main(String[] args)throws FelipeException {

        Candidate p1 = new Candidate("Felipe", 22,1000);
        Candidate p2 = new Candidate("Terezinha", 100,1000);
        Candidate p3 = new Candidate("Amanda", 99,400);
        Candidate p4 = new Candidate("Geanine", 44,150);
        Candidate p5 = new Candidate("Daniela", 33,301);

        ListCandidate q = new ListCandidate();

        q.setCandidates(p1);
        q.setCandidates(p2);
        q.setCandidates(p3);
        q.setCandidates(p4);
        q.setCandidates(p5);

        
            System.out.println(
            "\n" + " Candidato mais jovem" + q.getNewerCandidate() 
          + "\n" + " Candidato mais velho" + q.getElderCandidate() 
          + "\n" + " Candidato mais votado"+ q.getMostVotadedCandidate() 
          + "\n" + " Candidato menos votado"+ q.getLessVotadedCandidate() 
          + "\n" + " Total de votos recebidos por todos os candidatos " + q.calcTotalVotes()
          + "\n" + " Média de votação recebida pelos candidatos " + q.calcAverageVotes());
            
        
        

        
        // System.out.println("----ELDER--------");
        // q.getElderCandidate();
        // System.out.println("------NEWER------");
        // q.getNewerCandidate();
        // System.out.println("------MOREVOTES------");
        // q.getMostVotadedCandidate();
        // System.out.println("------LESSVOTES------");
        // q.getLessVotadedCandidate();
        
    }}
    

