import java.util.ArrayList;

public class Branch {

    private final String branchName;

    private final ArrayList<Customer> customersList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customersList = new ArrayList<>();
    }


    public void addCustomerToBranch(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            customersList.add(new Customer(customerName, initialAmount));
        }
    }

    public void addCustomerTransaction(String customerName, double amount) {
        Customer currentCustomer = findCustomer(customerName);
        if (currentCustomer != null) currentCustomer.makeTransaction(amount);
    }

    public Customer findCustomer(String customerName) {
        for (Customer currentCustomer : customersList) {
            if (currentCustomer.getCustomerName().equals(customerName)) {
                return currentCustomer;
            }
        }
        return null;
    }

    String getBranchName() {
        return branchName;
    }

    ArrayList<Customer> getCustomersList() {
        return customersList;
    }
}
