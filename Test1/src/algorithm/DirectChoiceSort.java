package algorithm;

/**
 * Ö±½ÓÑ¡Ôñ
 * 
 * @author
 *
 */
public class DirectChoiceSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 42, 9, 30, 3, 200, -10, 0, 6, -20, 1,39 };
		for (int i = 0; i < arr.length - 1; i++) {
			int t = i;
            for (int j = i; j < arr.length; j++) {
				if(arr[t] > arr[j]){
					t = j;
				}
			}
            if(t != i){
            	int temp = arr[t];
				arr[t] = arr[i];
				arr[i] = temp;
            }
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

}
