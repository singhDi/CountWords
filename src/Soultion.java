import java.util.ArrayList;

public class Soultion {

	public static int solution(String s) {
		int count = 0;
		int j = 0;
		int []a = new int[s.length()];
		int value = 0;
		
		for ( int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			} else if (s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == '.') {
				if (j == 0) {
					a[j] = count + 1;
					value = a[j];
				} else {
					a[j] = count;
					if (a[j] > value) {
						value = a[j];
					}
				}
				
				
				j++;
				count = 0;
			}	
		
		}
		
		return value;
	}
	
	public static int getMaximum(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int solution2(String s) {
		String[] arr = s.split("\\. |\\? |\\! ");
		int maxvalue = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			int len = arr[i].split(" ").length;
			if (maxvalue < len) {
				maxvalue = len;
			}
			
		}
		
		return maxvalue;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello My name is Dip? Whatever is name .";
		
		String name = "What is your..name! Hello. I am pratik! Are you going to nepal i am?";

       
		
		System.out.println(solution2(name));
	}

}
