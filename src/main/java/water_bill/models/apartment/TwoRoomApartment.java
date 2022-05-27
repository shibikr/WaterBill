package water_bill.models.apartment;

import water_bill.models.WaterRatio;
import water_bill.models.apartment.Apartment;

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
}
