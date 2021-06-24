import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FahrzeugManager {

    FahrzeugFactory factory = new FahrzeugFactory();

    private List<Fahrzeug> fahrzeugList = new ArrayList<>();
    private List <Fahrzeug> freieFahrteugeList = new ArrayList();
    //  private List <Fahrzeug> fahrzeugList=factory.getFahrzeuList();
    //  private List <Fahrzeug> freieFahrteugeList=new ArrayList<>(fahrzeugList);

    private List <Fahrzeug> vermiteteFahrzeuge=new ArrayList<>();
    private FahrzeugComparator comparator = new FahrzeugComparator();


    public void printAllFreieFahrzeuge(){
        int count=1;
        Collections.sort( freieFahrteugeList,comparator);
        for (Fahrzeug fahrzeug:  freieFahrteugeList) {
            System.out.println(count+": "+fahrzeug.toString());
            count++;
        }
    }

    public void printAllVermieteteFahrzeuge(){
        int count=1;
        Collections.sort(vermiteteFahrzeuge, comparator);
        for(Fahrzeug fahrzeug: vermiteteFahrzeuge){
            System.out.println(count+": "+fahrzeug.toString());
            count++;
        }
    }

    public void printAllFahrzeuge(){
        int count=1;
        Collections.sort(fahrzeugList, comparator);
        for(Fahrzeug fahrzeug: fahrzeugList){
            System.out.println(count+": "+fahrzeug.toString());
            count++;
        }
    }

    public void vermieteFahrzeug(int index, int mitzeit){
        Fahrzeug fahrzeug = freieFahrteugeList.get(index -1);
        freieFahrteugeList.remove(fahrzeug);
        fahrzeug.setStatus(true);
        fahrzeug.setMitzeit(mitzeit);
        vermiteteFahrzeuge.add(fahrzeug);
    }

    public void deleteFahrzeug(int index){
        Fahrzeug fahrzeug = fahrzeugList.get(index-1);
        fahrzeugList.remove(fahrzeug);
        if(freieFahrteugeList.contains(fahrzeug)){
            freieFahrteugeList.remove(fahrzeug);
        }
        if(vermiteteFahrzeuge.contains(fahrzeug)){
            vermiteteFahrzeuge.remove(fahrzeug);
        }

    }

    public void createMotorrad(String marke, String farbe, int sitzplätze, int räder, int ps, boolean status,
                                   String jaht, Komplectation komplectation, int mitzeit) {
        Motorrad motorrad = new Motorrad(marke, farbe, sitzplätze, räder, ps, status, jaht,komplectation,mitzeit);

        fahrzeugList.add(motorrad);
        freieFahrteugeList.add(motorrad);
        System.out.println("Neues Motorrad war hineingefügt");
        System.out.println(motorrad.toString());
    }

    public void createPkw(String marke, String farbe, int sitzplätze, int räder, int ps, boolean status,
                                   String jaht, Komplectation komplectation, int mitzeit) {

        PKW pkw=new PKW(marke, farbe, sitzplätze, räder, ps, status, jaht,komplectation,mitzeit);
        fahrzeugList.add(pkw);
        freieFahrteugeList.add(pkw);
        System.out.println("Neues PKW war hineingefügt");
        System.out.println(pkw.toString());
    }

    public void createLkw(String marke, String farbe, int sitzplätze, int räder, int ps, boolean status,
                                   String jaht, int mitzeit) {
        LKW lkw=new LKW(marke, farbe, sitzplätze, räder, ps, status, jaht,mitzeit);
        fahrzeugList.add(lkw);
        freieFahrteugeList.add(lkw);
        System.out.println("Neues LKW war hineingefügt");
        System.out.println(lkw.toString());
    }
    public void createKleintransporter(String marke, String farbe, int sitzplätze, int räder, int ps, boolean status,
                                   String jaht, int mitzeit) {
        Kleintransporter kleintransporter=new Kleintransporter(marke, farbe, sitzplätze, räder, ps, status, jaht,mitzeit);
        fahrzeugList.add(kleintransporter);
        freieFahrteugeList.add(kleintransporter);
        System.out.println("Neues Kleintransporter war hineingefügt");
        System.out.println(kleintransporter.toString());
    }


}
