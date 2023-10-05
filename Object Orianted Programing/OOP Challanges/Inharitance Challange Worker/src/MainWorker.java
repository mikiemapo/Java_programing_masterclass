public class MainWorker {
    public static void main(String[] args) {

    Employee rob = new Employee("Rob", "1985", "2020"); // inherited  from worker class

    System.out.println(rob);
    System.out.println("Age = " + rob.getAge());
    System.out.println("Pay = " + rob.collectPay());

    SalariedEmployee joe = new SalariedEmployee("Joe", "1990", "2021", 35000);
    System.out.println(joe);
    System.out.println("Joe's paycheck = $" + joe.collectPay());

    joe.retire();
    System.out.println("Joe's Pension check = $" + joe.collectPay());

    HourlyEmployee mary = new HourlyEmployee("Mary", "1970",
            "2021", 15);
    System.out.println(mary);
    System.out.println("mary's Paycheck = $" + mary.collectPay());
    System.out.println("Marry's Holiday Pay = $" + mary.getDoublePay());
    }


}


