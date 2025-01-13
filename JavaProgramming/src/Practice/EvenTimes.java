package Practice;

public class EvenTimes {
		public static void main(String[] args) {
			int[] a= {10,20,20,10,33,22,67,21,33,22,33,10,10,10};
			getEvenTimes(a);
}
		public static void getEvenTimes(int[] a) {
			int[] b=new int[101];
			for(int i=0;i<a.length;i++) {
				b[a[i]]++;
			}
			for(int i=0;i<b.length;i++) {
				if(b[i]>0 && b[i]%2==0)
					System.out.println(i+ " is"+ b[i]+" times");
			}
		}
}
