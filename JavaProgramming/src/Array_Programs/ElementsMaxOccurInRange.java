package Array_Programs;

public class ElementsMaxOccurInRange {
			public static void main(String[] args) {
			int[] a= {1,2,2,3,3,3,4,4,4,4,8,9,6,1};
			getUniqueElements(a);
			}

			public static void getUniqueElements(int[] a) {
				int maxCount=0;
				//int count=0;
				int[] b=new int[101];
				for(int i=0;i<a.length;i++) {
					b[a[i]]++;
				}
				for(int i=0;i<b.length;i++) {
					if(b[i]>0 )
					{
					if(b[i]>maxCount)
						maxCount=b[i];
						System.out.println(i+" is "+b[i]+" times");
				}
				}
				System.out.println("Maximum Occurence is: "+maxCount);
				
			}
}
