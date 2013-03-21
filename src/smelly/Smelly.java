package smelly;

import java.util.ArrayList;
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
        e.setRaggio(5.3f);ArrayList<FiguraSolida> Birillo = new ArrayList<>();
        Birillo.add(c);
        Birillo.add(d);
        System.out.println("Il solido con volume maggiore è al posto " + (Birillo.indexOf(Collections.max((ArrayList) Birillo)) + 1));
    }
}
