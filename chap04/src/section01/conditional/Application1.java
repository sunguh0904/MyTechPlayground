package section01.conditional;

public class Application1 {
    public static void main(String[] args) {
        A_if a = new A_if();
        // 다른 클래스를 호출 하기 때문에 객체 생성
        a.simpleIfStatement();
        a.nestedIfStatement();

        B_ifElse b = new B_ifElse();
        // 다른 클래스를 호출 하기 때문에 객체 생성
        b.simpleIfElseStatement();
        b.nestedIfElseStatement();
    }
}