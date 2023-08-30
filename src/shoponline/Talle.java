
package shoponline;


public enum Talle {
    S("s"), M("m"), L("l"), XL("xl");
    private String talle;

    private Talle(String talle) {
        this.talle = talle;
    }

    public String getTalle() {
        return talle;
    }


    
}
