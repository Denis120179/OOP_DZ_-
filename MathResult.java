public class MathResult<T> {

    private final T t;

    public MathResult(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        String type = t == null ? "null" : t.getClass().getSimpleName();
        return "MathResult{" + type + ':' + t + '}';
    }
}