package ClassRelationships;
//class ini berisikan method apa saja yang dilakukan oleh class DetailMoving
//isinya merupakan pengelompokan penggunaan method class Cow
public class DetailMoving {
    //class relationship dependence dimana class Cow digunakan sebagai tipe data parameter cowMove
    public void findObstacle(Cow cowMove) {
      cowMove.topArrow();
    }
    public void startGame(Cow cowMove) {
        cowMove.startGame();
    }
    public void cowIsMoving(Cow cowMove) {
        cowMove.enter();
    }
    //class relationship dependency dimana class Score dan class Player dijadikan ->
    //sebagai parameter dari method checkMumber
    public void checkNumber(int number,Score score,Player player) {
        Cow cow = new Cow();
        if(number==1) {
            findObstacle(cow);
        } else {
            System.out.println("Sapi tidak bisa bergerak karena penghalang :(");
            //class relationship association dimana yerjadi hubungan antara player.getPlayerName() ->
            //dengan score.getScore()
            System.out.println("\n|Pemain| :"+ player.getPlayerName()+ "\t|Score| :"+ score.getScore());
            System.exit(0);
        }
    }
}

