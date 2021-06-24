import java.util.Scanner;

public class Application {

    private FahrzeugManager manager = new FahrzeugManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("1-Fahrzeug anlegen");
            System.out.println("2-Fahrzeug vermieten");
            System.out.println("3-Alle freien Fahrzeuge anzeigen");
            System.out.println("4-Alle vermieteten Fahrzeuge anzeigen");
            System.out.println("5-Fahrzeug verschrottern");

            int menuNumber = sc.nextInt();

            switch (menuNumber) {
                case (1):
                    createFahrzeugMenu();
                    break;

                case (2):
                    mieteFahrzeug();
                    break;

                case(3):
                    manager.printAllFreieFahrzeuge();
                    break;

                case (4):
                    manager.printAllVermieteteFahrzeuge();
                    break;

                case (5):
                   deliteFahrzeug();
                   break;
            }
        }
    }


    private void deliteFahrzeug(){
        System.out.println("Wählen Sie den Fahrzeugnummer, denen Sie löschen wollen");
        manager.printAllFahrzeuge();
        int number=sc.nextInt();

        manager.deleteFahrzeug(number);
    }

    private void mieteFahrzeug() {
        System.out.println("Wählen Sie den Fahrzeug aus der Liste");
        manager.printAllFreieFahrzeuge();
        int number = sc.nextInt();
        System.out.println("Geben Sie die Mietdauer ein");
        int time = sc.nextInt();
        manager.vermieteFahrzeug(number, time);
    }

    private void createFahrzeugMenu() {
        System.out.println("1-Wenn Sie einen Motorrad anliegen wollen");
        System.out.println("2-Wenn Sie einen LKW anliegen wollen");
        System.out.println("3-Wenn Sie einen PKW anliegen wollen");
        System.out.println("4-Wenn Sie einen Kleintransporter anliegen wollen");

        int number = sc.nextInt();

        switch (number) {
            case (1):
                createMotorrad();
                break;

            case (2):
                createLKW();
                break;

            case (3):
                createPkw();
                break;


            case (4):
                createKleintransporter();
                break;

        }
    }


    private void createKleintransporter() {
        String marke = createMarke();
        String farbe = createFarbe();
        int sitzplätze = createSitzplätze();
        int räder = createRäder();
        int ps = createPs();
        String jaht = createJaht();
        boolean status = false;
        int mitzeit = 0;
        manager.createKleintransporter(marke, farbe, sitzplätze, räder, ps, status, jaht, mitzeit);
    }

    private void createPkw() {
        String marke = createMarke();
        String farbe = createFarbe();
        int sitzplätze = createSitzplätze();
        int räder = createRäder();
        int ps = createPs();
        String jaht = createJaht();
        Komplectation komplectation = createKomplectation();
        boolean status = false;
        int mitzeit = 0;
        manager.createPkw(marke, farbe, sitzplätze, räder, ps, status, jaht, komplectation, mitzeit);

    }

    private void createLKW() {
        String marke = createMarke();
        String farbe = createFarbe();
        int sitzplätze = createSitzplätze();
        int räder = createRäder();
        int ps = createPs();
        String jaht = createJaht();
        boolean status = false;
        int mitzeit = 0;
        manager.createLkw(marke, farbe, sitzplätze, räder, ps, status, jaht, mitzeit);
    }

    private void createMotorrad() {
        String marke = createMarke();
        String farbe = createFarbe();
        int sitzplätze = createSitzplätze();
        int räder = createRäder();
        int ps = createPs();
        String jaht = createJaht();
        Komplectation komplectation = createKomplectation();
        boolean status = false;
        int mitzeit = 0;
        manager.createMotorrad(marke, farbe, sitzplätze, räder, ps, status, jaht, komplectation, mitzeit);

    }

    private String createMarke() {
        System.out.println("Geben Sie die Marke ein");
        String marke = sc.next();
        return marke;

    }

    private String createFarbe() {
        System.out.println("Geben Sie die Farbe ein");
        String farbe = sc.next();
        return farbe;
    }

    private int createSitzplätze() {
        System.out.println("Geben Sie den Anzahl von Sitzplätzen ein");
        int sitzplätze = sc.nextInt();
        return sitzplätze;
    }

    private int createRäder() {
        System.out.println("Geben Sie den Anzahl von Räder ein");
        int räder = sc.nextInt();
        return räder;
    }

    private int createPs() {
        System.out.println("Geben Sie die Kraft ein");
        int ps = sc.nextInt();
        return ps;
    }

    private String createJaht() {
        System.out.println("Geben Sie das Jaht ein");
        String jahr = sc.next();
        return jahr;
    }

    private Komplectation createKomplectation() {
        System.out.println("Wählen Sie die Komplectation");
        System.out.println("1-Basismodel");
        System.out.println("2-Komfortmodel");
        System.out.println("3-Luxmodel");

        int number = sc.nextInt();

        switch (number) {
            case (1):
                return Komplectation.BASISMODEL;

            case (2):
                return Komplectation.KOMFORTMODEL;

            case (3):
                return Komplectation.LUXUSMODEL;

            default:
                return null;
        }
    }
}
