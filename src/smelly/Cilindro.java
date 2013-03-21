/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smelly;

/**
 *
 * @author Eddy
 */
public class Cilindro implements FiguraSolida, Comparable {

    private float altezza;
    private float raggio;

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    @Override
    public float getArea() {
        return (float) ((2 * raggio * Math.PI * altezza) + 2 * (raggio * raggio * Math.PI));
    }

    @Override
    public float getVolume() {
        return (float) ((raggio * raggio * Math.PI) * altezza);
    }

    @Override
    public int compareTo(Object o) {
        return (int) (getVolume() - ((FiguraSolida) (o)).getVolume());
    }
}
