package water_bill.models;

public class Bill {
    private int totalWaterConsumed;
    private int totalCost;

    public Bill(int totalWaterConsumed, int totalCost) {
        this.totalWaterConsumed = totalWaterConsumed;
        this.totalCost = totalCost;
    }

    public int getTotalWaterConsumed() {
        return totalWaterConsumed;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
