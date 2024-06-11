public class Assignment {
    public static void main(String[] args) {
     
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

     
        int[] result = rotLeft(a, d);

       
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        d = d % n;
        int[] rotatedArray = new int[n];

     
        for (int i = 0; i < n - d; i++) {
            rotatedArray[i] = a[i + d];
        }
        
    
        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = a[i];
        }

        return rotatedArray;
    }
}
