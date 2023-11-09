package com.num.numerology.controller;

import com.num.numerology.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class InputNameController {
    private final AtomicLong id = new AtomicLong();

    @PostMapping("/name")
    public User inputName(@RequestBody User user) {
        User userRecord = User.builder()
                .id(id.incrementAndGet())
                .name(user.getName())
                .birthday(user.getBirthday())
                .build();

        if (user.getPassword() != null) {
            userRecord.setPassword(user.getPassword());
        }

        return userRecord;
    }
}
