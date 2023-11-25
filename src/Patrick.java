public class Patrick extends PNJ{
    public Patrick(String nom, int PV) {
        super(nom, PV);
        setTypeAttque(new DoubleHache());
    }

    @Override
    public void combat() {
        System.out.println(this.attaquer());
    }
}
