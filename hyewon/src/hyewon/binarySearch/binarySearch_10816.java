package hyewon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binarySearch_10816 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[20000001];
		StringBuilder sb = new StringBuilder();	
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[Integer.parseInt(st.nextToken())+10000000]++;	
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
            sb.append(arr[Integer.parseInt(st.nextToken())+10000000] + " ");
        }
		
		System.out.println(sb);
		
		

	}

}
