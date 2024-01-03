package Strategy.Transport;

public class Demo {
    public static void main(String[] args) {
        LogisticsManager manager = new LogisticsManager();

        RoadTransport road = new RoadTransport();
        manager.planDelivery("Denmark", "Sweden", road);

        AirTransport air = new AirTransport();
        manager.planDelivery("Denmark", "Japan", air);

        SeaTransport sea = new SeaTransport();
        manager.planDelivery("Denmark", "USA", sea);

        manager.planDeliveryBasedOnCriteria("Denmark", "Italia", 499);
    }
}
