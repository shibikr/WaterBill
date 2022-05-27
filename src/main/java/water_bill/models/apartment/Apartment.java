package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class Apartment {
    private final int WATER_PER_DAY_FOR_EACH_PERSON = 10;
    private final int DAYS_OF_MONTH = 30;
    private int numberOfPeople;
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
        return Double.valueOf(waterConsumptionPerMonthResidents() * (waterRatio.getBoreWellWater()/getTotalWaterRatio()));
    }

    public Double totalWaterConsumedFromCorporation() {
        return Double.valueOf(waterConsumptionPerMonthResidents() * ( waterRatio.getCorporationWater()/getTotalWaterRatio()));
    }

    private int getTotalWaterRatio() {
        return waterRatio.getCorporationWater() + waterRatio.getBoreWellWater();
    }

    private int waterConsumptionPerMonthForEachPerson() {
      return WATER_PER_DAY_FOR_EACH_PERSON * DAYS_OF_MONTH;
    }
}
