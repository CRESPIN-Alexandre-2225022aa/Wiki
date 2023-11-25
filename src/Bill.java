public class Bill extends PNJ{
    public Bill(String nom, int PV) {
        super(nom, PV);
        setTypeAttque(new EpeeCourte());
    }

    @Override
    public void combat() {
        System.out.println(this.attaquer());
    }
}
