package smelly;

import java.util.Collections;

/**
 * Nell'orribile programma seguente dovrete operare come segue 1) Creare
 * opportuni test Junit 2) Rifattorizzare (modificando il main di conseguenza e
 * indicando che "puzza" avete rilevato e che metodo avete scelto per
 * risolverlo) 3) Aggiungere gli opportuni Javadoc se non banali
 *
 * @author piffy
 */
public class Smelly {

    public static void main(String[] args) {
        Cilindro c = new Cilindro();
        c.setAltezza(2.0f);
        c.setRaggio(7.0f);
        System.out.println("Area di superficie:" + c.getArea());
        System.out.println("Volume: " + c.getVolume());
        Cilindro d = new Cilindro();
        d.setRaggio(5.0f);
        d.setAltezza(2.0f);
        Sfera e = new Sfera();
        e.setRaggio(5.3f);
        FiguraSolida Birillo[] = new FiguraSolida[10];
        Birillo[1] = c;
        Birillo[2] = d;
        Birillo[3] = e;
        if (Birillo[1].getVolume() >= Birillo[2].getVolume() && Birillo[1].getVolume() >= Birillo[3].getVolume()) {
            System.out.println("Il solido con volume maggiore è al posto 1");
        } else if (Birillo[2].getVolume() >= Birillo[1].getVolume() && Birillo[2].getVolume() >= Birillo[3].getVolume()) {
            System.out.println("Il solido con volume maggiore è al posto 2");
        } else if (Birillo[3].getVolume() >= Birillo[1].getVolume() && Birillo[3].getVolume() >= Birillo[2].getVolume()) {
            System.out.println("Il solido con volume maggiore è al posto 3");
        }
    }
}
