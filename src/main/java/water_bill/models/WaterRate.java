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
        return litresPerMonth * getRate(litresPerMonth);
    }

    private int getRate(int litresPerMonth) {
        if(litresPerMonth >= 0 && litresPerMonth <=500) {
            return 2;
        } else if (litresPerMonth >= 501 && litresPerMonth <= 1500) {
            return 3;
        } else if (litresPerMonth >= 1501 && litresPerMonth <= 3000) {
            return 5;
        } else if(litresPerMonth >= 3001){
            return 8;
        }
        return 0;
    }
}
