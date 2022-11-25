package controladores;

public class operaciones {

    private float numero1;
    private float numero2;
//constructor

    public operaciones(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
// set and get

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    //logica de la aplicacion 
    public float suma() {
        return (getNumero1() + getNumero2());
    }

    public float resta() {
        return (getNumero1() - getNumero2());
    }

    public float multiplicacion() {
        return (getNumero1() * getNumero2());
    }

    public float division() {
        return (getNumero1() / getNumero2());
    }
}
