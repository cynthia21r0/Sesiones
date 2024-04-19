package mx.utng.s08;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

    {
        curso = "Programacion Orientada a Objetos";
        sesion = 8;
        objetivo = "Aprender el paradigma orientado a objetos";
    }

    {
        curso = "Como pintar uñas";
        objetivo = "Ganar dinero";
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    
    public String getCurso() {
        return curso;
    }
    public byte getSesion() {
        return sesion;
    }
    public String getObjetivo() {
        return objetivo;
    }
    

}
