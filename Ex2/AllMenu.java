import java.util.ArrayList;
import java.util.List;

public class AllMenu {
    private List<MainMenu> mainMenuList = new ArrayList<>();
    private List<SideMenu> sideMenuList = new ArrayList<>();

    public AllMenu() {
        mainMenuList.add(new MainMenu("牛丼", 380));
        mainMenuList.add(new MainMenu("豚丼", 400));
        mainMenuList.add(new MainMenu("カレー", 450));

        sideMenuList.add(new SideMenu("ポテトサラダ", 200));
        sideMenuList.add(new SideMenu("グリーンサラダ", 150));
        sideMenuList.add(new SideMenu("味噌汁", 50));
        sideMenuList.add(new SideMenu("豚汁", 150));
    }

    public MainMenu returnMainMenu(String name) {
        for (MainMenu menu : mainMenuList) {
            if (name.equals(menu.getName())) {
                return menu;
            } else {
            }
        }
        return null;
    }

    public SideMenu returnSideMenu(String name) {
        for (SideMenu menu : sideMenuList) {
            if (name.equals(menu.getName())) {
                return menu;
            } else {
            }
        }
        return null;
    }

    public void showAllMenuList() {
        System.out.println("メインメニュー");
        for (MainMenu menu : mainMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
        System.out.print("\n");
        System.out.println("サイドメニュー");
        for (SideMenu menu : sideMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
    }

    public void showMainMenuList() {
        System.out.println("メインメニュー");
        for (MainMenu menu : mainMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
    }

    public void showSideMenuList() {
        System.out.println("サイドメニュー");
        for (SideMenu menu : sideMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
    }
}