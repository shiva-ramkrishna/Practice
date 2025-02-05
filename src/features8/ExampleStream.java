package features8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExampleStream {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        for (Integer a:num)
//        {
//            System.out.println(a);
//        }
        // with iterator
//        Iterator<Integer> obj=num.listIterator();
//        while (obj.hasNext())
//        {
//            System.out.println(obj.next());
//        }
        // Lambda
//        num.forEach(a-> System.out.println(a));

//        List <Integer> even=num.stream().filter(x-> x%2==0).toList();
//        System.out.println(even);

        int sum=num.stream().map(x->x*x).reduce(0,Integer::sum);
        System.out.println(sum);
        //   1+2
        // 0+x+x

    }
}
