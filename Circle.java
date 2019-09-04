
/**
 * Shape에서 상속받은 추상메소드를 오버라이딩한 원형 클래스 
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
