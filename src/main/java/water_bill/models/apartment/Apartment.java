package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class Apartment {
    private final int waterPerDayForEachPerson = 10;
    private final int daysOfMonth = 30;
    private final int numberOfPeople;
    private int noOfGuests;
    private WaterRatio waterRatio;

    public Apartment(int noOfGuests, WaterRatio waterRatio, int numberOfPeople) {
        this.noOfGuests = noOfGuests;
        this.waterRatio = waterRatio;
        this.numberOfPeople = numberOfPeople;
    }
    public int waterConsumptionPerMonthResidents() {
        return this.numberOfPeople * waterConsumptionPerMonthForEachPerson();
    }

    public int waterConsumptionPerMonthGuests() {
        return noOfGuests * waterConsumptionPerMonthForEachPerson();
    }

    public int totalWaterConsumedForMonth() {
        return waterConsumptionPerMonthResidents() + waterConsumptionPerMonthGuests();
    }

    public Double totalWaterConsumedFromBoreWell() {
        return Double.valueOf(waterConsumptionPerMonthResidents() / getTotalWaterRatio()) * waterRatio.getBoreWellWater();
    }

    public Double totalWaterConsumedFromCorporation() {
        return Double.valueOf(waterConsumptionPerMonthResidents() / getTotalWaterRatio()) * waterRatio.getCorporationWater();
    }

    private int getTotalWaterRatio() {
        return waterRatio.getCorporationWater() + waterRatio.getBoreWellWater();
    }

    private int waterConsumptionPerMonthForEachPerson() {
      return waterPerDayForEachPerson * daysOfMonth;
    }
}
