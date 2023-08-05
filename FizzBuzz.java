import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();

        for (int i=1;i<=n;i++){
            String value=(i%15==0)?"FizzBuzz":(i%5==0)?"Buzz":(i%3==0)?"Fizz":String.valueOf(i);
            output.add(value);
        }
        return output;
    }

}
