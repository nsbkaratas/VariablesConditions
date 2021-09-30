package variablesConditions;

public class VariablesConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write an if/else statement for the following requirements:
//			If student gets 90 or higher: console log  A
//			If students get 80 or above: console log B
//			If students get 70 or above: console log C
//			If students get 55 or above: console log D
//			Any grade lower than 55 is F
//		int grade=94;
//		if (grade>=55) {
//			if(56<=grade && grade<=69) {
//				System.out.println("You got a D");
//			}else if(70<=grade && grade<=79) {
//				System.out.println("You got a C");
//			}else if(80<=grade && grade<=89) {
//				System.out.println("You got a B");
//			}else if(grade>=90) {
//				System.out.println("Congrats you got an A");
//			}	
//		}else {
//			System.out.println("Your grade is F");
//		}
		

//		Using switch case, do the following:
//			Store a number between 1-7
//			If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
//			Anything other than 1-7 would default to "Invalid Input"
		
//		int number= 3;
//		switch (number) {
//		  case 1:
//		    System.out.println("Monday");
//		    break;
//		  case 2:
//		    System.out.println("Tuesday");
//		    break;
//		  case 3:
//		    System.out.println("Wednesday");
//		    break;
//		  case 4:
//		    System.out.println("Thursday");
//		    break;
//		  case 5:
//		    System.out.println("Friday");
//		    break;
//		  case 6:
//		    System.out.println("Saturday");
//		    break;
//		  case 7:
//		    System.out.println("Sunday");
//		    break;
//		}
		
		
//		Store a number in a variable called num and write an if statement: 
//			If num is odd, display "Cool"
//			If num is even and between 2-5, display "Not Cool"
//			If num is even and between 6-20, display "Cool"
//			If num is even and greater than 20, display "Not Cool
		
		int num =21;
		
		if (num%2==0) {
			if (num>20) {
				System.out.println("Not Cool");
			}else if(5<num && num<21) {
				System.out.println("Cool");
			}else if(3<num && num<6) {
				System.out.println("Not Cool");
			}
		}else {
			System.out.println("Cool");
		}
	}

}
