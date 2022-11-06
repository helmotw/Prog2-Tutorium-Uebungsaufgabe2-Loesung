package Geschaeftslogik.daten;

public class Kunde {
    private int alter;
    private String geschlecht;
    private double bmi;
    private int kinderanzahl;
    private boolean raucher;
    private String region;
    private double praemie;

        public Kunde(final int alter, final String geschlecht, final double bmi, final int kinderanzahl, final boolean raucher, final String region, final double praemie) {
            this.alter = alter;
            this.geschlecht = geschlecht;
            this.bmi = bmi;
            this.kinderanzahl = kinderanzahl;
            this.raucher = raucher;
            this.region = region;
            this.praemie = praemie;
        }

    public int getAlter() {
        return alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public double getBmi() {
        return bmi;
    }

    public int getKinderanzahl() {
        return kinderanzahl;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public String getRegion() {
        return region;
    }

    public double getPraemie() {
        return praemie;
    }
}
