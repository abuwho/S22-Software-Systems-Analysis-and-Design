
public class Package {
    private int packageNumber;
    private Location location;
    private TransportationMethod transportationMethod;

    public Package(int packageNumber, Location location, TransportationMethod transportationMethod) {
        this.packageNumber = packageNumber;
        this.location = location;
        this.transportationMethod = transportationMethod;
    }

    public int getPackageNumber() {
        return this.packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public TransportationMethod getTransportationMethod() {
        return this.transportationMethod;
    }

    public void setTransportationMethod(TransportationMethod transportationMethod) {
        this.transportationMethod = transportationMethod;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
