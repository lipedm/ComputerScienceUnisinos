package classes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import exception.*;

public class Queue {

    List<Patient> patients;
    List<Patient> vacPatients;

    public Queue() {
        patients = new ArrayList<>();
        vacPatients = new ArrayList<>();
    }

    public Queue(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return this.patients;
    }

    public void removePatients(Patient e){
        patients.remove(e);
    }

    public void setPatients(Patient e) {
        patients.add(e);
        Collections.sort(patients);
    }

    public Patient getPatient(String name)throws FelipeQueueException{
        for (Patient obj : patients) {
            if (obj.getName() == name) {
                return obj;
            }
        }
        throw new FelipeQueueException("Paciente não encontrado");
    }
    public void setVacPatients(Patient e) {

        patients.remove(e);
        vacPatients.add(e);
        Collections.sort(patients);
    }

    public void printPatients(){
        for (int i = 0; i < patients.size(); i++) {
            int count = i+1;
            System.out.println("Posição " + count + " : " + patients.get(i).toString());
        }
    }

    public void printVacPatients(){
        for (int i = 0; i < vacPatients.size(); i++) {
            int count = i+1;
            System.out.println("Posição " + count + " : " + vacPatients.get(i).toString());
        }
    }

    public Patient nextPatient()throws FelipeQueueException {
        if (!patients.isEmpty()) {
            return patients.get(0);
        }
        throw new FelipeQueueException("Nenhum paciente cadastrado");
    }

    public Queue patients(List<Patient> patients) {
        this.patients = patients;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " patients='" + getPatients() + "'" +
            "}";
    }

    
}
