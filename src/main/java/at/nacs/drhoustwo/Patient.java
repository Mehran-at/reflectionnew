package at.nacs.drhoustwo;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Patient {
    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String treatment;
}
