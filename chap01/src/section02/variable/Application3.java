package section02.variable;

public class Application3 {
    public static void main(String[] args) {
        /* 변수의 명명 규칙
        * 변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
        실무적으로 굉장히 중요하기 때문에 반드시 숙지해야 하며, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 개발자다
         */

        /* 변수의 명명 규칙
        1. 컴파일 에러를 발생시키는 규칙
        1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        1-2. 예약어는 사용이 불가능하다( 자바에서 미리 사용하겠다고 compiler와 약속한 키워드를 예약어라고 한다.
        1-3. 변수명은 대/소 문자를 구분한다.( 자바는 대/소 문자를 엄격하게 구분하는 언어이다.)
        1-4. 변수명은 숫자로 시작할 수 없다.( 시작만 할 수 없고 숫자를 섞어서 사용하는 것은 가능하다.)
        1-5. 특수 기호는 '_' 와 '$'만 사용 가능하다.( 따라서 공백을 사용할 수 없다.)

        2. 컴파일 에러를 발생시키지는 않지만 개발자들기리의 암묵적인 규칙
        2-1. 변수명의 길이 제한은 없다.
        2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다.( camelCase )
        2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다.( 타 언어 네이밍 규칙 )
        2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다( 한글을 취급하는 다양한 방식들이 존재하기 때문에 에러 유발 )
        2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
        2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
        2-7. 명사형으로 작서할 수 있도록 한다.
        2-8. boolean(논리 자료형) 형은 의문문으로 가급적 긍정형태로 네이밍한다.
         */

        // 1-1 범위 내의 동일 변수 명 사용 불가
        // int age = 20;
        int age = 20;

        // 1-2 예약어 사용 불가
        // int true = 1;
        // int for = 20;

        // 소문자 a와 대문자 A는 서로 다른 취급이며 동일 변수 명으로 분류되지 않는다.
        // True는 대문자 T로 시작하여 자바 자체의 예약 언어가 아니여서 사용이 가능
        int Age = 20;
        int True = 10;

        // 변수 명 앞에 숫자를 먼저 사용하는 경우 사용이 불가능하지만, 뒤에 숫자를 쓰는 것은 사용이 가능하다.
        // int 1age = 20;
        int age1 = 20;

        // 사용 가능 특수 문자 외에는 사용 불가능
        // int sh^rp = 20;
        int _age = 20;
        int $harp = 20;

        // camelCase 표기법으로 앞에는 소문자 뒤에 오는 단어는 대문자로 표기
        int maxAge = 20;
        int minAge = 10;

        /* 단어와 단어 사이의 연결을 '_'(언더스코어)로 하지 않는다. */
        // String user_name;
        String UserName;

        // 한글로 변수명 지정은 가능하지만 가급적 영어로 표기
        int 나이;

        // 변수의 명칭을 가독성있게 만들어주는 것이 좋다
        // String s;
        String name;

        /* 전형적인 변수 이름이 있다면 가급적 사용한다. */
        int sum = 0;
        int max = 0; // 최대 값을 넣겠다는 변수 명
        int min = 0; // 최소 값을 넣겠다는 변수 명
        int count = 0;

        // goHome 보다는 명사로 home으로 짓는 것이 좋다
        // String goHome;
        String home;

        // 부정형보다는 긍정형으로 변수를 짓는 것이 좋다.
        // boolean IsDead = false;
        boolean isAlive = true;
    }
}
