package et;

interface Measurable {
    double getMeasure();
}

class Chilli implements Measurable {
    private int Scoville;

    @Override
    public double getMeasure() {
        return Scoville;
    }
}

class Beer implements Measurable {
    int name;
    int AlcoholProcent;

    @Override
    public double getMeasure() {
        return AlcoholProcent;
    }
}



