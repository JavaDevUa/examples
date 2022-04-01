package head.domain;

import head.util.RoleCon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeadRole {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;

    public HeadRole(RoleCon roleCon) {
        name = roleCon.label;
    }

    public HeadRole(String name) {
        this.name = name;
    }
}
