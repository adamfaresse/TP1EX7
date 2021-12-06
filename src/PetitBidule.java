public class PetitBidule extends Bidule{
    private Truc t = new Truc();

    @Override
    public void bipbip() {
        if (GrosMachin.GlouGlouDone){
            t.glouglou();
            GrosMachin.GlouGlouDone = false;
        }else{
            super.bipbip();
        }


    }
}
