
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Shape
{
    public int radius;
    public Circle(int r){
        this.radius = r;
    }
    public double getArea(){
        double area = PI * (this.radius * this.radius);
        return area;
    }
    public void draw(){
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
}
