public class App {
    public static void main(String[] args) throws Exception {

        // Creating an object of database
        Database database = new Database();

        // Create users with different rules and storing them in the data base (Dummy
        // data)
        User user1 = new User("m.kira@innopolis.ru", "12345", UserType.DISTRIBUTION_CENTER_ADMIN);
        User user2 = new User("a.huraira@innopolis.ru", "1234", UserType.AIRPORT_ADMIN);
        User user3 = new User("v.ivanov@innopolis.ru", "125", UserType.ROAD_TRANSPORT_ADMIN);
        User user4 = new User("z.vladimir@innopolis.ru", "123", UserType.PICKUP_POINT_ADMIN);
        User user5 = new User("n.amir@innopolis.ru", "145", UserType.CUSTOMER);

        // Storing the dummy data in the database
        database.addUser(user1);
        database.addUser(user2);
        database.addUser(user3);
        database.addUser(user4);
        database.addUser(user5);

        // Creating a handler to validate the user email, password, and checking its
        // rule
        Handler handler = new ValidateUserExistsHandler();
        handler.setNextHandler(new ValidatePasswordHandler());
        handler.setNextHandler(new RoleCheckHandler());

        // Creating an authentication service and passing the handle we created to it
        AuthenticationService service = new AuthenticationService(handler);

        // The distribution
        service.login("m.kira@innopolis.ru", "12345", UserType.DISTRIBUTION_CENTER_ADMIN);

    }
}
