package ch.chesnb.beans.lombok;
import lombok.*;

@Value
@Builder(toBuilder = true)
public class TestC {
    @NonNull
    private String firstNotNull;
    private String second;
}
