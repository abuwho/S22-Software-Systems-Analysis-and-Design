import javax.tools.DocumentationTool.Location;

public class Package {
    private int packageNumber;
    private Location location;
    private TransportationMethod transportationMethod;

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
