public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake(2, 2);
        Snake snake2 = new Snake(7, 10);

        System.out.println("Posisi awal: ");
        snake1.showPosition();
        snake2.showPosition();

        snake1.left();
        snake1.up();
        snake2.left();
        snake2.down();

        System.out.println("\nSetelah bergerak: ");
        snake1.showPosition();
        snake2.showPosition();
    }
}
