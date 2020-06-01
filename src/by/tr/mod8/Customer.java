package by.tr.mod8;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String surname;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int _id, String _firstName,String _lastName,String _surname){
        this.id = _id;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.surname = _surname;
    }
    public Customer(int _id,String _firstName,String _lastName,String _surname, String _address, int _creditCardNumber, int _bankAccountNumber){
       this(_id,_firstName,_lastName, _surname);
       this.address = _address;
       this.creditCardNumber = _creditCardNumber;
       this.bankAccountNumber = _bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public String toString(){
        return ("Customer [ID = "+ id +", Last Name = "+ lastName+", First Name = "+firstName+", Surname = "+surname+", Address = "+ address+", Bank Account Number = "+ bankAccountNumber+", Credit card number = "+ creditCardNumber+ "]"+"\n");
    }
}
