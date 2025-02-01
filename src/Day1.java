import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int [] arr=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("Enter the value of index arr["+i+"] : ");
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));




        // 2 -> 010
        // 3 << 011
        //      011

        int a=2;
        a<<=2;
//        System.out.println(a);


//        int positive=-10;
//        System.out.println(positive<0 ? -positive : positive);

//        int a=0;
//        while(true)
//        {
//            if (a<0)
//            {
//                System.out.println("Positive Limit: "+((int)(a-1)));
//                System.out.println("Negative Limit: "+((int)a));
//
//                break;
//            }
//            a++;
//        }

//        char a='A';
//        System.out.println((int)a);

//        int a=1;
//        System.out.println(a);
//        System.out.println(a--);
//        System.out.println(a);


    }

}
