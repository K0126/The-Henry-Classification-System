package acsl;
import java.util.Scanner;

public class finger {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sumEven = 0;
	        int sumOdd = 0;

	        while (true) {
	        
	        	int input = scanner.nextInt();
	        	
	        	if (input == 0) {
	        		break;
	        	}

	        int representingNum;
	        switch (input) {
            case 1:
            case 2:
            	representingNum = 16;
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
            	representingNum = 0;
        }
	        
	        	
	        	   if (input % 2 == 0) {
	   	        	sumEven += representingNum;
	   	        }
	        	   else {
	        		   sumOdd += representingNum;
	        	   }
	        	   
	        	   
	        }
	        
	        	System.out.println((sumEven + 1) + "/" + (sumOdd + 1));
	        
	        
	        
	        
	        
	    }
	}
