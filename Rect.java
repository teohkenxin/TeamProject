
/**
 * Write a description of class Rect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rect implements Shape
{
    public int x;
    public int y;

    public Rect(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getArea(){
        double area = this.x * this.y;
        return area;
    }

    public void draw(){
        System.out.println(this.x + "x" + this.y + " 크기의 사각형입니다.");
    }
}
