package TekPyramidPrograms;

public class AddTwoArrayElements {
	public static void main(String[] args) {
		int[] a= {2,3,6,7,8,9,4,3};
		int[] b= {2,6,4,2,7,4,8,5,5,7,0};
		int length=a.length;
		if(a.length<b.length)
			length=b.length;
		for(int i=0;i<length;i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			}catch (Exception e) {
				if(a.length<b.length) {
					System.out.print(b[i]+" ");
				}else {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
