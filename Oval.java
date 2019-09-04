
/**
 * Write a description of class Oval here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oval implements Shape
{
    public int x;
    public int y;
    public Oval(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getArea(){
        double area = this.x * this.y * PI;
        return area;
    }
    public void draw(){
        System.out.println(this.x + "x" + this.y + "에 내접하는 타원입니다.");
    }
}
