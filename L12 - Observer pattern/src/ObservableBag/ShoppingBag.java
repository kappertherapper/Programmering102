package ObservableBag;

import java.util.HashMap;

public class ShoppingBag {
    public static void main(String[] args) {

        ObservableBag subject = new ObservableBag();
       KasperBag observer = new KasperBag(subject);
       subject.addObserver(observer);

        subject.add("Tuborg");
        subject.add("Tuborg");
        subject.add("Kylling");
        subject.add("Gamerjuice");
        subject.remove("Tuborg");
        System.out.println();

    }
}
