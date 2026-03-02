/*
 * This is class declaration which contains all the code that provides the lifecycle of the objects created from the class.
 */
public class Item {

    /*
    The Item class has three fields.
    The three fields are declared as private.
    This is known as Encapsulation.
    Encapsulation is to make sure that "sensitive" data is hidden from users.
    To achieve this, class variables/attributes must be declared as private.
    Then proceed to provide public get and set methods to access and update the value of a private variable
     */
    private int id;
    private String name;
    private int quantity;
    private double price;

    /*
     *     The Item class has one constructor.
     *     The constructor is a special method to initialize objects.
     */
    public Item (int originalID, String originalName, int originalQuantity, double originalPrice) {

        id = originalID;
        name = originalName;
        quantity = originalQuantity;
        price = originalPrice;

    }

    /*
     * The number and types of getters and setters correspond to the number of attributes.
     * The get method returns the variable value, and the set method sets the value.
     */
    public int getID() {
        return id;
    }

    public void setID(int newID) { this.id = newID; }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "[ " + "ID:" + getID() + " " + "Name:" + getName() + " Quantity:" + getQuantity() + " Price:" + getPrice() + " ]";
    }

}
