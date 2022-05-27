package water_bill.models.apartment;

public interface Apartment {
    int waterPerDayForEachPerson = 10;
    int daysOfMonth = 30;

    int waterConsumptionPerMonthForEachPerson = waterPerDayForEachPerson * daysOfMonth;
    int waterConsumptionPerMonthResidents();
    int waterConsumptionPerMonthGuests();

    int totalWaterConsumedForMonth();
}
