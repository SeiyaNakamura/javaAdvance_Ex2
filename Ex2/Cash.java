public class Cash {
    private int payment = 0;
    private int sum;

    Cash (int sum) {
        this.sum = sum;
    }

    public void pay(int payment) {
        this.payment  += payment;
    }

    public int getChange() {
        int change = sum-payment;
        return change;
    }
}