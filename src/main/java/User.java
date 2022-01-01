public class User {
    private String user;
    private Double amountPaid;
    private Double amountToPay;

    public User(String user) {
        this.user = user;
        this.amountPaid = 0.0;
        this.amountToPay = 0.0;
    }

    public String getUser() {
        return user;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid += amountPaid;
    }

    public Double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(Double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public Double calculateAmountStillOwed() {

        if (this.amountPaid >= this.amountToPay) {
            return 0.0;
        }
        return this.amountToPay - this.amountPaid;
    }
}
