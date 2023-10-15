public class PersonalComputer extends Product{
    private Monitor monitor;
    private MotherBoard motherboard;
    private ComputerCase computercase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, MotherBoard motherboard,
                            ComputerCase computercase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computercase = computercase;
    }

    // We don't allow to access those object directly now.
//    public Monitor getMonitor() {
//        // return an Object!
//        return monitor;
//    }
//
//    public MotherBoard getMotherboard() {
//        // return an Object!
//        return motherboard;
//    }
//
//    public ComputerCase getComputercase() {
//        // return an Object!
//        return computercase;
//    }

    //Compositon

    private void drawLogo(){
        monitor.drawPixelAt(23,55,"red");
    }

    public void powerUp(){

        computercase.pressPowerButton();
        drawLogo();
    }


}
