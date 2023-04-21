package comprog2;
public class Household {
    private int occupants;
    private double income;

    public Household() {
        this.occupants = 1;
        this.income = 0;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getOccupants() {
        return this.occupants;
    }

    public double getIncome() {
        return this.income;
    }
}