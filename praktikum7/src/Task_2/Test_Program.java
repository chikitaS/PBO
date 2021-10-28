package Task_2;

public class Test_Program {
    public static void main ( String[]args){
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        s1.setColor("blue ocean");
        s1.setFilled(false);
        System.out.println("color:"+s1.getColor()+"\tfilled:"+s1.isFilled());
    }
}
