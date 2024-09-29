import java.util.Scanner;

public class NumberOfDays {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input year (eg: 2024): ");
		int year = keyboard.nextInt();
		
		System.out.print("Input month (eg: January, Jan., Jan, 1): ");
		String inputMonth = keyboard.next();
		
		keyboard.close();
        
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] abbreviationMonth = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] shortMonth = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] monthNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int month = 0;
        
        for (int i = 0; i < 12; i++) {
            if (inputMonth.equalsIgnoreCase(months[i]) || 
            	inputMonth.equalsIgnoreCase(abbreviationMonth[i]) || 
            	inputMonth.equalsIgnoreCase(shortMonth[i]) || 
            	inputMonth.equalsIgnoreCase(monthNumbers[i])) {
            	month = i + 1;
                break;
            }
        }
        
        int numberDays = 0;

        switch(month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	numberDays = 31;
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	numberDays = 30;
        	break;
        case 2:
        	numberDays = 28;
        	if (year % 4 == 0)  {
        		if(year % 100 != 0 || year % 400 == 0) {
        			numberDays = 29;
        		}
        	}
        	break;
        default:
        	System.err.println("Worng input");
        	return;
        }
        
        System.out.println("Number day of " + year + " " + months[month - 1] + " is " + numberDays + ".");
        return;
	}
}
