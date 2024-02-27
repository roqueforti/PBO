public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(1, 1, 4);
        Dragon dragon2 = new Dragon(3, 5, 3);

        dragon1.printStatus();
        dragon1.move(4);
        dragon1.printStatus();

        dragon2.printStatus();
        dragon2.changedirection(3);
        dragon2.move(5);
        dragon2.printStatus();
    }
}
