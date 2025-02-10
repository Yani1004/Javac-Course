public class Rectangle implements Movable {
   protected MovablePixel upperLeft;
   protected MovablePixel lowerRight;
   public Rectangle(int x1, int y1, int x2, int y2) {
       this.upperLeft = new MovablePixel(x1,y1);
       this.lowerRight = new MovablePixel(x2,y2);
   }
    public void print() {
        System.out.printf("Upper Left (%d, %d)\n Lower Right(%d, %d)\n", upperLeft.x, upperLeft.y,lowerRight.x, lowerRight.y);
    }

    @Override
    public void moveUp(int pixels) {
        for(int i = 0;i<pixels;i++){
            upperLeft.y++;
            lowerRight.y++;
            print();
        }
    }

    @Override
    public void moveDown(int pixels) {
        for(int i = 0;i<pixels;i++){
            upperLeft.y--;
            lowerRight.y--;
            print();
        }
    }

    @Override
    public void moveLeft(int pixels) {
        for(int i = 0;i<pixels;i++){
            upperLeft.x--;
            lowerRight.x--;
            print();
        }
    }

    @Override
    public void moveRight(int pixels) {
        for(int i = 0;i<pixels;i++){
            upperLeft.x++;
            lowerRight.x++;
            print();
        }
    }
}
