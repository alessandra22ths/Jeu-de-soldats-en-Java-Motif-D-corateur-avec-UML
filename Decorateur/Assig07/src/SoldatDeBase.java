public class SoldatDeBase implements Soldat {

    @Override
    public String obtenirDescription() {
        return "Soldat de base";
    }

    @Override
    public int obtenirForce() {
        return 10;
    }

    @Override
    public int obtenirDefense() {
        return 5;
    }
}