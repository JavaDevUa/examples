package pack.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.domain.AppUser;
import pack.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

//    public UserResource(UserService userService) {
//        this.userService = userService;
//    }

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getUsers()
    {
        return ResponseEntity.ok().body(userService.getUsers());
    }
}
