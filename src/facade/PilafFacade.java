package facade;

public class PilafFacade {
    private final Pilaf pilaf;

    public PilafFacade(Pilaf pilaf) {
        this.pilaf = pilaf;
    }

    public void cook() {
        pilaf.washRice();
        pilaf.washSheepMeat();
        pilaf.cutSheepMeat();
        pilaf.peelOpinion();
        pilaf.cutOpinion();
        pilaf.cutCarrot();
        pilaf.peelGarlic();
        pilaf.addVegetableOil();
        pilaf.addOpinion();
        pilaf.addSheepMeat();
        pilaf.addCarrot();
        pilaf.addSpices();
        pilaf.addWater();
        pilaf.stewing();
        pilaf.finish();
    }
}
