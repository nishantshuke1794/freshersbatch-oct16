import java.io.*;
public class armstrong{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;int rem,cube;int res=0;
		System.out.println("Enter a number:");
		num=Integer.parseInt(br.readLine());
		int temp=num;
		while(num!=0){
			rem=num%10;
			cube=rem*rem*rem;
			res=res+cube;
			num=num/10;
		}
		if(res==temp){
			System.out.println("It is an Armstrong Number");
		}
		else{
			System.out.println("It is not an Armstrong Number");
		}
		res=0;
	}
}
