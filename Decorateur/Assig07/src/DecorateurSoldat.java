public abstract class DecorateurSoldat implements Soldat {
    protected Soldat soldat;

    public DecorateurSoldat(Soldat soldat) {
        this.soldat = soldat;
    }

    @Override
    public String obtenirDescription() {
        return soldat.obtenirDescription();
    }

    @Override
    public int obtenirForce() {
        return soldat.obtenirForce();
    }

    @Override
    public int obtenirDefense() {
        return soldat.obtenirDefense();
    }
}