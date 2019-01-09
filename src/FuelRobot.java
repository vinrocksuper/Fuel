public interface FuelRobot {
    boolean facingRight = true;
    int currentIndex = 0;

    boolean isFacingRight();

    void changeDirection();

    void moveForward(int moves);

    int getCurrentIndex();

}
