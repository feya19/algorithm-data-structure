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
        System.out.printf("Move Left. Dragon in (x: %d, y: %d)\n", x, y);
        detectCollision();
    }
    
    void moveRight() {
        x++;
        System.out.printf("Move Right. Dragon in (x: %d, y: %d)\n", x, y);
        detectCollision();
    }
    
    void moveUp() {
        y--;
        System.out.printf("Move Up. Dragon in (x: %d, y: %d)\n", x, y);
        detectCollision();
    }
    
    void moveDown() {
        y++;
        System.out.printf("Move Down. Dragon in (x: %d, y: %d)\n", x, y);
        detectCollision();
    }
    
    private void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }
}
  
