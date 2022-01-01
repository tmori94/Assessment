import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Gson gson = new Gson();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("src/main/resources/orders.json"));
            // Using TypeToken to load the json string into Order object
            Collection<Order> orders = gson.fromJson(br, new TypeToken<List<Order>>() {
            }.getType());


            br = new BufferedReader(new FileReader("src/main/resources/products.json"));
            // Using TypeToken to load the json string into Product object
            Collection<Product> products = gson.fromJson(br, new TypeToken<List<Product>>(){}.getType());

            List<User> users = new ArrayList<User>();

            for (Order o : orders) {

                if (searchUserByName(users, o.getUser()) == null) {
                    User temp = new User(o.getUser());
                    users.add(temp);
                }
                searchUserByName(users, o.getUser()).setAmountToPay(searchUserByName(users, o.getUser()).getAmountToPay() + searchProductByName(products, o.getDrink()).getPrices().get(o.getSize()));
            }

            br = new BufferedReader(new FileReader("src/main/resources/payments.json"));
            // BufferedReader br3 = new BufferedReader(new FileReader("src/main/resources/payments.json"));
            Collection<Payment> payments = gson.fromJson(br, new TypeToken<List<Payment>>(){}.getType());

            for (Payment p : payments) {
                if (searchUserByName(users, p.getUser()) == null) {
                    User temp = new User(p.getUser());
                    users.add(temp);
                }
                searchUserByName(users, p.getUser()).setAmountPaid(p.getAmount());
            }

            for (User u : users) {
                System.out.println("\nUser: " + u.getUser() +
                        "\nAmount Paid: " + u.getAmountPaid() +
                        "\nAmount still owed: " + u.calculateAmountStillOwed());
            }

        } catch (FileNotFoundException e) { e.printStackTrace(); }

    }

    public static Product searchProductByName(Collection<Product> products, String name) {
        return products.stream().filter(product -> name.equals(product.getDrink_name())).findFirst().orElse(null);
    }

    public static User searchUserByName(Collection<User> users, String name) {
        return users.stream().filter(user -> name.equals(user.getUser())).findFirst().orElse(null);
    }

}
