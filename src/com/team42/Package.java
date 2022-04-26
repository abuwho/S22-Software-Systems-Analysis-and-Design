
public class Package {
    private int packageNumber;
    private Location location;

    public Package(int packageNumber, Location location) {
        this.packageNumber = packageNumber;
        this.location = location;
    }

    public int getPackageNumber() {
        return this.packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
