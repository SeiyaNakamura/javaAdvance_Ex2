public abstract class Menu {
    protected String name;
    protected int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract int returnPrice();

    public String getName() {
        return name;
    }
    
}