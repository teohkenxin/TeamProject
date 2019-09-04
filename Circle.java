
/**
 * Write a description of class Circle here.
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/02)
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
