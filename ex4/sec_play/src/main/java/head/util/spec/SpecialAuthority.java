package head.util.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "authorities")
@Data
@NoArgsConstructor
public class SpecialAuthority {
    @Id
    @GeneratedValue
    Long id;
    String username;
    String authority;

    public SpecialAuthority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }
}
