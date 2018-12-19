package me.robbie.services.demo.controller;

import lombok.extern.slf4j.Slf4j;
import me.robbie.services.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserService {
    private static Map<Long, User> users = new HashMap<>();

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getUser() {
        List<User> r = new ArrayList<>(users.values());
        r.forEach(i-> log.info(i.toString()));
        return r;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String newUser(@RequestBody User user) {
        log.info(user.toString());
        users.put(user.getUserId(), user);
        return "success";
    }

    @RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        User u = users.get(userId);
        log.info(u.toString());
        return u;
    }
}
