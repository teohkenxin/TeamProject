/**
 * Shape에서 상속받은 추상메소드를 오버라이딩한 사각형 클래스 
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/04)
 */
public class Rect implements Shape
{
    public int x;
    public int y;
    
    
    public Rect(int x, int y){ // Constructor method
        this.x = x;
        this.y = y;
    }

    public double getArea(){ // 면적을 계산하는 메소드 
        double area = this.x * this.y;
        return area;
    }

    public void draw(){ // 도형을 그리는 메소드 
        System.out.println(this.x + "x" + this.y + " 크기의 사각형입니다.");
    }
    
}
