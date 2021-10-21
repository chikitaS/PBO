package ClassRelationships;
//class yang berisikan method apa yang dilakukan oleh class ObstacleAppear
//dibuat untuk menampilkan "penghalang game"
public class ObstacleAppear{
    //class relationship composition antara class obstacle dan obstacleAppear
    //dimana jika class ObstacleAppear di hapus maka data Obstacle yaitu "Kayu potong" akan hilang
    public void print(){
        Obstacle objek1 = new Obstacle();
        objek1.setObstacleName("Kayu potong");
        System.out.println(objek1.getObstacleName());
    }
}
