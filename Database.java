import java.util.ArrayList;

public class Database {
    private ArrayList<GroceryItem> storeList = new ArrayList<GroceryItem>();
    storeList.add(new GroceryItem("milk", 20, 3.50, 0));
    storeList.add(new GroceryItem("eggs", 100, 1.75, 1));
    storeList.add(new GroceryItem("cheese", 25, 0.30, 2));

    public void addNewItem(String name, int stockCount, double price, int itemID) {
        storeList.add(new Groceryitem(name, stockCount, price, itemID));
    }

    public boolean removeItem(String itemName) {
        GroceryItem item = checkItemInDatabase(itemName);
        if(storeList.remove(item) == true) {
            return true;
        }
        return false;
    }

    public boolean removeItem(GroceryItem item) {
        if(storeList.remove(item) == true) {
            return true;
        }
        return false;
    }

    public GroceryItem checkItemInDatabase(String itemName) {
        for(item : storeList) {
            if(item.GetName().equals(itemName)) {
                return(item);
            }
        }
    }

    public ArrayList<GroceryItem> getStoreList() {
        return storeList;
    }
}
