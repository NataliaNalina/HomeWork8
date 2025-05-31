import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home work loop");
        int[] arr = new int[] {1,2,3};
        double[] numb = new double[] {1.57,7.654,9.986};
        char[] alpha = new char[]{'a','b','c','d','e','f'};

        System.out.println("Задача 2. ");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i]+" ");
        }
        for ( int i = 0; i < numb.length; i++){
            if (i == numb.length - 1) {
                System.out.println(numb[i]);
                break;
            }
            System.out.print(numb[i]+" ");
        }
        for ( int i = 0; i < alpha.length; i++){
            if (i == alpha.length - 1) {
                System.out.println(alpha[i]);
                break;
            }
            System.out.print(alpha[i]+" ");
        }
        System.out.println("Задача 3. ");
        for (int i = arr.length-1; i >=0; i--){
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i]+" ");
        }
        for ( int i = numb.length-1; i >=0; i--){
            if (i == 0) {
                System.out.println(numb[i]);
                break;
            }
            System.out.print(numb[i]+" ");
        }
        for ( int i = alpha.length-1; i >=0; i--){
            if (i == 0) {
                System.out.println(alpha[i]);
                break;
            }
            System.out.print(alpha[i]+" ");
        }
        System.out.println("Задача 4. ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                arr[i] +=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}