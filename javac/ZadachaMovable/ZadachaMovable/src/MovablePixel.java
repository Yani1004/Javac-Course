public class MovablePixel implements Movable{
    int x;
    int y;
    public MovablePixel(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void print() {
        System.out.printf("%d, %d\n", x, y);
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void moveUp(int pixels) {
        y += pixels;
        print();
    }

    @Override
    public void moveDown(int pixels) {
        y -= pixels;
        print();
    }

    @Override
    public void moveLeft(int pixels) {
        x -= pixels;
        print();
    }

    @Override
    public void moveRight(int pixels) {
        x += pixels;
        print();
    }
}
