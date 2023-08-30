
package shoponline;


public enum Modelos {
    OXFORD("oxford"), SKINNY("skinny"), RECTO("recto");
    private String modelo;

    private Modelos(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
}
