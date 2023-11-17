package project;

import interfaces.ISell;

public abstract class Bakery implements ISell {
    private double cost;
    private String doughType;
    private boolean fresh;

    public Bakery(double cost, String doughType, boolean Fresh){
        this.cost = cost;
        this.doughType = doughType;
        this.fresh = true;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDoughType() {
        return doughType;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
