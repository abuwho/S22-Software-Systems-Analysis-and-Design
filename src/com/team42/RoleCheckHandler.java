public class RoleCheckHandler extends Handler {

    Database database = new Database();

    @Override
    public boolean handle(String email, String password, UserType userType, Integer packageNumber, Location location) {
        UserType uType = database.getUser(email).getUserType();
        if (uType != userType)
            return false;

        if (userType == UserType.CUSTOMER) {
            Package requestedPackage = database.getPackage(packageNumber);
            if (requestedPackage != null) {
                System.out.println("The location of your package is : "
                        + requestedPackage.getLocation().toString());
            } else {
                System.out.println("Package Not found");
            }
            return true;
        } else if (userType == UserType.DISTRIBUTION_CENTER_ADMIN && location == Location.DISTRIBUTION_CENTER) {
            // The distribution admin creates new package
            Package p = new Package(Database.packageNo, location);
            database.addPackage(p);
            System.out.println("Package Added successfully");
            return true;
        } else if ((userType == UserType.AIRPORT_ADMIN && location == Location.AIRPLANE)
                || (userType == UserType.ROAD_TRANSPORT_ADMIN && location == Location.TRUCK)
                || (userType == UserType.PICKUP_POINT_ADMIN && location == Location.PICKUP_POINT)) {

            // Update the location of the given package
            boolean updateSucceeded = database.updatePackageLocation(packageNumber, location);

            if (updateSucceeded)
                System.out.println("Location Updated Sucessfully");
            else
                System.out.println("Failed to update the location");

            return true;
        } else {
            return false;
        }

    }

}
