package records;

import java.util.Optional;

public record RecordC(Optional<Integer> optional1, Optional<Integer> optional2) {
    public RecordC(){
        this(Optional.empty(), Optional.of(1));
    }
}
