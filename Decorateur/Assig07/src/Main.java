public class Main {
    public static void main(String[] args) {
        Soldat monSoldat = new SoldatDeBase();
        monSoldat = new ArmureLourde(monSoldat);
        monSoldat = new PotionDeVitesse(monSoldat);
        monSoldat = new EpeeEnchantee(monSoldat, "feu");

        System.out.println("Description : " + monSoldat.obtenirDescription());
        System.out.println("Force : " + monSoldat.obtenirForce());
        System.out.println("Défense : " + monSoldat.obtenirDefense());
    }
}