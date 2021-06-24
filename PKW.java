public class PKW extends Fahrzeug {

    public PKW() {
    }

    public PKW(String marke, String farbe, int sitzplätze, int räder,
               int ps, boolean status, String jaht, Komplectation komplectation, int mitzeit ) {
        super(marke, farbe, sitzplätze, räder, ps, status, jaht, mitzeit);
        this.komplectation = komplectation;
    }

    Komplectation komplectation;


    public Komplectation getKomplectation() {
        return komplectation;
    }

    @Override
    public String toString() {
        return "PKW: " + "Marke: "+ super.getMarke()+"Farbe: "+super.getFarbe() +"Jahr: "+super.getJaht()
                +"\n"+"Kräfte: "+super.getPs() +"Sitzplätze: "+super.getSitzplätze()+"Komplectation: "+komplectation +
                "\n" + "Status: " + getRentInfo(isStatus());
    }

    private String getRentInfo(boolean status){
        if(status){
            return  "Vermietet "+ Integer.toString(getMitzeit());
        }
        return "Nicht vermietet";
    }


}

