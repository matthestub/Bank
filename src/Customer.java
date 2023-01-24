import java.util.ArrayList;

public class Customer {

    private String customerName;

    private double accountBalance;
    private ArrayList<Double> transactionsList;

    public Customer(String name, double initialAccountBalance) {
        this.customerName = name;
        this.accountBalance = initialAccountBalance;
        this.transactionsList = new ArrayList<>();
    }


    public void makeTransaction(double amount) {
        if (amount < 0) {
            if ((accountBalance + amount) < 0) {
                System.out.println(getCustomerName()+"'s operation aborted!");
            } else {
                this.accountBalance += amount;
                this.transactionsList.add(amount);
                System.out.println(customerName + "'s account balance changed by: " + amount);
            }
        } else {
            this.accountBalance += amount;
            this.transactionsList.add(amount);
            System.out.println(customerName + "'s account balance changed by: " + amount);
        }
    }

    String getCustomerName() {
        return customerName;
    }

    double getAccountBalance() {
        return accountBalance;
    }

    ArrayList<Double> getTransactionsList() {
        return transactionsList;
    }
}
