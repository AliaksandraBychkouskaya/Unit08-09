package by.tr.mod8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AlphabeticalComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String Fullname1 = (o1.getLastName() + o1.getFirstName() + o1.getSurname()).toLowerCase();
        String Fullname2 = (o2.getLastName() + o2.getFirstName() + o2.getSurname()).toLowerCase();
        return (Fullname1.compareTo(Fullname2)) < 0 ? -1 : (Fullname2.compareTo(Fullname1) > 0) ? 1 : 0;
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer (1,"Varvara","Sheverha","Dmitrievna","Minsk",3456,3333);
        Customer c2 = new Customer (2,"Aliaksandra","Bychkouskaya","Pavlovna","Minsk",1234,1111);
        Customer c3 = new Customer (3,"Artsiom","Peshko","Iosifovich","Pinsk",2345,2222);
        CustomersList cl = new CustomersList();
        cl.addCustomer(c1);
        cl.addCustomer(c2);
        cl.addCustomer(c3);
        System.out.println(alphabeticalSort(cl));
        System.out.println(creditCardInterval(cl,1000,3000));
    }
    public static ArrayList<Customer> creditCardInterval(CustomersList cl, int start,int finish){
        ArrayList<Customer> forAnalise = cl.getArrCustomer();
        forAnalise.removeIf(t->t.getCreditCardNumber() < start || t.getCreditCardNumber()>finish);
        return forAnalise;
    }
    public static ArrayList<Customer> alphabeticalSort(CustomersList cl) {
        ArrayList<Customer> forSort = cl.getArrCustomer();
        AlphabeticalComparator alpha = new AlphabeticalComparator();
        Collections.sort(forSort, alpha);
        return forSort;
    }
}
