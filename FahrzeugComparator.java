import java.util.Comparator;

public class FahrzeugComparator implements Comparator<Fahrzeug> {


    @Override
    public int compare(Fahrzeug f1, Fahrzeug f2) {
        if (f1 instanceof Motorrad) {
            if (f2 instanceof PKW || f2 instanceof LKW || f2 instanceof Kleintransporter) {
                return -1;
            }
            if (f2 instanceof Motorrad) {
                return 0;
            }
            return 1;
        }

        if (f1 instanceof PKW) {
            if (f2 instanceof LKW || f2 instanceof Kleintransporter) {
                return -1;
            }
            if (f2 instanceof PKW) {
                return 0;
            }
            return 1;
        }

        if(f1 instanceof LKW){
            if(f2 instanceof Kleintransporter){
                return -1;
            }
            if (f2 instanceof LKW){
                return 0;
            }
            return 1;
        }
        if(f1 instanceof Kleintransporter){
            if (f2 instanceof Kleintransporter){
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
