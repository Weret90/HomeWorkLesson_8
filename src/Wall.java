public class Wall implements Obstacle{
    private double height;

    public Wall(double height) {
        if (height <= 0) {
            System.out.println("Высота стены не может быть равна или меньше 0. Введите корректное значение");
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
}
