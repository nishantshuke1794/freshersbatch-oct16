import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class gui{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sname="Nishant";
		String spassword="123";
		String name,password;
		int attempts=3;
		do{
			System.out.println("Enter Login Name");
			name=br.readLine();
			System.out.println("Enter Password");
			password=br.readLine();

			if(name.equals(sname) && password.equals(spassword)){
				System.out.println("Welcome "+name);
				break;
			}
			else{
				attempts--;
				if(attempts==0){
					System.out.println("Contact Admin");
					break;
				}
				System.out.println("Retry");
			}
		}while(attempts!=0);
	}
}
