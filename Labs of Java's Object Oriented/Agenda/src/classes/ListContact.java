package classes;
import java.util.ArrayList;
import java.util.List;
import exception.*;

public class ListContact {

    List<Contact> contacts;

    public ListContact() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public void removeContact(Contact e){
        contacts.remove(e);
    }
    

    public void setContacts(Contact e) {
        contacts.add(e);
    }

    public Contact getContact(String name)throws FelipeException{
        for (Contact obj : contacts) {
            if (obj.getName() == name) {
                return obj;
            }
        }
        throw new FelipeException("Contato não encontrado");
    }

    public void printContacts(){
        for (int i = 0; i < contacts.size(); i++) {
            int count = i+1;
            System.out.println("Posição " + count + " : " + contacts.get(i).toString());
        }
    }


    public ListContact contacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " contacts='" + getContacts() + "'" +
            "}";
    }

    
}
