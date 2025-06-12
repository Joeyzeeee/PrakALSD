package Jobsheet14;

import java.util.ArrayList;

public class DemoArrayList09 {

    public static void main(String[] args) {
        ArrayList<Customer09> customers = new ArrayList<>();
        ArrayList<Customer09> newCustomers = new ArrayList<>();

        Customer09 customers1 = new Customer09(1, "Zakia");
        Customer09 customers2 = new Customer09(2, "Budi");

        customers.add(customers1);
        customers.add(customers2);

        customers.add(new Customer09(4, "Cica"));

        customers.add(2, new Customer09(100, "Rosa"));

        System.out.println(customers.indexOf(customers2));

        Customer09 customer09 = customers.get(1);
        System.out.println(customer09.name);
        customer09.name = "Budi Utomo";

        newCustomers.add(new Customer09(201, "Della"));
        newCustomers.add(new Customer09(202, "Victor"));
        newCustomers.add(new Customer09(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer09 cust : customers) {
            System.out.println(cust.toString());

            System.out.println(customers);
        }
    }

}
