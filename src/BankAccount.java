public class BankAccount {

    String name;
    long id;
    Double accountNumber;


    public BankAccount(String name, long id, Double accountNumber) {
        this.name = name;
        this.id = id;
        this.accountNumber = accountNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public Double getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    
    
}
