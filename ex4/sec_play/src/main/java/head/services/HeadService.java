package head.services;

import head.domain.HeadRole;
import head.domain.HeadUser;
import head.repository.AppUserRepository;
import head.repository.RoleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
//@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class HeadService {
    private AppUserRepository userRepository;
    private RoleRepository roleRepository;

    public HeadUser saveUser(HeadUser appUser) {
//        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        return userRepository.save(appUser);
    }

    public HeadRole saveRole(HeadRole role) {
        return roleRepository.save(role);
    }

    public void addRoleToUser(Long id, String roleName) {
        var aa = userRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no user in db with id" + id));
        var ro = roleRepository.findByName(roleName);
        aa.getRoles().add(ro);



//        AppUser appUser = userRepository.findByUsername(username);
//        Role role = roleRepository.findByName(roleName);
//        appUser.getRoles().add(role);
    }

//    public AppUser getUser(String username) {
//        log.info("Fetching user {}", username);
//        return userRepository.findByUsername(username);
//    }

    public HeadUser getUser(Long id) {
        log.info("Fetching user {}", id);
        return userRepository.findById(id).orElseThrow();
    }

    public List<HeadUser> getUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }

}
