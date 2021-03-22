public class Human implements Participant {

    private String name;
    private double limitJump;
    private int limitRun;

    public Human(String name, double limitJump, int limitRun) {
        this.name = "Человек " + name;
        if (limitJump <= 0) {
            System.out.println("Значение предела прыжка не может быть равно или меньше 0. Введите корректное значение");
        } else {
            this.limitJump = limitJump;
        }
        if (limitRun <= 0) {
            System.out.println("Значение предела бега не может быть равно или меньше 0. Введите корректное значение");
        } else {
            this.limitRun = limitRun;
        }
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void run(Treadmill treadmill) {

        if (limitRun >= treadmill.getDistance()) {
            System.out.println(name + " успешно пробежал " + treadmill.getDistance() + " метровую беговую дорожку");
        } else {
            System.out.println(name + " не смог пробежать " + treadmill.getDistance() + " метровую беговую дорожку");
        }
    }

    public void jump() {
        System.out.println(name + " прыгнул");
    }

    public void jump(Wall wall) {
        if (limitJump >= wall.getHeight()) {
            System.out.println(name + " успешно перепрыгнул " + wall.getHeight() + " метровую стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть " + wall.getHeight() + " метровую стену");
        }
    }

    public double getLimitJump() {
        return limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }
}
