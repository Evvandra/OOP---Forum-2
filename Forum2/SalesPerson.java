package Forum2;
import java.util.*;

public class SalesPerson {

    private String id;
    private Sales[] salesHistory;
    private int count = 0;

    public SalesPerson(String id) {
        this.id = id;
        salesHistory = new Sales[100];
    }

    public SalesPerson(String id, Sales[] salesHistory, int count) {
        // Initialize the SalesPerson object with the given values
        this.id = id;
        this.salesHistory = salesHistory;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public Sales[] getSalesHistory() {
        return salesHistory;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count = count + 1;
    }

    public double calcTotalSales() {
        double total = 0;
        for (int x = 0; x < count; x++) {
            total += salesHistory[x].getValue() * salesHistory[x].getQuantity();
        }
        return total;
    }

    public Sales largestSale() {
        double maxSale = 0;
        Sales largestSale = null;
        for (int x = 0; x < count; x++) {
            double saleValue = salesHistory[x].getValue() * salesHistory[x].getQuantity();
            if (saleValue > maxSale) {
                maxSale = saleValue;
                largestSale = salesHistory[x];
            }
        }
        return largestSale;
    }
}
