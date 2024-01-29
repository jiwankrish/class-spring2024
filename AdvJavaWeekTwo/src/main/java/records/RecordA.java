package records;

public record RecordA<T>(T t) implements InterfaceI{
    @Override
    public T methodA(){
        return t;
    }
}
