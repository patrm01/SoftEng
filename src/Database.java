import java.util.ArrayList;

public class Database {
    private ArrayList<GroceryItem> storeList = new ArrayList<GroceryItem>();
    {
        storeList.add(new GroceryItem("milk", 20, 3.50, 0));
        storeList.add(new GroceryItem("eggs", 100, 1.75, 1));
        storeList.add(new GroceryItem("cheese", 25, 0.30, 2));
    }

    public void addNewItem(String name, int stockCount, double price, int itemID) {
        storeList.add(new GroceryItem(name, stockCount, price, itemID));
    }

    public boolean removeItem(String itemName) {
        GroceryItem item = checkItemInDatabase(itemName);
        if (item != null) {
            removeItem(item);
        }
        return false;
    }

    public boolean removeItem(GroceryItem item) {
        return storeList.remove(item);
    }

    public GroceryItem checkItemInDatabase(String itemName) {
        for(GroceryItem item : storeList) {
            if(item.getName().equals(itemName)) {
                return item;
            }
        }
        //has to have check for item not found
        return null;
    }


    public ArrayList<GroceryItem> getStoreList() {
        return storeList;
    }

    public ArrayList<GroceryItem> getFilteredList(ArrayList<String> filters) {
        ArrayList<GroceryItem> filteredList = new ArrayList<>();

        for (GroceryItem item : storeList) {
            if (filters.contains(item.getFilterFlag())) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
