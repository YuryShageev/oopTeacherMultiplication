import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hi");
        Random random = new Random();

        Set<MultiplicationVariables> multiplicationVariables = new HashSet<>();
        while (multiplicationVariables.size() < 15) {
            MultiplicationVariables multiplicationVariables1 = new MultiplicationVariables(random.nextInt(9) +2, random.nextInt(9) + 2);
            multiplicationVariables.add(multiplicationVariables1);
            System.out.println(multiplicationVariables1);
        }
    }


}
