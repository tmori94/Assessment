public class Payment {
    private String user;
    private Double amount;

    public Payment(String user, Double amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getUser() {
        return user;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "user='" + user + '\'' +
                ", amount=" + amount +
                '}';
    }
}
