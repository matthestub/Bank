public class Main {
    public static void main(String[] args) {


        Bank bank1 = new Bank("National Bank of Poland");

        if (bank1.addNewBranch("Warsaw")) {

            bank1.addNewCustomer("Warsaw", "Tom", 900);
            bank1.addNewCustomer("Warsaw", "Kate", 1200);
            bank1.addNewCustomer("Warsaw", "Jack", 875);

            bank1.addCustomerTransaction("Warsaw", "Tom", -412);
            bank1.addCustomerTransaction("Warsaw", "Tom", 960);
            bank1.addCustomerTransaction("Warsaw", "Tom", 230);

            bank1.addCustomerTransaction("Warsaw", "Kate", 657);
            bank1.addCustomerTransaction("Warsaw", "Kate", 789);
            bank1.addCustomerTransaction("Warsaw", "Kate", -1256);
            bank1.addCustomerTransaction("Warsaw", "Kate", 12);

            bank1.addCustomerTransaction("Warsaw", "Jack", -900);
            bank1.addCustomerTransaction("Warsaw", "Jack", 4567);

        }



        if (bank1.addNewBranch("Gdansk")) {

            bank1.addNewCustomer("Gdansk", "Pawel", 341);
            bank1.addNewCustomer("Gdansk", "Gregory", 89.95);
            bank1.addNewCustomer("Gdansk", "Caroline", 1594.19);

        }

        bank1.listCustomers("Warsaw", true);
        bank1.listCustomers("Gdansk", false);

    }
}
