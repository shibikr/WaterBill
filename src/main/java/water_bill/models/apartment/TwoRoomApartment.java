package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class TwoRoomApartment implements Apartment {
    private final int numberOfPeople;
    private int noOfGuests;
    private WaterRatio waterRatio;

    public TwoRoomApartment(int noOfGuests, WaterRatio waterRatio) {
        this.noOfGuests = noOfGuests;
        this.waterRatio = waterRatio;
        this.numberOfPeople = 3;
    }

    @Override
    public int waterConsumptionPerMonthResidents() {
        return this.numberOfPeople * waterConsumptionPerMonthForEachPerson;
    }

    @Override
    public int waterConsumptionPerMonthGuests() {
        return this.noOfGuests * waterConsumptionPerMonthForEachPerson;
    }

    @Override
    public int totalWaterConsumedForMonth() {
        return waterConsumptionPerMonthResidents() + waterConsumptionPerMonthGuests();
    }

    @Override
    public Double totalWaterConsumedFromBoreWell() {
        return Double.valueOf(waterConsumptionPerMonthResidents() / getTotalWaterRatio()) * waterRatio.getBoreWellWater();
    }

    @Override
    public Double totalWaterConsumedFromCorporation() {
        return Double.valueOf(waterConsumptionPerMonthResidents() / getTotalWaterRatio()) * waterRatio.getCorporationWater();
    }

    private int getTotalWaterRatio() {
        return waterRatio.getCorporationWater() + waterRatio.getBoreWellWater();
    }
}
