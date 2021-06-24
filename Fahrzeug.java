abstract class Fahrzeug {

    private String marke;
    private String farbe;
    private int sitzplätze;
    private int räder;
    private int ps;
    private boolean status;
    private String jaht;
    private int mitzeit;

    public Fahrzeug() {
    }

    public Fahrzeug(String marke, String farbe, int sitzplätze, int räder, int ps, boolean status, String jaht, int mitzeit) {
        this.marke = marke;
        this.farbe = farbe;
        this.sitzplätze = sitzplätze;
        this.räder = räder;
        this.ps = ps;
        this.status = status;
        this.jaht = jaht;
        this.mitzeit = mitzeit;
    }

    //
    public Fahrzeug (Fahrzeug fahrzeug, int mitzeit){
        fahrzeug.setStatus(true);
        fahrzeug.setMitzeit(mitzeit);
    }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getSitzplätze() {
        return sitzplätze;
    }

    public int getRäder() {
        return räder;
    }

    public int getPs() {
        return ps;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMitzeit(int mitzeit) {
        this.mitzeit = mitzeit;
    }

    public String getJaht() {
        return jaht;
    }

    public int getMitzeit() {
        return mitzeit;
    }


    @Override
    public String toString() {
        return "Fahrzeug{" +
                "marke='" + marke + '\'' +
                ", farbe='" + farbe + '\'' +
                ", sitzplätze=" + sitzplätze +
                ", räder=" + räder +
                ", ps=" + ps +
                ", status=" + status +
                ", jaht='" + jaht + '\'' +
                ", mitzeit=" + mitzeit +
                '}';
    }
}
