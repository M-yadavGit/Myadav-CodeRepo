package Array_Programs;

public class FrequencyOfCharAnyRange {
		public static void main(String[] args) {
			char[] c= {'a','c','A','B','A','b','a','d','a','x'};
			getFrequency(c);
		}
		public static void getFrequency(char[] a) {
			int n=a.length;
			for(int i=0;i<n;i++) {
				int count=1;
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						count++;
						a[j]=a[n-1];
						n--;
						j--;
					}
				}
				System.out.println(a[i]+" is: "+count+" times ");
			}
			
		}

	}

