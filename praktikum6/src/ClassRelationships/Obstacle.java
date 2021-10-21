package ClassRelationships;
//class ini berisikan method apa yang dilakukan oleh class Obstacle
//dibuat untuk membuat "penghalang game" dan men-set nya
//hanya berisi enkapsulasi atribut Obstacle, getter dan setter
public class Obstacle {
    private String ObstacleName;
    public String getObstacleName() {
        return ObstacleName;
    }
    public void setObstacleName(String obstacleName) {
        ObstacleName = obstacleName;
    }
}
