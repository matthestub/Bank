import java.util.ArrayList;

public class Bank {

    private final String bankName;
    private final ArrayList<Branch> branchList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branchList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public void addNewCustomer(String branchName, String customerName, double initialBalance) {

        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            if (existingBranch.findCustomer(customerName) == null) {
                existingBranch.addCustomerToBranch(customerName, initialBalance);
            }
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) existingBranch.addCustomerTransaction(customerName, amount);
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        System.out.println("\n------ "+bankName+" ------");
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("****** Customers in branch: "+branchName+" *****");

            ArrayList<Customer> customers = branch.getCustomersList();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer "+(i+1)+": "+customer.getCustomerName());
                if (showTransactions) {
                    System.out.println("     Transactions:");
                    ArrayList<Double> transactions = customer.getTransactionsList();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println((j+1)+". "+ transactions.get(j));
                    }
                }
            }
        }
    }

    private Branch findBranch(String branchName) {
        for (Branch currentBranch : branchList) {
            if (currentBranch.getBranchName().equals(branchName)) {
                return currentBranch;
            }
        }
        return null;
    }

}
