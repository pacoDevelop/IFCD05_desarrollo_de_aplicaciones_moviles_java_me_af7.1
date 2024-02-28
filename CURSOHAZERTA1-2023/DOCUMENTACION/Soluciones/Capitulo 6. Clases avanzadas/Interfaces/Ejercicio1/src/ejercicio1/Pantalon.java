/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

/**
 *
 * @author Anabel
 */
public class Pantalon extends Ropa implements ArticuloVenta{

    private float precio;
    private String proveedeor;

    public Pantalon(char talla, String composicion, boolean limpiezaSeco, float precio, String proveedeor) {
        super(talla, composicion, limpiezaSeco);
        this.precio = precio;
        this.proveedeor = proveedeor;
    }

    public float getPrecio() {
        return precio;
    }

    public String getProveedor() {
        return proveedeor;
    }

    @Override
    public String toString() {
        return super.toString() + "Pantalon{" + "precio=" + precio + "proveedeor=" + proveedeor + '}';
    }



}
