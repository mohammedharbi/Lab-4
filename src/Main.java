import java.math.BigDecimal;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DecimalFormat d1 = new DecimalFormat("#.##");
        Circle c1 = new Circle(4);

        System.out.println("---------Circle---------");
        System.out.println("The radius of a circle:"+c1.getRadius()+"\n" +
                "The Position of circle: x= "+c1.getX()+" Y= "+c1.getY()+"\n" +
                "The Area: "+d1.format(c1.calculateArea())+"\n" +
                "The Circumference: "+d1.format(c1.calculateCircumference()));
        c1.setRadius(5);
        c1.setX(2);
        c1.setY(2);
        System.out.println("\nThe radius of a circle:"+c1.getRadius()+"\n" +
                "The Position of circle: x= "+c1.getX()+" Y= "+c1.getY()+"\n");

        System.out.println("---------Rectangle---------");
        Rectangle r1 = new Rectangle(30,20);

        System.out.println("The length of a Rectangle: "+r1.getLength()+", and width= "+r1.getWidth()+"\n" +
                "The Position of Rectangle: x= "+r1.getX()+" Y= "+r1.getY()+"\n" +
                "The Area: "+d1.format(r1.calculateArea())+"\n" +
                "The Circumference: "+d1.format(r1.calculateCircumference()));
        r1.setLength(5);
        r1.setWidth(10);
        System.out.println("\nThe length of a Rectangle: "+r1.getLength()+", and width= "+r1.getWidth());

        System.out.println("---------Triangle---------");

        Triangle t1= new Triangle(10,15);

        System.out.println("The Height of a Triangle:"+t1.getHeight()+", base= "+t1.getBase()+"\n" +
                "The Position of Triangle: x= "+t1.getX()+" Y= "+t1.getY()+"\n" +
                "The Area: "+d1.format(t1.calculateArea())+"\n" +
                "The Circumference: "+d1.format(t1.calculateCircumference()));
        t1.setHeight(5);
        t1.setBase(2.5);
        System.out.println("\nThe Height of a Triangle:"+t1.getHeight()+", base= "+t1.getBase());



    }
}