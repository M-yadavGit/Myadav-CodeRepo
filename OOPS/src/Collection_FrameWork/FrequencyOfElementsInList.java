package Collection_FrameWork;
import java.util.ArrayList;
import java.util.List;
public class FrequencyOfElementsInList {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(20);
		l1.add(28);
		l1.add(20);
		l1.add(56);
		l1.add(20);
		getFrequency(l1);
	}
	public static void getFrequency(List<Integer> l1) {
		for(int i=0;i<l1.size();i++) {
			int count=1;
			for(int j=i+1;j<l1.size();j++) {
				if(l1.get(i)==l1.get(j)){
					count++;
					l1.remove(j);
					j--;
				}
			}
			System.out.println(l1.get(i)+" is "+count+" times ");
		}
		
	}

}
