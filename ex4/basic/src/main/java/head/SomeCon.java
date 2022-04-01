package head;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

@RestController
//@Validated
public class SomeCon {

    //make call here, and if put param less than 5, it will give and error
//    @GetMapping("/a")
//    public int a(@RequestParam @Min(5) Integer age)
//    {
//        return age;
//    }

}
