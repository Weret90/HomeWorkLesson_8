public interface Participant {
    void run();
    void jump();
    void run(Treadmill treadmill);
    void jump(Wall wall);

    double getLimitJump();

    int getLimitRun();
}
