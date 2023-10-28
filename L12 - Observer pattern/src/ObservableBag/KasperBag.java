package ObservableBag;

public class KasperBag implements Observer {

   private Bag subject;

    public KasperBag(Bag subject) {
        this.subject = subject;
    }

    @Override
    public void update(String s) {
        if (subject.getCount(s) == 0) {

        }
        System.out.println("Element changed: " + s.toString() + ", Current count: " + subject.getCount(s));
    }
}
