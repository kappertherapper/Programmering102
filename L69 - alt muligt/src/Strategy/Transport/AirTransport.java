package Strategy.Transport;

public class AirTransport implements TransportStrategy {
    String name;
    String plane;

    public String getName() {
        return name;
    }

    public String getPlane() {
        return plane;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    @Override
    public String calculateRoute(String origin, String destination) {
        return "Air route from " + origin + " to " + destination;
    }
}
