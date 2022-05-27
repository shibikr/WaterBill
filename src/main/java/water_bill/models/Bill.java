package water_bill.models;

import water_bill.models.apartment.Apartment;

public class Bill {
    private Apartment apartment;
    private WaterRate waterRate;

    public Bill(Apartment apartment, WaterRate waterRate) {
        this.apartment = apartment;
        this.waterRate = waterRate;
    }

    public int getTotalWaterConsumed() {
        return this.apartment.totalWaterConsumedForMonth();
    }

    public int getTotalCost() {
        return totalCostForBorewellWater() + totalCostForTankerWater() +totalCostForCorporationWater();
    }

    private int totalCostForBorewellWater() {
        return waterRate.getTotalBorewellRate(apartment.totalWaterConsumedFromBoreWell());
    }

    private int totalCostForCorporationWater() {
        return waterRate.getTotalCorporationRate(apartment.totalWaterConsumedFromCorporation());
    }

    private int totalCostForTankerWater() {
        return waterRate.getTotalTankerRate(apartment.waterConsumptionPerMonthGuests());
    }
}
