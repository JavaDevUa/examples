package head.repository;

import head.domain.HeadUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<HeadUser, Long> {
    //    AppUser findByUsername(String username);
    HeadUser findByPersonName(String personName);
//    HeadUser findByPersonName
}
