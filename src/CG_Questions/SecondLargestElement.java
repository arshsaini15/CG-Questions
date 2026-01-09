package CG_Questions;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {11, 22, 10, 9, 43};

        int first = 0, second = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > second && arr[i] > first) {
                second = first;
                first =  arr[i];
            }
            else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}
