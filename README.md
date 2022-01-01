# Coffee-Machine Assessment

### Packages used and needed to run the program: 
com.google.gson.Gson; <br />
com.google.gson.reflect.TypeToken; <br />
java.io.BufferedReader; <br />
java.io.FileNotFoundException; <br />
java.io.FileReader; <br />
java.util.ArrayList; <br />
java.util.Collection; <br />
java.util.List; <br />
java.util.HashMap; <br />

Once the program is run, it will look for three JSON files in src/main/resources/ The three files contain information about coffee-machine users, orders and payments. The class App.java contains the main method, where with GSON library the three files are converted into collections of Java objects (Order, Payment, Product). The class User is used to instantiate as many objects as the user recognized in the JSON files, and store information about their orders and payments.

### payments.json
This is an array of objects containing the user name and the amount paid: <br />[ {"user":"...","amount":"..."}, {...}, ... ]

### orders.json
Array of objects containing the user name, the drink name and its size: <br />[ {"user":"...","drink":"...","size":"..."}, {...}, ... ]

### products.json
Array of objects containing all the drinks, their possible sizes and prices:<br /> [ {"drink_name":"...","prices":{"size1":"price1","size2":"price2",...}}, {...}, ... ]
