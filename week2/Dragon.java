package week2;

public class Dragon {
    int x, y, width, height;
  
    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
  
    void moveLeft() {
        x--;
        System.out.println("Move Left");
        detectCollision();
    }
    
    void moveRight() {
        x++;
        System.out.println("Move Right");
        detectCollision();
    }
    
    void moveUp() {
        y--;
        System.out.println("Move Up");
        detectCollision();
    }
    
    void moveDown() {
        y++;
        System.out.println("Move Down");
        detectCollision();
    }
    
    private void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }
}
  
