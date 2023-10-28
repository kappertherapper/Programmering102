package Lotto;

public class Lotto {

    private static final int lottorækker = 1000000000;
    private static Lottoraek[] lotterække = new Lottoraek[lottorækker];
    private int[] kontrollering = new int[8];
    private static Lottoraek rigtige = new Lottoraek();


    public static void main(String[] args) {
        long l1 = System.nanoTime();
        System.out.println("Max: ");
        long l2 = System.nanoTime();
        System.out.println("Køretiden var " + (l2 - l1) / 1000000
                + " millisekunder");

        System.out.println();

    }


    public int[] statskassen () {
        for (int i = 0; i < lotterække.length; i++) {
            kontrollering[lotterække[i].antalrigtige(rigtige)]++;

            }

        return kontrollering;
    }
}
