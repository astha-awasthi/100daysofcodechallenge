public class SelectionSort {
    public static void func(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }
    public static void main(String args[])
    {
     int[] arr1={1,2,3,8,5,6,9,3};
        System.out.println("before sorting");
        for (int i:arr1) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        func(arr1);
        System.out.println("after sorting");
        for (int i:arr1) {
            System.out.print(i+" ");
        }
    }
}
