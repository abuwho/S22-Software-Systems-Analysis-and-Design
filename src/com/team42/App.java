public class App {
    public static void main(String[] args) throws Exception {

        User user1 = new User("m.kira@innopolis.ru", "12345", UserType.STAFF);
        User user2 = new User("a.huraira@innopolis.ru", "1234", UserType.CUSTOMER);

        Database database = new Database();

        database.addUser(user1);
        database.addUser(user2);

        Handler handler = new ValidateUserExistsHandler()
                .setNextHandler(new ValidatePasswordHandler())
                .setNextHandler(new RoleCheckHandler());

        AuthenticationService service = new AuthenticationService(handler);
        service.login("m.kira@innopolis.ru", "124");
    }
}
