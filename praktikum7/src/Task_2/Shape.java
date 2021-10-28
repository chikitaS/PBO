package Task_2;

public class Shape {
    private String color="red";
    private  boolean filled=true;
    public Shape(){
        color="green";
        filled=true;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        if(isFilled()==false) {
            return "A shape with color of " + color + " and not filled";
        } else {
            return "A shape with color of" + color + " and filled";
        }
    }
}
