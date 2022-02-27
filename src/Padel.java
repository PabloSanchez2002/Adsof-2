public class Padel extends Section {
    private boolean parejas;
    private String ciudad;

    public Padel(String c, int y, boolean pareja, String ciudad) {
        super(c, y);
        this.parejas = pareja;
        this.ciudad = ciudad;
    }

    @Override
    public int numberOfPlayers() {
        return this.parejas ? 2 : 1;
    }

    @Override
    public SectionCategory getCategory() {
        return SectionCategory.UNKNOWN;
    }

    @Override
    public String toString() {
        return "Padel " + (this.parejas ? "pairs" : "individual") + ", " + super.toString();
    }

    public boolean getParejas() {
        return this.parejas;
    }

    public void setParejas(boolean p) {
        this.parejas = p;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciu) {
        this.ciudad = ciu;
    }
}
