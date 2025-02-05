import java.util.Arrays;
import java.util.Optional;

public class OptionalExp {
    public static void main(String[] args) {
        int ar[]=new int[5];
        System.out.println(Arrays.toString(ar));
        String arr[]=new String[5];
        arr[1]="thijfasfsajfsaglas";
        Optional<String> obj=Optional.ofNullable(arr[1]);
        if (obj.isPresent())
        {
            System.out.println(arr[1].toUpperCase());
        }
        else{
            System.out.println("Obj is null!!");
        }

    }
}
