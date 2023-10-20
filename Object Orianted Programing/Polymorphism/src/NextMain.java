public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Dodo");
        Comedy comedyMovie = ( Comedy ) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Dodo");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) { // instanceof operator tests the type of an object instance the
            //reff variable been tested is to the left operand unknownO....
            // the type we testing for is the right operand Adv...
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
