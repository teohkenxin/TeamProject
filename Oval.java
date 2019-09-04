/**
 * Shape에서 상속받은 추상메소드를 오버라이딩한 타원 클래스 
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/04)
 */
public class Oval implements Shape
{
    public int x;
    public int y;
    
    
    public Oval(int x, int y){ //Constructor method
        this.x = x;
        this.y = y;
    }
    
    public double getArea(){ //면적을 계산하는 메소드
        double area = this.x * this.y * PI;
        return area;
    }
    
    public void draw(){ // 도형을 그리는 메소드 
        System.out.println(this.x + "x" + this.y + "에 내접하는 타원입니다.");
    }
    
}
