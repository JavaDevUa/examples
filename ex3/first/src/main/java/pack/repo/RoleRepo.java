package pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
