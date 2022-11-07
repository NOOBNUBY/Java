package MyCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너

        System.out.println("========계산기=========");
        System.out.println("안녕하세요 계산기 입니다."); //대충 문구 작업
        System.out.println("첫번째 수를 입력해주세요.");
        int num1 = sc.nextInt(); //스캐너로 int 값을 입력 받음 그리고 num1에 저장
        System.out.println("두번째 수를 입력해주세요.");
        int num2 = sc.nextInt(); //스캐너로 int 값을 입력 받음 그리고 num2에 저장
        System.out.println("======================\n");
        System.out.println("=====계산 결과=====");
        System.out.printf("%d + %d = " + (num1 + num2) + "\n",num1,num2); //입력 받은 값을 num1 + num2 = 몫 형식으로 출력
        System.out.printf("%d - %d = " + (num1 - num2) + "\n",num1,num2); //입력 받은 값을 num1 - num2 = 몫 형식으로 출력
        System.out.printf("%d * %d = " + (num1 * num2) + "\n",num1,num2); //입력 받은 값을 num1 * num2 = 몫 형식으로 출력
        System.out.printf("%d / %d = " + (num1 / num2) + "\n",num1,num2); //입력 받은 값을 num1 / num2 = 몫 형식으로 출력
    }
}