package ch.chesnb.beans.lombok.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

@JsonDeserialize(builder = TestA.TestABuilder.class)
@Value
@Builder
public class TestA {
    @NonNull
    private String firstNotNull;
    private String second;

    @JsonPOJOBuilder(withPrefix = "")
    static class TestABuilder {
    }
}