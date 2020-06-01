package by.tr.mod8;

import java.util.ArrayList;

public class CustomersList {
    private ArrayList<Customer> arrCustomer;
    public CustomersList(){
        arrCustomer = new ArrayList<Customer>();
    }

    public CustomersList (ArrayList <Customer> _arrCustomer){
        arrCustomer = _arrCustomer;
    }

    public void addCustomer(Customer _customer){
     arrCustomer.add(_customer);
    }

    public ArrayList<Customer> getArrCustomer() {
        return arrCustomer;
    }


}
