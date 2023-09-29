//template
public class Car {

    // encapsulation
    private String make= "Tesla";
    private  String model= "model Y";
    private  String color= "Gray";
    private  int doors= 4;
    private  boolean convertible= true;


    //getters
    //use getter to access pvt class
    public  String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    //SETTERS
    //use setters to access pvt template class as well as have restricted validation methods
    public void setMake(String make) {
        //the word this is a way to refer an obj or instance and not the value in the parameter
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        //use setters to access pvt template class as well as have restricted validation methods fully encapsulating color
        if (color == null) color = "Unknown"; // check iif null
        String lowercaseColor = color.toLowerCase(); //take param string and returns lowercase
        switch ( lowercaseColor){ // switch to test if match cases
            case "red", "blue", "white", "gray" -> this.color = color; // if so then set the param to obj passed
            default -> {
                this.color = "Unsupported "; // if not then blah
            }
        }

    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //method
    public void discribeCar(){
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : " "));
    }
}
