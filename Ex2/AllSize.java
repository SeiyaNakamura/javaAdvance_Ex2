import java.util.ArrayList;
import java.util.List;

public class AllSize {
    private List<Size> sizeList = new ArrayList<>();

    AllSize() {
        sizeList.add(new Size("L", 100));
        sizeList.add(new Size("M", 0));
        sizeList.add(new Size("S", -50));
    }

    public Size returnSize(String name) {
        for (Size size : sizeList) {
            if (name.equals(size.getName())) {
                return size;
            } else {
            }
        }
        return null;
    }

    public void showSizeList() {
        for (Size size : sizeList) {
            System.out.println(String.format("%s : %d￥",size.size,size.sizePrice));
        }
    }

}