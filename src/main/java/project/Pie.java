package project;

public class Pie extends Bakery{
    private String name;
    private String topping;
    private boolean healthyPie;
    private int stock;

    public Pie(double cost, String doughType, boolean Fresh, String name, String topping, boolean healthyPie, int stock){
        super(cost, doughType, Fresh);
        this.name = name;
        this.topping = topping;
        this.healthyPie = false;
        this.stock = stock;
    }

    public void addHealthyPie(){
        setHealthy(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isHealthy() {
        return healthyPie;
    }

    public void setHealthy(boolean healthy) {
        this.healthyPie = healthy;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
