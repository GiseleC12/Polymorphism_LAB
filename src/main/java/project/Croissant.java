package project;

public class Croissant extends Bakery{
    private String name;
    private String topping;
    private boolean healthy;
    private int stock;

    public Croissant(double cost, String doughType, boolean Fresh, String name, String topping, boolean healthy, int stock) {
        super(cost, doughType, Fresh);
        this.name = name;
        this.topping = topping;
        this.healthy = false;
        this.stock = stock;
    }

    public void addHealthy(){
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
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
