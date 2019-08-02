package pl.inforaf.invoices.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.inforaf.invoices.domain.entity.UserEntity;
import pl.inforaf.invoices.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserRestController {
    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    ///  GET  /rest/user/{id}
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public UserEntity find(@PathVariable Long id) {
        return userService.findById(id);
    }

    ///  POST   /rest/user
    @RequestMapping(method = RequestMethod.POST)
    public UserEntity save(UserEntity user) {
        return userService.save(user);
    }


    /// GET   /rest/user
    @RequestMapping(method = RequestMethod.GET)
    public List<UserEntity> userList() {
        return userService.getUsers();
    }
}
