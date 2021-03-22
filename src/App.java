public class App {
    public static void main(String[] args) {

        Participant participants [] = new Participant[9];
        participants[0] = new Human("Андрей", 1.5, 300);
        participants[1] = new Human("Николай", 1.7, 700);
        participants[2] = new Human("Сергей", 1.0, 400);
        participants[3] = new Cat("Пушок", 0.5, 80);
        participants[4] = new Cat("Барсик", 0.3, 50);
        participants[5] = new Cat("Пушок", 0.7, 100);
        participants[6] = new Robot("AR-15", 4, 1500);
        participants[7] = new Robot("KL-19", 3, 1200);
        participants[8] = new Robot("BL-88", 8, 3000);

        Obstacle obstacles [] = new Obstacle[6];
        obstacles[0] = new Treadmill(50);
        obstacles[1] = new Wall(0.4);
        obstacles[2] = new Treadmill(350);
        obstacles[3] = new Wall(1);
        obstacles[4] = new Treadmill(1400);
        obstacles[5] = new Wall(5);

        competition(participants, obstacles);
    }

    public static void competition(Participant[] participants, Obstacle[] obstacles) {
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if(obstacles[j] instanceof Treadmill) { //если препятствие является беговой дорожкой
                    participants[i].run((Treadmill) obstacles[j]); //вып-ся метод run
                    if (participants[i].getLimitRun() < ((Treadmill) obstacles[j]).getDistance()) { //если участник не справляется с препятствием, он выбывает
                        break;
                    }
                }
                if(obstacles[j] instanceof Wall) { //если препятствие является стеной
                    participants[i].jump((Wall) obstacles[j]); //вып-ся метод jump
                    if (participants[i].getLimitJump() < ((Wall) obstacles[j]).getHeight()) {
                        break;
                    }
                }
            }
        }
    }
}
