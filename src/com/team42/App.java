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

        // Creating handlers to validate the user email, password, and checking its role
        Handler handler = new ValidateUserExistsHandler();
        Handler passwordHandler = new ValidatePasswordHandler();
        passwordHandler.setNextHandler(new RoleCheckHandler());
        handler.setNextHandler(passwordHandler);

        // Creating an authentication service and passing the handle we created to it
        AuthenticationService service = new AuthenticationService(handler);

        /*
         * The distribution center Admin is the one responsible for creating the package
         * If the email and password entered are correct the package will be created
         * If any of the data given is wrong creating the package will not be done
         */
        service.login("m.kira@innopolis.ru", "12345", UserType.DISTRIBUTION_CENTER_ADMIN, Database.packageNo,
                Location.DISTRIBUTION_CENTER);

        /*
         * After the package is created by the distribution center admin, the airport
         * admin can modify its location once he recieves the package
         * The airport admin can only set the package location to "AirPlane". If he
         * tried to set it to another location the operation will be refused
         */
        service.login("a.huraira@innopolis.ru", "1234", UserType.AIRPORT_ADMIN, 1, Location.AIRPLANE);

        /*
         * The Road transport admin is the one responsible for updating the package
         * location once it arrive to him
         * If the email and password entered are correct, he will be allowed to update
         * the location to "Truck"
         */
        service.login("v.ivanov@innopolis.ru", "125", UserType.ROAD_TRANSPORT_ADMIN, 1, Location.TRUCK);

        /*
         * When the package arrives to the pickUp point, the pickup point manager will
         * update the package location to be in the pickup point
         */
        service.login("z.vladimir@innopolis.ru", "123", UserType.PICKUP_POINT_ADMIN, 1, Location.PICKUP_POINT);

        /*
         * The customer can login with his email or password and add the number of his
         * package
         * If the email and password entered are correct, the location will be shown to
         * the customer
         */
        service.login("n.amir@innopolis.ru", "145", UserType.CUSTOMER, 1, null);

    }
}
