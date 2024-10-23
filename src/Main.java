import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 값 입력받기
        System.out.print("첫 번째 값을 입력해주세요 : ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.print("두 번째 값을 입력해주세요 : ");
        double num2 = Double.parseDouble(sc.nextLine());
        System.out.print("연산자를 입력해주세요(+,-,*,/) : ");
        String operator = sc.nextLine();

        // 결과
        double result=0;

        // 객체
        Calculator calculator = new Calculator();

        if("+".equals(operator)){
            result = calculator.plus(num1, num2);
        } else if("-".equals(operator)){
            result = calculator.minus(num1, num2);
        } else if("*".equals(operator)){
            result = calculator.mutifly(num1, num2);
        } else if("/".equals(operator)){
            if(num2 != 0) {
                result = calculator.divide(num1, num2);
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }

        System.out.println(result);
    }
}