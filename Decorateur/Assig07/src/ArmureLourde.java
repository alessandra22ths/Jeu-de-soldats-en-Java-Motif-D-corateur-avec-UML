public class ArmureLourde extends DecorateurSoldat {

    public ArmureLourde(Soldat soldat) {
        super(soldat);
    }

    @Override
    public String obtenirDescription() {
        return soldat.obtenirDescription() + " + Armure Lourde";
    }

    @Override
    public int obtenirDefense() {
        return soldat.obtenirDefense() + 10;
    }
}