import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubblesort {    
	public static void main(String[] args) throws IOException {  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;int arr[];
		System.out.println("Enter the number of elements:");
		num=Integer.parseInt(br.readLine());
		arr=new int[num];
		System.out.println("Enter elements:");
		for(int i=0; i < num; i++){  
			arr[i]=Integer.parseInt(br.readLine());
		}  
		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){   
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  

			}  
		}  
		System.out.println("Array After Bubble Sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  

	}  
}  