public class Order {
    private String user;
    private String drink;
    private String size;

    public Order(String user, String drink, String size) {
        this.user = user;
        this.drink = drink;
        this.size = size;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDrink() {
        return drink;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user='" + user + '\'' +
                ", drink='" + drink + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
