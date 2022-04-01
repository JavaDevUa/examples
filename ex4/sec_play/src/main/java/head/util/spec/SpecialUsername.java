package head.util.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Data
@NoArgsConstructor
public class SpecialUsername {
    @Id
    @GeneratedValue
    Long id;
    @Column(unique = true)
    String username;
    String password;
    int enabled;

    public SpecialUsername(String username, String password, int enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }
}
