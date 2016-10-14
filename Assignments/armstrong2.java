import java.io.*;
class armstrong2{
	public static void main(String[] args){
		int num;int rem,cube;int res=0;
		int i;
		for(i=100;i<=999;i++){
			num=i;
			int j = num;
			while(num!=0){
				rem=num%10;
				cube=rem*rem*rem;
				res=res+cube;
				num=num/10;
			}
			if(res==i){
				System.out.print(res+",");
			}
			res = 0;
		}
	}
}

