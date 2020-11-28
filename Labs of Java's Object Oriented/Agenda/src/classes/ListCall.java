package classes;

import java.util.ArrayList;
import java.util.List;
import exception.*;

public class ListCall extends ListContact {

    List<Call> calls;

    public ListCall() {
        calls = new ArrayList<>();
    }

    public List<Call> getCalls() {
        return this.calls;
    }

    public void removeCall(Call e) {
        calls.remove(e);
    }

    public void setCalls(Call e) {
        calls.add(e);
    }

    public void removeCalls() {
        calls.clear();
    }

    public Call getCall(int number) throws FelipeException {
        for (Call obj : calls) {
            if (obj.getNumber() == number) {
                return obj;
            }
        }
        throw new FelipeException("Chamada não encontrada");
    }

    public void printCalls(List<Contact> contacts) {
        for (int i = 0; i < calls.size(); i++) {
            int count = i + 1;
            for (int j = 0; j < contacts.size(); j++) {
                if (calls.get(i).getNumber() == contacts.get(j).getNumber()) {
                    System.out.println("Ligação #" + count + " : " + "Nome: " + contacts.get(j).getName() + " "
                            + calls.get(i).toString());
                            break;

                } else {
                    System.out.println("Ligação #" + count + " : " + calls.get(i).toString());
                    break;
                }

            }
            

        }
    }

    public ListCall calls(List<Call> calls) {
        this.calls = calls;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " calls='" + getCalls() + "'" + "}";
    }

}
