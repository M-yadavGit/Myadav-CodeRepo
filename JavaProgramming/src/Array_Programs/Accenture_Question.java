package Array_Programs;
import java.util.*;
public class Accenture_Question {

	public static void main(String[] args) {
		int[] A= {12,24,16,12};
		int P=2;
		int Q=3;
		int S=0;
		int T=A.length;
		int result=findDividend(A,P,Q,S,T);
		System.out.println(result);
		

	}
	public static int findDividend(int[] A,int P,int Q,int S,int T) {
		int dividend=P*Q+S;
		for(int i=0;i<T;i++) {
			if(A[i]==dividend) {
				return i;
			
		}
}
		return -1;
		//throws ExeptionfindDividend(int[] A,int P,int Q,int S,int T)
	}

}
