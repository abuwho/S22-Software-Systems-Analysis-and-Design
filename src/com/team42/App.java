public class App {
    public static void main(String[] args) throws Exception {

        // Create users
        User user1 = new User("m.kira@innopolis.ru", "12345", UserType.CUSTOMER);
        User user2 = new User("a.huraira@innopolis.ru", "1234", UserType.ROAD_TRANSPORT_ADMIN);
        User user3 = new User("v.ivanov@innopolis.ru", "125", UserType.CUSTOMER);

<<<<<<< HEAD
        // new Location

        // Package package1 = new Package(1239123, "kazan", );
=======
        Package package1 = new Package(1, Location.PICKUP_POINT);
>>>>>>> 1aa32d1fd2e1e4f810bea62f5d0a6e40cab3bce3

        Database database = new Database();

        // Adding some users
        database.addUser(user1);
        database.addUser(user2);
        database.addUser(user3);

        // Adding Packages
        database.addPackage(package1);

        Handler handler = new UserExistsHandler();
        handler.setNextHandler(new ValidatePasswordHandler()).setNextHandler(new RoleCheckHandler());

        // The user will enter its login info and the number of the package to get its
        // location
        AuthenticationService service = new AuthenticationService(handler);
<<<<<<< HEAD
        service.login("m.kira@innoplis.ru", "12345");



        
=======
        service.login("a.huraira@innopolis.ru", "1234", UserType.ROAD_TRANSPORT_ADMIN, 1, Location.TRUCK);
        service.login("m.kira@innopolis.ru", "12345", UserType.CUSTOMER, 1, null);

>>>>>>> 1aa32d1fd2e1e4f810bea62f5d0a6e40cab3bce3
    }
}
