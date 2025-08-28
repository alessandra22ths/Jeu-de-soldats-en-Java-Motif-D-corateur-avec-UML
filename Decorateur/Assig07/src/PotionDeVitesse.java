public class PotionDeVitesse extends DecorateurSoldat {

    public PotionDeVitesse(Soldat soldat) {
        super(soldat);
    }

    @Override
    public String obtenirDescription() {
        return soldat.obtenirDescription() + " + Potion de Vitesse";
    }

    @Override
    public int obtenirForce() {
        return soldat.obtenirForce() + 5;
    }
}