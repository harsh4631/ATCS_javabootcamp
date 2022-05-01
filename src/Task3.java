public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{25, 11, 7, 75, 56,1};
        int k = 3;
        int i,j;
        int max = 0;
        for ( i = 0; i < arr.length; i++) {
            for ( j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }
        for( i=0;i<=arr.length;i++)
        {
           // System.out.println(arr[i]);
        }
        for (i=0;i<k;i++)
        {
            System.out.println("the k element is "+ arr[i]);
        }
        }
    }
