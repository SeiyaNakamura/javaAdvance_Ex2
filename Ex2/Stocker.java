import java.util.ArrayList;
import java.util.List;

public class Stocker {
    private AllMenu allMenu;
    private AllSize allSize;
    private List<MainMenu> stockMainMenuList;
    private List<SideMenu> stockSideMenuList;

    Stocker() {
        allMenu = new AllMenu();
        allSize = new AllSize();
        stockMainMenuList = new ArrayList<>();
        stockSideMenuList = new ArrayList<>();
    }

    public void stockMainMenu(String name, String size) {
        MainMenu stockMenu;
        stockMenu = allMenu.returnMainMenu(name);
        stockMenu.setSize(allSize.returnSize(size));
        stockMainMenuList.add(stockMenu);
    }

    public void stockSideMenu(String name) {
        SideMenu stockMenu = allMenu.returnSideMenu(name);
        stockSideMenuList.add(stockMenu);
    }

    public void removeMainMenu(String name) {
        MainMenu stockMenu;
        stockMenu = allMenu.returnMainMenu(name);
        stockMainMenuList.remove(stockMainMenuList.indexOf(stockMenu));
    }

    public List<MainMenu> returnStockMainMenu() {
        return stockMainMenuList;
    }

    public List<SideMenu> returnStockSideMenu() {
        return stockSideMenuList;
    }

    public int getSum() {
        int sum = 0;
        List<MainMenu> mainMenuList = returnStockMainMenu();
        List<SideMenu> sideMenuList = returnStockSideMenu();
        for (MainMenu menu : mainMenuList) {
            sum += menu.getSizePrice();
            sum += menu.returnPrice();
        }
        for (SideMenu menu : sideMenuList) {
            sum += menu.returnPrice();
        }
        return sum;
    }
}