package water_bill.models;

import water_bill.models.apartment.Apartment;

public class Bill {
    private Apartment apartment;

    public Bill(Apartment apartment) {
        this.apartment = apartment;
    }

    public int getTotalWaterConsumed() {
        return this.apartment.totalWaterConsumedForMonth();
    }

    public int getTotalCost() {
        return 0;
    }
}
