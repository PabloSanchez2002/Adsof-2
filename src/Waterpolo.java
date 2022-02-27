public class Waterpolo extends Section {
    private boolean nacional;
    private String ciudad;

    public Waterpolo(String c, int y, boolean nacional, String ciudad) {
        super(c, y);
        this.nacional = nacional;
        this.ciudad = ciudad;
    }

    @Override
    public int numberOfPlayers() {
        return 6;
    }

    @Override
    public SectionCategory getCategory() {
        return SectionCategory.NEW;
    }

    @Override
    public String toString() {
        return "Waterpolo " + (this.nacional ? "nacional" : "regional") + ", " + super.toString();
    }

    public boolean getNacional() {
        return this.nacional;
    }

    public void setNacional(boolean p) {
        this.nacional = p;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciu) {
        this.ciudad = ciu;
    }

}
