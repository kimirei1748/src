import java.util.ArrayList;
import java.util.List;

/**
 * Central hub for managing cars and clients. 
 * This is where rentals and returns are processed.
 */
public class LendAgency {
    private List<Cars> cars = new ArrayList<>();
    private List<Clients> clients = new ArrayList<>();

    /**
     * Adds a new car to the fleet.
     */
    public void addCar(Cars car) {
        cars.add(car);
    }

    /**
     * Registers a new client into the system.
     */
    public void addClient(Clients client) {
        clients.add(client);
    }

    /**
     * Retrieves the current list of all available cars.
     */
    public List<Cars> getCars() {
        return cars;
    }

    /**
     * Retrieves the current list of all registered clients.
     */
    public List<Clients> getClients() {
        return clients;
    }

    /**
     * Processes a rental request if the car is available.
     * @return true if successful, false if already rented
     */
    public boolean rentCar(Clients client, Cars car) {
        if (!car.isRented()) {
            car.rent();
            return true;
        }
        return false;
    }

    /**
     * Accepts a returned vehicle and makes it available again.
     */
    public void returnCar(Cars car) {
        car.returnCar();
    }
}