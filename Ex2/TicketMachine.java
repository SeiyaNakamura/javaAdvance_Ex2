public class TicketMachine {
    private AllMenu allMenu;
    private Stocker stocker;
    private Cash cash;

    TicketMachine() {
        allMenu = new AllMenu();
        stocker = new Stocker();
    }

    public void showAllMenu() {
        allMenu.showAllMenuList();
    }

    public void showMainMenu() {
        allMenu.showMainMenuList();
    }

    public void showSideMenu() {
        allMenu.showSideMenuList();
    }

    public void stockMainMenu(String name, String size) {
        stocker.stockMainMenu(name, size);
    }

    public void stockSideMenu(String name) {
        stocker.stockSideMenu(name);
    }

    public void removeMainMenu(String name) {
        stocker.removeMainMenu(name);
    }

    public void getStockMainMenuList() {
        for (MainMenu menu : stocker.returnStockMainMenu()) {
            System.out.println(String.format("%s",menu.getName()));
        }
    }

    public void getStockSideMenuList() {
        for (SideMenu menu : stocker.returnStockSideMenu()) {
            System.out.println(String.format("%s",menu.getName()));
        }
    }

    public void purchase() {
        cash = new Cash(stocker.getSum());
    }

    public void pay(int payment) {
        cash.pay(payment);
    }

    public int getChange() {
        return cash.getChange();
    }
}