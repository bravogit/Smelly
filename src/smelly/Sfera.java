/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smelly;

/**
 *
 * @author Eddy
 */
public class Sfera implements FiguraSolida, Comparable {

    private float raggio;

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    @Override
    public float getArea() {
        return (float) (4 * Math.PI * raggio * raggio);
    }

    @Override
    public float getVolume() {
        return (float) (4 / 3 * raggio * raggio * raggio * Math.PI);
    }

    @Override
    public int compareTo(Object t) {
        try {
            return (int) (((FiguraSolida) (t)).getVolume() - getVolume());
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        } finally {
            return 0;
        }
    }
}
