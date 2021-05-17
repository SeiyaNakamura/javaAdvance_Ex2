public class MainMenu extends Menu {
    private Size size;

    MainMenu(String name, int price) {
        super(name,price);
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getSizePrice() {
        return size.getSizePrice();
    }

    @Override
    public int returnPrice() {
        return price;
    }
}