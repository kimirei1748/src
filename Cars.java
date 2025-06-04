/**
 * Represents a typical Kenyan vehicle that's part of our local community lending platform.
 */
public class Cars {
    private String make;
    private String model;
    private int year;
    private boolean isRented;

    /**
     * Initializes a fresh car entry with its brand, model, and year of manufacture.
     * The car is considered available by default.
     */
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRented = false; // Not yet booked
    }

    /**
     * Checks whether the car is currently rented out.
     * @return true if the car is in use, false otherwise
     */
    public boolean isRented() {
        return isRented;
    }

    /**
     * Marks the car as currently in use.
     */
    public void rent() {
        this.isRented = true;
    }

    /**
     * Makes the car available again after being returned.
     */
    public void returnCar() {
        this.isRented = false;
    }

    /**
     * Gives a friendly description of the car, including availability status.
     */
    @Override
    public String toString() {
        return year + " " + make + " " + model + (isRented ? " (Currently Out)" : " (Available)");
    }
}