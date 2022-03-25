package pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.domain.AppUser;

public interface UserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
