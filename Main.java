
/**
 * Circle, Oval, Rect 클래스로부터 객체를 만들어서 객체들의 면적을 계산하는 메인 클래스.
 *
 * @author (스피겔 크릴 2017605038, 테오 켄신 2018771052)
 * @version (2019/09/02)
 */
public class Main
{
    public static void main(String[] args){ 
    Shape[] list = new Shape[3];
    list[0] = new Circle(10); 
    list[1] = new Oval(20, 30); 
    list[2] = new Rect(10, 40);
     for(int i = 0; i < list.length; i++){
        list[i].redraw(); 
    }
     for(int i = 0; i < list.length; i++){
        System.out.println("면적은 " + list[i].getArea());
    }
}

}
