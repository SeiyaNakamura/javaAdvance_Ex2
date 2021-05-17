import java.util.ArrayList;
import java.util.List;

public class AllMenu {
    private List<Menu> mainMenuList;
    private List<Menu> sideMenuList;
    MainMenu gyudon;
    MainMenu butadon;
    MainMenu curry;
    SideMenu potatoSalad;
    SideMenu greenSalad;
    SideMenu misoSoup;
    SideMenu porkSoup;

    AllMenu() {
        mainMenuList = new ArrayList<>();
        gyudon = new MainMenu("牛丼", 380);
        butadon = new MainMenu("豚丼", 400);
        curry = new MainMenu("カレー", 450);
        mainMenuList.add(gyudon);
        mainMenuList.add(butadon);
        mainMenuList.add(curry);

        sideMenuList = new ArrayList<>();
        potatoSalad = new SideMenu("ポテトサラダ", 200);
        greenSalad = new SideMenu("グリーンサラダ", 150);
        misoSoup = new SideMenu("味噌汁", 50);
        porkSoup = new SideMenu("豚汁", 150);
        sideMenuList.add(potatoSalad);
        sideMenuList.add(greenSalad);
        sideMenuList.add(misoSoup);
        sideMenuList.add(porkSoup);
    }

    public MainMenu returnMainMenu(String name) {
        if (name == "牛丼") {
            return gyudon;
        } else if (name == "豚丼") {
            return butadon;
        } else {
            return curry;
        }
    }

    public SideMenu returnSideMenu(String name) {
        if (name == "ポテトサラダ") {
            return potatoSalad;
        } else if (name == "グリーンサラダ") {
            return greenSalad;
        } else if (name == "味噌汁") {
            return misoSoup;
        } else {
            return porkSoup;
        }
    }

    public void showAllMenuList() {
        System.out.println("メインメニュー");
        for (Menu menu : mainMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
        System.out.print("\n");
        System.out.println("サイドメニュー");
        for (Menu menu : sideMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }

    }

    public void showMainMenuList() {
        System.out.println("メインメニュー");
        for (Menu menu : mainMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
    }

    public void showSideMenuList() {
        System.out.println("サイドメニュー");
        for (Menu menu : sideMenuList) {
            System.out.println(String.format("%s : %d￥", menu.name, menu.price));
        }
    }
}