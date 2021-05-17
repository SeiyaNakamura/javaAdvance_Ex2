import java.util.ArrayList;
import java.util.List;

public class AllSize {
    private List<Size> sizeList;
    private Size sizeL;
    private Size sizeM;
    private Size sizeS;

    AllSize() {
        sizeList = new ArrayList<>();
        sizeL = new Size("L", 100);
        sizeM = new Size("M", 0);
        sizeS = new Size("S", -50);
        sizeList.add(sizeL);
        sizeList.add(sizeM);
        sizeList.add(sizeS);
    }

    public Size returnSize(String name) {
        if (name == "L") {
            return sizeL;
        } else if (name=="M") {
            return sizeM;
        } else {
            return sizeS;
        } 
    }

    public void showSizeList() {
        for (Size size : sizeList) {
            System.out.println(String.format("%s : %d￥",size.size,size.sizePrice));
        }
    }

}