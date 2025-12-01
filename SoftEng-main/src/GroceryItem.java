public class GroceryItem {
    private int itemId;
    private String name;
    private int stock;
    private double price;
    private String filter;
    public GroceryItem(String name, int stock, double price, int itemID) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.itemId = itemID;
        this.filter = "";
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public int getItemId() {
        return itemId;
    }
    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        if(filter != null){
            this.filter = filter;
        }
    }

    public String toString(){
        return "Item ID: " + itemId + ", Name: " + name + ", Stock: " + stock + ", Price: $" + price;
    }
}