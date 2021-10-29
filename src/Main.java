public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int countOfEliminatedPlayers = 0;

        if (!isGreenLight) {
            if (speedOfPlayer1 != 0) {
                countOfEliminatedPlayers++;
            }
            if (speedOfPlayer2 != 0) {
                countOfEliminatedPlayers++;
            }
            if (speedOfPlayer3 != 0) {
                countOfEliminatedPlayers++;
            }
        }

        System.out.println("Количество игроков, которые выбывают: " + countOfEliminatedPlayers + '.');

    }
}
