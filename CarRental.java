/**
 * Entry point to our vehicle rental system.
 * Demonstrates a full rental flow using test data.
 */
public class CarRental {
    public static void main(String[] args) {
        LendAgency agency = new LendAgency();

        Cars gari1 = new Cars("Kenyamachine", "GariFiti", 2020);
        Cars gari2 = new Cars("Kenyamachine", "GariFiti", 2019);
        Clients isaac = new Clients("Isaac Wainaina", "KE001");

        agency.addCar(gari1);
        agency.addCar(gari2);
        agency.addClient(isaac);

        System.out.println("\nIsaac trying to take out the first GariFiti...");
        if (agency.rentCar(isaac, gari1)) {
            System.out.println("Success! Isaac is now cruising with the ride.");
        } else {
            System.out.println("Couldn’t process. The ride is currently taken.");
        }

        System.out.println("\nAttempting another rental on the same ride...");
        if (!agency.rentCar(isaac, gari1)) {
            System.out.println("Expected result: Still in use by someone else.");
        } else {
            System.out.println("Unexpected behavior! Car lent twice?");
        }

        System.out.println("\nIsaac bringing back the ride...");
        agency.returnCar(gari1);

        System.out.println("\nIsaac goes again for the same ride...");
        if (agency.rentCar(isaac, gari1)) {
            System.out.println("Nice one! The ride is back with Isaac.");
        }

        System.out.println("\nFinal report of available rides:");
        for (Cars car : agency.getCars()) {
            System.out.println(car);
        }
    }
}