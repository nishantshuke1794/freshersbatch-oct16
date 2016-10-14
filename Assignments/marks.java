import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class marks{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;int m1,m2,m3;
		System.out.println("Enter marks of 3 subjects:");
		m1=Integer.parseInt(br.readLine());
		m2=Integer.parseInt(br.readLine());
		m3=Integer.parseInt(br.readLine());
		if(m1>60 && m2>60 && m3>60){
			System.out.println("Passed");
		}
		else if((m1>60&&m2>60) || (m2>60&&m3>60) || (m1>60&&m3>60)){
			System.out.println("Promoted");
		}
		else if((m1<60 && m2<60 && m3<60) || (m1>60 && m2<60 && m3<60) ||(m1<60 && m2>60 && m3<60) || (m1<60 && m2<60 && m3>60) ){
			System.out.println("Failed");
		}
	}
}
