package Strategy.Transport;

public class SeaTransport implements TransportStrategy {
    String name;
    String ship;

    public String getName() {
        return name;
    }

    public String getShip() {
        return ship;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    @Override
    public String calculateRoute(String origin, String destination) {
        return "Sea route from " + origin + " to " + destination;
    }
}
