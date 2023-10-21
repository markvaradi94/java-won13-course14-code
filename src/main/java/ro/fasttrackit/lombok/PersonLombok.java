package ro.fasttrackit.lombok;

import lombok.*;

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
//@RequiredArgsConstructor
//@AllArgsConstructor
@Data
@Builder
public class PersonLombok {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
}
