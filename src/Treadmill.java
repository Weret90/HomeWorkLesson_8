public class Treadmill implements Obstacle{
    private int distance;

    public Treadmill(int distance) {
        if (distance <= 0) {
            System.out.println("Длина беговой дорожки не может быть равна или меньше 0. Введите корректное значение");
        } else {
            this.distance = distance;
        }
    }

    public int getDistance() {
        return distance;
    }
}
