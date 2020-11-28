package tests.views;

import classes.*;

public class TestApp{

    public static void main(String[] args) {
        
    Call c1 = new Call(2222222);
    Call c2 = new Call(99);
    Call c3 = new Call(44);
    Call c4 = new Call(2222222);

    Contact p1 = new Contact("Felipe", 2222222);
    Contact p2 = new Contact("Amanda", 9933333);
    Contact p3 = new Contact("Geanine", 44333333);
    Contact p4 = new Contact("Daniela", 9933333);


    ListCall list1 = new ListCall();
    ListContact list2 = new ListContact();

    list1.setCalls(c1);
    list1.setCalls(c2);
    list1.setCalls(c3);
    list1.setCalls(c4);
    
    list2.setContacts(p1);
    list2.setContacts(p2);
    list2.setContacts(p3);
    list2.setContacts(p4);

    list1.printCalls(list2.getContacts());
    }
    
}
