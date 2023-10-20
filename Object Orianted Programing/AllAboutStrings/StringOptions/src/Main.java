public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");//wont work ??


        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye");
        System.out.println("-".repeat(20));

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
        System.out.println("-".repeat(20));

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57)); // watch the capacity
        System.out.println("-".repeat(20));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        System.out.println("-".repeat(20));

        printInformation(emptyStart);
        printInformation(emptyStart32);
        System.out.println("-".repeat(20));

        StringBuilder builderPlus = new StringBuilder("Hello" + "World");
        builderPlus.append(" and Goodbye");
        System.out.println("-".repeat(20));

        builderPlus.deleteCharAt(15).insert(15,'g');
        System.out.println(builderPlus);
        System.out.println("-".repeat(20));

        builderPlus.replace(15, 16, "G");
        System.out.println(builderPlus);
        System.out.println("-".repeat(20));

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        System.out.println("-".repeat(20));

    }

    public static void printInformation(String string) {
        System.out.println("String =" + string);
        System.out.println("length = " + string.length());
        System.out.println("-".repeat(20));
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder =" + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
        System.out.println("-".repeat(20));
    }
}
