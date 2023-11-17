package project;

public class Rolls extends Bakery{
    private String name;
    private String filling;
    private boolean celebrationCake;
    private int stock;

    public Rolls(double cost, String doughType, boolean Fresh, String name, String filling, boolean celebrationCake, int stock){
        super(cost, doughType, Fresh);
        this.name = name;
        this.filling = filling;
        this.celebrationCake = false;
        this.stock = stock;
    }

    public void addCelebrationCake(){
        setCelebrationCake(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public boolean isCelebrationCake() {
        return celebrationCake;
    }

    public void setCelebrationCake(boolean celebrationCake) {
        this.celebrationCake = celebrationCake;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
