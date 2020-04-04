import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }


    public int getStock(){
        return this.stock.size();
    }


    public void addItemToStock(ISell item){
        this.stock.add(item);
    }


    public int removeItem(ISell item) {
        stock.remove(item);
        return getStock();
    }


    public double totalProfit(ArrayList<ISell> stock){
        double profit = 0;
        for (ISell item : stock) {
             profit =+ item.calculateMarkup();
        }
       return profit;
    }

}
