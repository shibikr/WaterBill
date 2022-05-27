package water_bill.models;

public class WaterRate{
    public WaterRate() {
    }

    public int getTotalBorewellRate(Double litresPerMonth) {
        return (int) Math.floor(litresPerMonth * 1.5);
    }

    public int getTotalCorporationRate(Double litresPerMonth) {
        return (int) Math.floor(litresPerMonth * 1.0);
    }

    public int getTotalTankerRate(int litresPerMonth) {
        if(litresPerMonth >= 0 && litresPerMonth <=500) {
            return litresPerMonth * 2;
        } else if (litresPerMonth >= 501 && litresPerMonth <= 1500) {
            return 500 * 2 + (litresPerMonth - 500) * 3;
        } else if (litresPerMonth >= 1501 && litresPerMonth <= 3000) {
            return 500 * 2 + 1000 * 3 + (litresPerMonth - 1500) * 5;
        } else if(litresPerMonth >= 3001){
            return 500 * 2 + 1000 * 3 + 1500 * 5 + (litresPerMonth - 3000) * 8;
        }
        return 0;
    }
}
