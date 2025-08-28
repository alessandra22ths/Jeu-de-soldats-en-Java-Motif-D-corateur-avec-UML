public class EpeeEnchantee extends DecorateurSoldat {

    private String typeEffet;

    public EpeeEnchantee(Soldat soldat, String typeEffet) {
        super(soldat);
        this.typeEffet = typeEffet;
    }

    @Override
    public String obtenirDescription() {
        return soldat.obtenirDescription() + " + Épée Enchantée (" + typeEffet + ")";
    }

    @Override
    public int obtenirForce() {
        return soldat.obtenirForce() + 8;
    }
}