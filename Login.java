import java.util.Scanner;

public class Login{
	
	static boolean active=true;
	static int due=3;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		if(active) {
			inlet();
			while(due>0) {
				System.out.print("Please enter your username.");
				String username= sc.nextLine();
		        System.out.print("Please enter your password.");
				String password= sc.nextLine();
				
			 boolean result = loogin(username, password);
			if( result== true) {
				System.out.println(" Logged into the system successfully..");
				break;
			}
			if( due==0 ) {
				System.out.println("You have not any due.");

			}
				
			}
			
			
			
			
		}
		else{
			System.out.println("Your account is not active yet..");
			
		}
			
			
			
			
			
			
			
			
			
		}
		
		public static void inlet() {
			System.out.println("Your account actived..");
			
		}
		
		public static boolean loogin(String username, String password) {
			if(username.equals("filiz") && password.equals("123") ) {
				System.out.println("Your entering username and password are correct..");
				return true;
			}
				
			else {
				due--;
				System.out.println("Your entering username or password are wrong..");
				
			return false; 
			}
		}
}