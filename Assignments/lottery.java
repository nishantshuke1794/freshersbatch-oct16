import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class lottery{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,i,j;int[] rnum=new int[6];int[] inum=new int[6];
		Random r = new Random();
		for(i=0;i<6;i++){
			rnum[i]=0;
			inum[i]=0;
		}
		for(i=0;i<6;i++){
			rnum[i]=r.nextInt((49 - 1) + 1) + 1;
			for(j=0;j<6;j++){
				if(rnum[i]==rnum[j])
					rnum[i]=r.nextInt((49 - 1) + 1) + 1;
			}
		}
		System.out.println("Enter 6 numbers");
		for(i=0;i<6;i++){
			inum[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<6;i++){
			for(j=0;j<6;j++){
				if(inum[i]==rnum[j]){
					System.out.println(inum[i]);
				}
			}
		}
	}
}
