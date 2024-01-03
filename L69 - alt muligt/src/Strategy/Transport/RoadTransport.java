package Strategy.Transport;

public class RoadTransport implements TransportStrategy {
    String name;
    String veicle;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVeicle() {
        return veicle;
    }

    public void setVeicle(String veicle) {
        this.veicle = veicle;
    }

    @Override
    public String calculateRoute(String origin, String destination) {
        return "Road route from " + origin + " to " + destination;
    }
}
