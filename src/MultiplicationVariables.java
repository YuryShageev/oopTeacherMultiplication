import java.util.Objects;
import java.util.stream.IntStream;

public class MultiplicationVariables {

    private int a;
    private int b;

    public MultiplicationVariables(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationVariables that = (MultiplicationVariables) o;
        return a == that.a && b == that.b || a == that.b && b == that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a) + Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a + " * " + b + " = " + (a*b);
    }
}
