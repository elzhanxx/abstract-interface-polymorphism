public class Hamster extends Pet{

    public Hamster() {
        super(4);
        System.out.println("\nХомячело заспавнился");
    }

    public void hideFood(){
        System.out.println("Вся еда - в щечках!");
    }
    @Override
    public void giveVoice(){
        System.out.println("*Шипит*");
    }
}
