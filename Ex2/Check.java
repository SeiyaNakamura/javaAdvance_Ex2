public class Check {
    public static void main(String[] args) {
        //Menu curry = new MainMenu("カレー",450);
        //System.out.print(curry.name);
        TicketMachine ticketMachine = new TicketMachine();

        //ticketMachine.showAllMenu();
        //ticketMachine.showMainMenu();
        //ticketMachine.showSideMenu();

        /*メインメニューがストックできているか確認*/
        ticketMachine.stockMainMenu("牛丼", "L");
        ticketMachine.getStockMainMenuList();
        

        /*同じメニューがストックされているときにindexの早い方が削除されてしまう(指定して削除できるようにしたい)
        ticketMachine.stockMainMenu("牛丼", "L");
        ticketMachine.stockMainMenu("牛丼", "M");
        ticketMachine.getStockMainMenuList();
        ticketMachine.removeMainMenu("牛丼");
        ticketMachine.getStockMainMenuList();
        */

        //サイドメニューのストックから支払いまで確認
        ticketMachine.stockSideMenu("ポテトサラダ");
        ticketMachine.getStockSideMenuList();
        
        //購入確定
        ticketMachine.purchase();

        //250円の入金があったとする
        int payment = 250;
        ticketMachine.pay(payment);
        int change = ticketMachine.getChange();
        if (change>=0) {
            System.out.println(String.format("残り%d￥です.",change));
        } else {
            System.out.println(String.format("お釣りは%d￥です.",-change));
        }

    }
}