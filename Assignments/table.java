import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class table{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter a number:");
		num=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++){
			if(i!=10)
				System.out.print(i*num+",");
			else
				System.out.print(i*num);
		}
	}
}
