package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class ThreeRoomApartment implements Apartment {
    private final int numberOfPeople;
    private int noOfGuests;
    private WaterRatio waterRatio;

    public ThreeRoomApartment(int noOfGuests, WaterRatio waterRatio) {
        this.noOfGuests = noOfGuests;
        this.waterRatio = waterRatio;
        this.numberOfPeople = 5;
    }

    @Override
    public int waterConsumptionPerMonthResidents() {
        return this.numberOfPeople * waterConsumptionPerMonthForEachPerson;
    }

    @Override
    public int waterConsumptionPerMonthGuests() {
        return noOfGuests * waterConsumptionPerMonthForEachPerson;
    }

    @Override
    public int totalWaterConsumedForMonth() {
        return waterConsumptionPerMonthResidents() + waterConsumptionPerMonthGuests();
    }
}
