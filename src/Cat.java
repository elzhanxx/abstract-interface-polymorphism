public class Cat extends Pet{

    public Cat(){
        super(4);
        System.out.println("\nКотэ заспавнился");
    }

    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice(){
        System.out.println("Мяу");
    }
}
