package head.repository;

import head.domain.HeadRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<HeadRole, Long> {
    HeadRole findByName(String name);
}
