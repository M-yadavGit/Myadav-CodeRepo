package Array_Programs;
public class ThreeDigitsOfArray {
public static void main(String[] args) {
	int [] a= {10,222,2123,221,123,89898};
	for(int p:a)
		if(p>=100 && p<=999)
		System.out.println(p);
}
}