
/**
 * Write a description of class Rect here.
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/02)
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
