package ClassRelationships;
import java.util.Scanner;
//merupakan main class
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resultCowMove;
        int cowInt=6;
        int number;
        //pendeklarasian objek dan class relationship agregation
        ObstacleAppear obstacleAppear = new ObstacleAppear();
        Cow cow = new Cow();
        DetailMoving detailGame = new DetailMoving();
        Player player = new Player();
        Score score = new Score();
        score.setScore(0);
        player.setPlayerName("Ange Yuki");
        System.out.println("Game di mulai!!!");
        System.out.print("Sapi :");
        detailGame.startGame(cow);
        for(int i=1; i <= cowInt; i++) {
            System.out.print("\tSapi berjalan...");
            if(i%2==0){
                System.out.print(",muncul penghalang: ");
                obstacleAppear.print();
                System.out.println("+++++++++++++++++++++++++++++++");
                System.out.println("Input angka :");
                number=input.nextInt();
                detailGame.checkNumber(number,score,player);
                score.setScore(score.getScore() + 1);
                System.out.println("-------------------------------");
            }
        }
        //class relationship association dimana yerjadi hubungan antara player.getPlayerName() ->
        //dengan score.getScore()
        System.out.println("\n|Pemain| :"+ player.getPlayerName()+ "\t|Score| :"+ score.getScore());

    }
}
