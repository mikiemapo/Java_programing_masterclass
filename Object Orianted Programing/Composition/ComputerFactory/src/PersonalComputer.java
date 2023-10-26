public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacture,
                            ComputerCase computerCase, Monitor monitor,
                            MotherBoard motherBoard) {
        super(model, manufacture);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");

    }

    public void powerUp(){
        computerCase.pressButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
