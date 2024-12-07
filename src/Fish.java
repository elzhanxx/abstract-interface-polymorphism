public class Fish extends Pet{
    public Fish(){
        super(0);
        System.out.println("\nРыбка заспавнилась");
    }
    @Override
    public void giveVoice(){
        System.out.println("Буль-буль-буль");
    }
}
