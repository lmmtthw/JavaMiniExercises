import java.util.ArrayList; // Import Arraylist class
import java.util.List;

public static class ItemStore {
        // Create an Arraylist object named ItemStore
        public static List<Item> database = new ArrayList<>();

        // Static method belongs to the ItemStore class itself. Void means it only runs the code but does not return any value.
        static void addItem(Item item) {
            database.add(item);
        }

        // Method to get all items from the Arraylist
        // Checks if it is empty if not prints out entire database
        static void getAllItems() {
            if (database.isEmpty()) {
                System.out.println("Database is empty");
            }
            else {
                System.out.println(database);
            }
        }

        // Checks if the user inputted name exists.
        // if it exists, it will set the new value for the following parameters: Name, Quantity and Price
        static void updateItem(int productID, String newName, int newQuantity, double newPrice) {
            for (Item item: database) {
                if (productID == item.getID()) {
                    item.setName(newName);
                    item.setQuantity(newQuantity);
                    item.setPrice(newPrice);
                };
            }
        }

        // Checks if the productID exists. If it does exist and match, remove it.
    /**
     * One of the common problem while removing elements from an ArrayList in Java is the ConcurrentModificationException.
     *
     * If you use classical for loop with the index or enhanced for loop and try to remove an element from the ArrayList using remove() method, you will get the ConcurrentModificationException but if you use Iterator's remove() method or ListIterator's remove() method, then you won't get this error and be able to remove the element.
     *
     * It’s an unwritten rule in Java that while looping through the list, you should not add() or remove() elements until the collection supports fail-safe Iterator e.g. CopyOnWriteArrayList, which operate on a copy of list rather than the original list.
     *
     * The main problem with this error is that it confuses developer that list is getting modified by multiple threads and that’s why Java is throwing this error, it’s not true. Most of the time ConcurrentModificationException comes even without multiple threads modifying the list.
     */
        static void deleteItem(int productID) {
            // Creating an Iterator for the ArrayList
            Iterator<Item> databaseList = database.iterator();

            // Iterating through the list
            while (databaseList.hasNext()) {

                // Getting the next element
                Item i = databaseList.next();

                // Removing item if matches productID
                if (i.getID() == productID) {
                    databaseList.remove();
                }
            }

        }
}

void main() {

    // Invoke the method addItem() from the ItemStore class.
    // The arraylist named "database" has been created in the ItemStore Class.
    Item e = new Item(2, "penE", 30, 5.00);
    Item l = new Item(3, "penL", 30, 5.00);
    ItemStore.addItem(e);
    ItemStore.addItem(l);
    System.out.println(ItemStore.database);
    ItemStore.updateItem(2, "pen2", 40, 10.00);
    ItemStore.getAllItems();
    ItemStore.deleteItem(3);
    ItemStore.getAllItems();

};

