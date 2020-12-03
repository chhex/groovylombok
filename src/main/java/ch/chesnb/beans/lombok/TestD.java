package ch.chesnb.beans.lombok;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class TestD {
    @NonNull
    private String firstNotNull;
    private String second;

    public TestD(String firstNotNull, String second) {
        this.firstNotNull = firstNotNull;
        this.second = second;
    }
}
