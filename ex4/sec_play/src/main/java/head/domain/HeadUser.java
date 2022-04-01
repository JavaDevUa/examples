package head.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeadUser {
    @Id
    @GeneratedValue
    private Long id;
    private String personName;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<HeadRole> roles = new ArrayList<>();


    public HeadUser(String personName, String username, String password, Collection<HeadRole> roles) {
        this.personName = personName;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}
