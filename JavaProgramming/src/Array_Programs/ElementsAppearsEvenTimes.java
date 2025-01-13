package Array_Programs;

public class ElementsAppearsEvenTimes {
			public static void main(String[] args) {
			int[] a= {1,2,2,3,3,3,4,4,4,4,8,9,6,1};
			getUniqueElements(a);
		}

			public static void getUniqueElements(int[] a) {
				int[] b=new int[101];
				for(int i=0;i<a.length;i++) {
					b[a[i]]++;
				}
				for(int i=0;i<b.length;i++) {
					if(b[i]%2==0 && b[i]>0)
						System.out.println(i);
				}
			}
		}


