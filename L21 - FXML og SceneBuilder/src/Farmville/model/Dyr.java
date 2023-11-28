package Farmville.model;

public class Dyr {
    private String name;
    private String title;
    private boolean ko;
    private boolean gris;
    private boolean and;

    public Dyr(String name, String title, boolean ko, boolean gris, boolean and) {
        this.name = name;
        this.title = title;
        this.ko = ko;
        this.gris = gris;
        this.and = and;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public boolean isKo() {
        return ko;
    }
    public boolean isGris() {
        return gris;
    }
    public boolean isAnd() {
        return and;
    }

    @Override
    public String toString() {
        return name + " " + title + (ko ? " ko" : "") + (gris ? " gris" : "") + (and ? " and" : "");
    }
}
