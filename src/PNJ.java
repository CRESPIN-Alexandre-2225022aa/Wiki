public abstract class PNJ {

    private TypeAttque typeAttque;
    private String nom;
    private int PV;

    public PNJ(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
    }

    public TypeAttque getTypeAttque() {
        return typeAttque;
    }

    public void setTypeAttque(TypeAttque typeAttque) {
        this.typeAttque = typeAttque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }
    public String attaquer(){
         return typeAttque.Arme();
    }

    public abstract void combat();
}
