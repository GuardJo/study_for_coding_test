package hyewon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class greedy_1049 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int pack = Integer.MAX_VALUE;
		int piece = Integer.MAX_VALUE;
		int result=0;
		int tmp = 0;
		tmp = n;
		
		
		
		for(int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine());
			pack = Math.min(pack,Integer.parseInt(st.nextToken()));
			piece = Math.min(piece,Integer.parseInt(st.nextToken()));
		}
		
		
		if(piece * 6 < pack){
			pack = piece * 6;
		}
		
		result = (n/6) * pack + Math.min(((n%6) * piece),pack);
		

		bw.write(result + "\n");
		
		
		bw.flush();
		bw.close();


	}

}
