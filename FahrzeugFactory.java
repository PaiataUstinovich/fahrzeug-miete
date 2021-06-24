import java.util.ArrayList;
import java.util.List;

public class FahrzeugFactory {

    public List<Fahrzeug> getFahrzeuList() {

        List<Fahrzeug>fahrzeugList = new ArrayList<>();
        Motorrad motorrad1 = new Motorrad("Yamaha", "rot", 2, 2, 250, false, "1999", Komplectation.BASISMODEL, 0);
        Motorrad motorrad2 = new Motorrad("BMW", "schwarz", 1, 2, 300, false, "2020", Komplectation.LUXUSMODEL, 0);
        LKW lkw1 = new LKW("Volvo", "weiß", 3, 18, 3000, false, "2021", 0);
        LKW lkw2 = new LKW("Scania", "rosa", 3, 18, 5000, false, "2019", 0);
        PKW pkw1 = new PKW("Subary", "grün", 4, 4, 400, false, "2004", Komplectation.BASISMODEL, 0);
        PKW pkw2 = new PKW("Audi", "rot", 4, 4, 110, false, "2008", Komplectation.BASISMODEL, 0);
        Kleintransporter kleintransporter1 = new Kleintransporter("Volkswagen", "rosa", 3, 4, 120, false, "2010", 0);
        Kleintransporter kleintransporter2 = new Kleintransporter("Volkswagen", "gelb", 3, 4, 120, false, "2010", 0);

        fahrzeugList.add(motorrad1);
        fahrzeugList.add(motorrad2);
        fahrzeugList.add(lkw1);
        fahrzeugList.add(lkw2);
        fahrzeugList.add(pkw1);
        fahrzeugList.add(pkw2);
        fahrzeugList.add(kleintransporter1);
        fahrzeugList.add(kleintransporter2);

        return fahrzeugList;
    }
}