package mx.utng.s09;

public class Vehiculo {
    private Combustible combustible = new Combustible();
    private Llanta[] llantas = new Llanta[4];
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public Combustible getCombustible() {
        return combustible;
    }
    public Llanta[] getLlantas() {
        return llantas;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void colocarLlantas(Llanta delanteraIzquierda, 
    Llanta delanteraDerecha, 
    Llanta traseraIzquierda, Llanta traseraDerecha){
        llantas [0] = delanteraIzquierda;
        llantas [1] = delanteraDerecha;
        llantas [2] = traseraDerecha;
        llantas [3] = traseraIzquierda;
    }

    public void llenarTanque(){
        combustible.setLitrosActuales(combustible.getLitrosActuales());
    }

    public void avanzar(){
        if(combustible.getLitrosActuales()>0){
            for (Llanta llanta : llantas){
                llanta.rodar();
            }
            combustible.usar();
        }else {
            System.out.println("No hay combustible");
        }

    }

}