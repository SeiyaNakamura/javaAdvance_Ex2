public class Size {
    protected String size;
    protected int sizePrice;

    Size(String size,int sizePrice) {
        this.size = size;
        this.sizePrice = sizePrice;
    }

    public int getSizePrice() {
        return sizePrice;
    }

    public String getName() {
        return size;
    }
}