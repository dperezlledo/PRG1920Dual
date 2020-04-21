/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo;

/**
 *
 * @author David
 */
public class MCalculadora {
    private float d1, d2;
    
    public MCalculadora() {
        d1=d2=0;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }    
    
   
    public float suma() {
        float aux;
        aux = this.d1 + this.d2;
        return aux;
    }

    
    public float resta() {
        float aux;
        aux = this.d1 - this.d2;
        return aux;
    }

    
    public float multiplicacion() {
        float aux;
        aux = this.d1 * this.d2;
        return aux;
    }

   
    public float division() {
        float aux;
        aux = this.d1 / this.d2;
        return aux;
    }
    
}
