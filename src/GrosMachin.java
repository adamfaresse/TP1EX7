public class GrosMachin extends Machin{
    public static boolean GlouGlouDone = false;

    @Override
    public void glouglou() {
        GlouGlouDone = true;
        super.glouglou();
    }
}
