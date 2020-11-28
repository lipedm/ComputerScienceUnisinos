package classes;

import java.util.*;
import exception.*;

public class ListCandidate {

    List<Candidate> candidates;
    List<Candidate> candidatesByVote;

    public ListCandidate() {
        candidates = new ArrayList<>();
        candidatesByVote = new ArrayList<>();
    }

    public List<Candidate> getCandidates() {
        return this.candidates;
    }

    public Candidate getElderCandidate() {
        return candidates.get(candidates.size()- 1);
    }

    public Candidate getNewerCandidate() {
        return candidates.get(0);
    }

    public Candidate getMostVotadedCandidate() {
        return candidatesByVote.get(candidates.size()- 1);
    }

    public Candidate getLessVotadedCandidate() {
        return candidatesByVote.get(0);
    }

    public int calcTotalVotes(){
        int soma = 0;
        for(int i = 0; i < candidates.size(); i++){
            soma += candidates.get(i).getVotes();
        }
        return soma;
    }

    public int calcAverageVotes(){
        int soma = 0;
        for(int i = 0; i < candidates.size(); i++){
            soma += candidates.get(i).getVotes();
        }
        return soma/(candidates.size()+1);
    }

    public void removeCandidates(Candidate e) {
        candidates.remove(e);
        candidatesByVote.remove(e);
    }

    public void setCandidates(Candidate e) {
        candidates.add(e);
        candidatesByVote.add(e);
        Collections.sort(candidates, new Comparator<Candidate>() {
            public int compare(Candidate one, Candidate two) {
                return one.getAge() - two.getAge();
            }
        });
        Collections.sort(candidatesByVote, new Comparator<Candidate>() {
            public int compare(Candidate a, Candidate b) {
                return a.getVotes() - b.getVotes();
            }
        });
    };
    

    public Candidate getCandidate(String name) throws FelipeException {
        for (Candidate obj : candidates) {
            if (obj.getName() == name) {
                return obj;
            }
        }
        throw new FelipeException("Candidato não encontrado");
    }

    public void printCandidates() {
        for (int i = 0; i < candidates.size(); i++) {
            int count = i + 1;
            System.out.println("Posição " + count + " : " + candidates.get(i).toString());
        }
    }

    public void printVotedCandidates() {
        for (int i = 0; i < candidates.size(); i++) {
            int count = i + 1;
            System.out.println("Posição " + count + " : " + candidatesByVote.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "{" + " Candidatos='" + getCandidates() + "'" + "}";
    }

}
