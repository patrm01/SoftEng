public class GroceryItem {
    private int itemId;
    private String name;
    private int stock;
    private double price;
    private String filterFlag;
    public GroceryItem(String name, int stock, double price, int itemID) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.itemId = itemID;
        this.filterFlag = "";
    }

    public String getName(String name) {
        return name;
    }
    public int getStock(int stock) {
        return stock;
    }
    public double getPrice(double price) {
        return price;
    }
    public int getItemId(int itemId) {
        return  itemId;
    }
    public String getFilterFlag() {
        return filterFlag;
    }
    public void setFilterFlag(String filterFlag) {
        if(filterFlag != null){
            this.filterFlag = filterFlag;
        }
    }
}