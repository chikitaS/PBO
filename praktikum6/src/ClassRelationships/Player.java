package ClassRelationships;
//class yang berisikan method apa yang dilakukan oleh class Player
//dibuat untuk membuat dan men-set pemain game
////hanya berisi enkapsulasi atribut playerName, getter dan setter
public class Player {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
