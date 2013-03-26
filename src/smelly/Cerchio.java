/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smelly;

/**
 *
 * @author Eddy
 */
public class Cerchio implements FiguraPiana {

    private float raggio;

    public Cerchio() {
    }

    public Cerchio(float raggio) {
        this.raggio = raggio;
    }

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * raggio * raggio);
    }
}
