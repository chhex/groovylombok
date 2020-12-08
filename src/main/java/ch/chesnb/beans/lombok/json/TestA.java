package ch.chesnb.beans.lombok.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

@JsonDeserialize(builder = TestA.TestBuilder.class)
@Value
@Builder
public class TestA {
    @NonNull
    private String firstNotNull;
    private String second;

    @JsonPOJOBuilder
    static class TestBuilder {
    }
}