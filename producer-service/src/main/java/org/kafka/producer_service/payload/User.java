package org.kafka.producer_service.payload;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String place;
}
