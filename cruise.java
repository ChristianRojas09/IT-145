public class Cruise {

    // Class Variables

    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    Cruise() {}

    // Full Constructors

    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {

        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;

    }

    // Accessors

    public String getCruiseName() {
        return cruiseName;

    }

    public String getCruiseShipName() {
        return cruiseShipName;

    }

    public String getDeparturePort() {
        return departurePort;

    }

    public String getDestination() {
        return destination;

    }

    public String getReturnPort() {
        return returnPort;

    }

    // Mutators

    public void setCruiseName(String tVar) {
        cruiseName = tVar;

    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;

    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;

    }

    public void setDestination(String tVar) {
        destination = tVar;

    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;

    }

    // print cruise details
    public void printCruiseDetails() {

        // complete this method
        System.out.println("Cruise Name: " + cruiseName);
        System.out.println("Cruise Ship Name: " + cruiseShipName);
        System.out.println("Departure Port: " + departurePort);
        System.out.println("Destination: " + destination);
        System.out.println("Return Port: " + returnPort);

    }

    // method added to print ship's name vice memory address
    @Override

    public String toString() {
        return cruiseName;

    }

    public static void main(String args[]) {

       System.out.println("Calling Constructor....");
        Cruise c = new Cruise("Titanic X", "Titatic", "Hargeon Port", "Port Blair", "Hargeon port");
        System.out.println("Cruise(\"Titanic X\", \"Titatic\", \"Hargeon Port\", \"Port Blair\", \"Hargeon port\")");
        System.out.println("Calling printCruiseDetails() on created object....");
        c.printCruiseDetails();
    }

}