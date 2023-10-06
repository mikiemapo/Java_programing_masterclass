public class MainWorker {
    public static void main(String[] args) {

    Employee rob = new Employee("Rob", "10/10/1985", "01/10/2020"); // inherited  from worker class

    System.out.println(rob);
    System.out.println("Age = " + rob.getAge());
    System.out.println("Pay = " + rob.collectPay());

    SalariedEmployee joe = new SalariedEmployee("Joe", "10/10/1990", "01/10/2021", 35000);
    System.out.println(joe);
    System.out.println("Joe's paycheck = $" + joe.collectPay());

    joe.retire();
    System.out.println("Joe's Pension check = $" + joe.collectPay());

    HourlyEmployee mary = new HourlyEmployee("Mary", "10/10/1970",
            "01/01/2021", 15);
    System.out.println(mary);
    System.out.println("mary's Paycheck = $" + mary.collectPay());
    System.out.println("Marry's Holiday Pay = $" + mary.getDoublePay());
    }


}


