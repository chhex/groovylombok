package ch.chesnb.beans.lombok;

import lombok.*;

@Value
@Builder
public class TestA {
    @NonNull
    private String firstNotNull;
    private String second;

}
