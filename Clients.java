/**
 * Represents a person looking to borrow a vehicle from our network.
 */
public class Clients {
    private String name;
    private String id;

    /**
     * Registers a new client with their full name and national ID.
     */
    public Clients(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Retrieves the full name of the client.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the national ID of the client.
     */
    public String getId() {
        return id;
    }
}