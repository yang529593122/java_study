package relyon;

public class Farmer {
    public Pig breeding(int month) {
        Pig pig = new Pig("长白条");
        pig.growUp(month);
        return pig;
    }
}
