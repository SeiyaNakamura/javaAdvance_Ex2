public class SideMenu extends Menu {
    
    SideMenu(String name, int price) {
        super(name,price);
    }

    @Override
    public int returnPrice() {
        return price;
    }
}