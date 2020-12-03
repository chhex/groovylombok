package ch.chesnb.beans.lombok

import lombok.Builder
import lombok.NonNull
import lombok.Value

@Value
@Builder
class TestE {
    @NonNull
    private String firstNotNull;
    private String second;
}
