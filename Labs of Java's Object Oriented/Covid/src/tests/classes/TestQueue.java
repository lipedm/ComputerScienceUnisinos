package tests.classes;
import classes.*;
import exception.FelipeQueueException;

public class TestQueue {
    public static void main(String[] args)throws FelipeQueueException {

        Patient p1 = new Patient("Felipe", 22);
        Patient p2 = new Patient("Terezinha", 100);
        Patient p3 = new Patient("Amanda", 99);
        Patient p4 = new Patient("Geanine", 44);
        Patient p5 = new Patient("Daniela", 33);

        Queue q = new Queue();

        q.setPatients(p1);
        q.setPatients(p2);
        q.setPatients(p3);
        q.setPatients(p4);
        q.setPatients(p5);

        q.printPatients();

        q.setVacPatients(q.nextPatient());
        q.setVacPatients(q.nextPatient());


        System.out.println("--NEXT----------");
        System.out.println(q.nextPatient());

        System.out.println("------------");
        q.printPatients();
        System.out.println("------------");
        q.printVacPatients();


        
    }
    
}
