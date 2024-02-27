public class Snake {
    int x, y;

    public Snake(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void left(){
        x--;
    }

    public void right(){
        x++;
    }

    public void down(){
        y--;
    }

    public void up(){
        y++;
    }

    public void showPosition(){
        System.out.println("Snake position: (" + x + ", " + y +")");
    }
}