public class SumArray{
	public static void main(String[] args){
		int[] arr = {1,3,2,7,8,6,9};
		int i,n;

	// Sum of all the elements present in array -

		int sum = 0;
		for( int element : arr){
			sum += element;
		}
		System.out.println("Sum = " + sum);
		
	// Sum of elements present at even index-

		int evenSum = 0;
		n = arr.length;
		for( i = 0; i<n; i++){
			if(i%2==0){
				evenSum+=arr[i];
			}
		}
		System.out.println("Sum of elements at even index : " + evenSum);

	// Sum of element present at odd index-

		int oddSum = 0;
		for( i = 0; i<n; i++){
			if(i%2!=0){
				oddSum+=arr[i];
			}
		}
		System.out.println("Sum of elements at odd index : " + oddSum);

	// Sum of all odd elements

		int oddElementSum = 0;
		for( int elem : arr){
			if( elem%2!=0 )
				oddElementSum+=elem;
		}
		System.out.println("Sum of all odd elements : " + oddElementSum);
	}
}