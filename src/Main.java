public class Main {
    public static void main(String[] args) {
        GrosMachin oung = new GrosMachin();
        PetitBidule pfuit = new PetitBidule();
        pfuit.bipbip(); // fait bipbip
        oung.glouglou(); // fait glouglou
        pfuit.bipbip(); // fait glouglou !
        pfuit.bipbip(); // fait bipbip
    }
}
