public class bubbleSort {
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {7,9,8,5,10};
        // Ascending order of Numbers:
        for(int i=0; i<arr.length-1; i++){
            for (int j = 0;j< arr.length-i-1; j++){ // this condition of j<arr.length-i-1 is to ignore the last already ordered numbers.
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

        // Descending order of Numbers:
        for(int k = 0; k<arr.length-1; k++){
            for(int l=0; l<arr.length-k-1; l++){
                if(arr[l]<arr[l+1]){
                    int temp2 = arr[l+1];
                    arr[l+1] = arr[l];
                    arr[l] = temp2;
                }
            }
        }
        System.out.println("\nNumbers in descending order are: ");
        printArray(arr);
    }
}