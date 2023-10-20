public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + "  film");
    }

    public static Movie getMovie(String type, String title){ //factory method a way to get a method without having to
                                                            // create a new one or specify tghe exact class
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default ->  new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Pleasant Scene",
                "Scary music",
                "Something Bad Happens");
    }
    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }
}

class Comedy extends Movie {
    public Comedy (String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy() {
        System.out.println("Watching an Comedy");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Bad Aliens do bad stuff",
                "Space guys chase Aliens",
                "Planet blows UP");
    }
    public void watchScienceFiction() {
        System.out.println("Watching an Sci Fi");
    }
}


