package acsl;
import java.util.Scanner;

public class finger {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sumEven = 0; // 변수 설정
	        int sumOdd = 0; // 변수 설정

	        while (true) { // 반복문 (아래가 계속 true일시 계속 실행)
	        
	        	int input = scanner.nextInt();
	        	
	        	if (input == 0) { // 0이 나오기 전까지 계속 input을 받음
	        		break; // 0이 나오면 이탈
	        	}

	        int representingNum; // 각 숫자가 상징하는 숫자
	        switch (input) { // switch case문 사용
            case 1: // input이 1일때
            case 2: //input이 2일때
            	representingNum = 16; //16을 상징함
                break;
            case 3: 
            case 4:
            	representingNum = 8;
                break;
            case 5:
            case 6:
            	representingNum = 4;
                break;
            case 7:
            case 8:
            	representingNum = 2;
                break;
            case 9:
            case 10:
            	representingNum = 1;
                break;
            default:
            	representingNum = 0; // 기본값 0
        }
	        
	        	
	        	   if (input % 2 == 0) { // 만약 input이 even일때
	   	        	sumEven += representingNum; // sumEven = representingNum들의 합
	   	        }
	        	   else { // 아닐때 (만약 input이 odd일때)
	        		   sumOdd += representingNum; // sumOdd = representingNum들의 합
	        	   }
	        	   
	        	   
	        }
	        
	        	System.out.println((sumEven + 1) + "/" + (sumOdd + 1)); //괄호 까먹지 않기
	        
	        
	        
	        
	        
	    }
	}
