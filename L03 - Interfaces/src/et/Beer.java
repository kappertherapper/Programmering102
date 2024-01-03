package et;

class Beer implements Measurable {
    int name;
    int AlcoholProcent;

    @Override
    public double getMeasure() {
        return AlcoholProcent;
    }
}
