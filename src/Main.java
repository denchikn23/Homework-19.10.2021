public class Main {
    public static boolean isGreenLight = true;

    public static boolean isOut(int speed) {
        if (!isGreenLight) {
            if (speed != 0) {
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int speed = 1;

        if (isOut(speed)){
            System.out.println("Игрок со скоростью " + speed + " выбывает из игры.");
        } else {
            System.out.println("Игрок со скоростью " + speed + " остается в игре.");
        }
    }
}

