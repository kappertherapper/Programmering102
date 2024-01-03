package Strategy.Transport;

public class LogisticsManager {
    public void planDelivery(String origin, String destination, TransportStrategy strategy) {
        System.out.println(strategy.calculateRoute(origin, destination));
    }

    public void planDeliveryBasedOnCriteria (String origin, String destination, int distance) {
        TransportStrategy strategy;
        if (distance <= 500) {
            strategy = new RoadTransport();
        } else if (distance <= 1500) {
            strategy = new SeaTransport();
        } else {
            strategy = new AirTransport();
        }
        planDelivery(origin, destination, strategy);
    }
}
