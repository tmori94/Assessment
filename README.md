# Coffee-Machine Assessment

### Packages used and needed to run the program: 
com.google.gson.Gson; 
com.google.gson.reflect.TypeToken; 
java.io.BufferedReader; 
java.io.FileNotFoundException; 
java.io.FileReader; 
java.util.ArrayList; 
java.util.Collection; 
java.util.List;

Once the program is run, it will look for three JSON files in src/main/resources/ The three files contain information about coffee-machine users, orders and payments. The class App.java contains the main method, where with GSON library the three files are converted into collections of Java objects (Order, Payment, Product). The class User is used to instantiate as many objects as the user recognized in the JSON files, and store information about their orders and payments.

### payments.json
This is an array of objects containing the user name and the amount paid: [ {"user":"...","amount":"..."}, {...}, ... ]

### orders.json
Array of objects containing the user name, the drink name and its size: [ {"user":"...","drink":"...","size":"..."}, {...}, ... ]

### products.json
Array of objects containing all the drinks, their possible sizes and prices: [ {"drink_name":"...","prices":{"size1":"price1","size2":"price2",...}}, {...}, ... ]
