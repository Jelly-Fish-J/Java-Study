package ch05.overloading;

public class Operator {
    // 메서드 오버로딩 (method overloading)
    // 메서드 이름은 동일
    // 매개변수의 개수 또는 타입이 다른 경우
    // 반환 타입(x), 접근제한자(x)

    // 메서드 시그니쳐(method signature_)
    // 어떤 메서드의 유일함을 나타내는 껍대기(선언부)
    // 메서드 이름 + 매개변수(개수, 타입) 이 동일할때는 같은 메서드로 본다.

    // 정수 2개의 값을 받고 곱하기
    int multiply(int x, int y) {
        System.out.println("int, int");
        return x * y;
    }

    // 실수 2개의 값을 받고 곱하기
    public double multiply(double x, double y) {
        System.out.println("double, double");
        return x * y;
    }


    public int multiply(double x, double y, int z) {
        System.out.println("double, double, int");
        return (int) (x * y) * z;
    }

    public int multiply(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int mulResult = 1;
        for (int num : nums) {
            mulResult *= num;
        }
        return mulResult;
    }
}
