public class Spider extends Pet{

    public Spider(){
        super(8);
        System.out.println("\nПаучара заспавнился");
    }

    @Override
    public void giveVoice() {
        System.out.println("...");
    }

    @Override
    public int getPawsCount() {
        return 8;
    }
}
