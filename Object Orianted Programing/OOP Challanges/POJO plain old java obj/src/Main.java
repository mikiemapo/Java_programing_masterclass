public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default ->"Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        //plain old java object method
        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");

        // record class method
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        //plain old java object method
        System.out.println(pojoStudent);

        // record class method
        System.out.println(recordStudent);

        // setting
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // record class cant take setting its immutable
        //recordStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        //plain old java object method
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());//instance method complexNumber.getImaginary()

        // record class method note accessor method no get
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());


    }
}
