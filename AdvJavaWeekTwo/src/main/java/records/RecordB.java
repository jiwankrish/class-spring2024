package records;

public record RecordB<T>(T t) implements InterfaceI{
    @Override
    public T methodA() {
        return t;
    }
}
