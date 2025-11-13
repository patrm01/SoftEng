import java.util.ArrayList;

public class Controller {

    private Database database;

    public Controller() {
        database = new Database();
    }

    public ArrayList<GroceryItem> getData() {
        return database.getStoreList();
    }

    public sendDatabase() {

    }

    public validateData() {

    }

    public sendInterface() {

    }

    public ArrayList<GroceryItem> filterItems(ArrayList<String> filters){
        ArrayList<GroceryItem> items = new ArrayList<>();
        if (filters == null || filters.size() == 0){
            return items;
        }
        return items;

    }

    public ArrayList<GroceryItem> getCart() {
        return cart;
    }
}
