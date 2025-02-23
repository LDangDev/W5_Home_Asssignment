public class Dice {
    private int dice1;
    private int dice2;
    private int count = 0;

    public void roll() {
        while (true){
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            if (isDouble()){
                System.out.println("Rolling the dice...");
                System.out.println("Dice 1: " + getDice1());
                System.out.println("Dice 2: " + getDice2());
                System.out.println("You rolled a double!");
                System.out.println("After " + count +  " try both reach the same value");
                break;
            }
            count++;
        }
    }

    public boolean isDouble() {
        return dice1 == dice2;
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

}
