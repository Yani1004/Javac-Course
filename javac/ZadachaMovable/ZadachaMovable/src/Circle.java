public class Circle implements Movable {
    protected MovablePixel center;
    protected int radius;

    public Circle(int x, int y, int radius) {
        this.center = new MovablePixel(x, y);
        this.radius = radius;
    }
    public boolean isInside(MovablePixel p) {
        int distanceX = p.x- center.x;
        int distanceY = p.y- center.y;
        int distance = distanceX*distanceX + distanceY*distanceY;
        return distance <= radius*radius;
    }
    public void print() {
        System.out.printf("%d, %d\n", center.x, center.y);
    }
    @Override
    public void moveUp(int pixels) {
        for(int i = 0;i<pixels;i++){
            center.y++;
            print();
        }

    }

    @Override
    public void moveDown(int pixels) {
        for(int i = 0;i<pixels;i++){
            center.y--;
            print();
        }
    }

    @Override
    public void moveLeft(int pixels) {
        for(int i = 0;i<pixels;i++){
            center.x--;
            print();
        }
    }

    @Override
    public void moveRight(int pixels) {
        for(int i = 0;i<pixels;i++){
            center.x++;
            print();
        }
    }
}
