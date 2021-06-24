public class LKW extends Fahrzeug {


    public LKW() {
    }

    public LKW(String marke, String farbe, int sitzplätze, int räder, int ps, boolean status, String jaht, int mitzeit) {
        super(marke, farbe, sitzplätze, räder, ps, status, jaht, mitzeit);
    }

    @Override
    public String toString() {
        return "LKW: " + "Marke: " + super.getMarke() + "Farbe: " + super.getFarbe() + "Jahr: " + super.getJaht()
                + "\n" + "Kräfte: " + super.getPs() + "Sitzplätze: " + super.getSitzplätze() +
                "\n" + "Status: " + getRentInfo(isStatus());
    }

    private String getRentInfo(boolean status) {
        if (status) {
            return "Vermietet " + Integer.toString(getMitzeit());
        }
        return "Nicht vermietet";
    }

}
