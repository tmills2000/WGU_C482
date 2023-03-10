package wgu.me.c482;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Product {
    private ObservableList<Part> associatedParts = FXCollections.observableArrayList();
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    public Product(int id, String name, double price, int stock, int min, int max) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    /**
     * Sets the ID of the Product.
     *
     * @param id the id to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the name of the Product.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of the Product.
     *
     * @param price the price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the stock of the Product.
     *
     * @param stock the stock to set.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Sets the min stock boundary of the Product.
     *
     * @param min the min to set.
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Sets the max stock boundary of the Product.
     *
     * @param max the max to set.
     */
    public void setMax(int max) {
        this.max = max;
    }
    public void setAssociatedParts(ObservableList<Part> associatedParts) {
        this.associatedParts = associatedParts;
    }

    /**
     * Gets the ID of the current Product.
     *
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the name of the current Product.
     *
     * @return the name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the price of the current Product.
     *
     * @return the price.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the stock of the current Product.
     *
     * @return the stock.
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Gets the min stock boundary of the current Product.
     *
     * @return the min stock boundary
     */
    public int getMin() {
        return this.min;
    }

    /**
     * Gets the max stock boundary of the current Product.
     *
     * @return the max stock boundary.
     */
    public int getMax() {
        return this.max;
    }

    /**
     * Adds a part to the ObservableList of Parts associated with the current Product.
     *
     * @param part the part to be added to the List.
     */
    public void addAssociatedPart(Part part) {
        this.associatedParts.add(part);
    }

    /**
     * 
     * @param associatedParts
     * @return
     */
    public void addAssociatedParts(ObservableList<Part> associatedParts) {
        for (Part part : associatedParts) {
            addAssociatedPart(part);
        }
    }

    /**
     * Deletes a single part from the list of associated parts.
     *
     * @param selectedAssociatedPart the singular part to be deleted from the associated parts list
     * @return true if successfully deleted and false if unsuccessfully deleted.
     */
    public boolean deleteAssociatePart(Part selectedAssociatedPart) {
        return associatedParts.remove(selectedAssociatedPart);
    }
    /**
     * Removes all parts from the List of Parts associated with the current Product.
     */
    public void deleteAllAssociatedParts() {
        if (associatedParts != null) {
            this.associatedParts.clear();
        }
    }

    /**
     * Gets the List of Parts associated with the current Product.
     *
     * @return List of Parts
     */
    public ObservableList<Part> getAllAssociatedParts() {
        return this.associatedParts;
    }
}
