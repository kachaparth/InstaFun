package ig.instagram;

import ig.instagram.dao.UserRepo;
import ig.instagram.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@CrossOrigin(origins = { "http://127.0.0.1:3000", "http://localhost:3000" })

@RestController
public class testController {

    @Autowired
    private UserRepo userRepo;



    @PostMapping("/users")
    public User createUser(@RequestBody User user) {

        return  userRepo.save(user);
    }

    @GetMapping("/users/{password}")
    public List<User> getAllUsers(@PathVariable("password") String pass)
        {
            List<User> users = null;
            if(Objects.equals(pass, "kacha"))
            users = userRepo.findAll();

            return users;
        }

}
