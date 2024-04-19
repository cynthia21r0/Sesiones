package mx.utng.s09;

public class Llanta {
    //Variables de Instacia
    private float ancho;
    private float diametro;
    private float presion;

    //Constructor
    public Llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
    }

    //Metodo para mostrar rodar
    public void rodar(){
        System.out.println("Rodando...");
    }

    //Getters y Setters
    public float getAncho() {
        return ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }
    
}
