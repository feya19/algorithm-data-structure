package week2;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragonBall = new Dragon(1, 3, 10, 10);
    
        for (int i = 0; i < 10; i++) {
            int direction = getRandomNumber(0, 3);
            switch (direction) {
                case 0:
                    dragonBall.moveLeft();
                    break;
                case 1:
                    dragonBall.moveRight();
                    break;
                case 2:
                    dragonBall.moveUp();
                    break;
                case 3:
                    dragonBall.moveDown();
                    break;
                default:
                    break;
            }
        }
    }

    static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
