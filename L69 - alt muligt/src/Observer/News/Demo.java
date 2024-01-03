package Observer.News;

public class Demo {
    public static void main(String[] args) {
        NewsAgency funja = new NewsAgency();

        NewsSubscriber maj = new NewsSubscriber("Maj");
        NewsSubscriber kasper = new NewsSubscriber("Kasper");

        funja.registrerObserver(maj);
        funja.registrerObserver(kasper);

        funja.setNews("Vi har fået nye bolde på lager");
        funja.notifyObservers();
    }
}
