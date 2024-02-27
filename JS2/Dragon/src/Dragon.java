public class Dragon {
    public int x, y, direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changedirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("direction should be around 1 to 4");
        }
    }

    public void move(int steps) {
        switch (this.direction) {
            case 1:
                this.y -= steps;
                break;
            case 2:
                this.y += steps;
                break;
            case 3:
                this.x += steps;
                break;
            case 4:
                this.x -= steps;
                break;
            default:
                System.out.println("Wrong direction");
        }
    }

    public void printStatus(){
        System.out.println("Dragon position: (" + this.x + " " + this.y + ")");
        System.out.println("Dragon direction: " + this.direction);
    }
}
