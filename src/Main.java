public class Main {
    public static void main(String[] args) {
        Man alex = new Man("Alex", "Miller", 35, false);
        Woman kate = new Woman("Kate", "Sorros", 32, false);

        Man tim = new Man("Timothy", "Nelson", 63, false);
        Woman grandma = new Woman("Nata", "Milova", 63, true);

        Woman jess = new Woman("Jessica", "Simpson", 33, true, tim);

        System.out.println("Printing properties of kate and alex before marriage:");
        kate.printHumanProperties();
        alex.printHumanProperties();

        System.out.println("_______________________________");

        alex.deregisterPartnership();
        alex.registerPartnership(kate);

        System.out.println("________________________________");

        System.out.println("printing properties of kate and alex after marriage");
        kate.printHumanProperties();
        alex.printHumanProperties();

        System.out.println("_________________________________");

        kate.deregisterPartnership();
        System.out.println("printing properties of kate and alex after divorce");
        kate.printHumanProperties();
        alex.printHumanProperties();

        alex.listenMusic();
    }
}
