public class Main {
    public static void main(String[] args) {
        ComputerCase computercase = new ComputerCase("2208", "Dell", "240");
        // Call a method that does not exist in the subclass ( i.e. The subclass does not override the method)
        // JAVA will try to call the same name method in the parent class.
        System.out.println(computercase);
        Monitor monitor = new Monitor("P2024", "PHILIPS", 24, "1080P");
        System.out.println(monitor);
        MotherBoard motherboard = new MotherBoard("730K", "Intel", 12,100, "ABCD bios");
        System.out.println(motherboard);

        PersonalComputer pc = new PersonalComputer("Nice pc", "AMD", monitor, motherboard, computercase);

        System.out.println();
        // get the monitor object using getter, then call the method named drawPixelAt
//        pc.getMonitor().drawPixelAt(180, 430, "blue");
//        pc.getMotherboard().loadProgram("Windows OS");
//        pc.getComputercase().pressPowerButton();

        // 使用Compostion, the main class does not (and don't have to) actually know about PersonalComputer's parts.
        pc.powerUp();

    }
}