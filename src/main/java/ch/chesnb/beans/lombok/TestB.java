package ch.chesnb.beans.lombok;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestB {
    @NonNull
    private String firstNotNull;
    private String second;

}
