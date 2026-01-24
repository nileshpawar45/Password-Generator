package com.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password")
public class PasswordController {
 private PasswordGenerator pg;
    @GetMapping("/generate")
    public String generate(
            @RequestParam int length,
            @RequestParam boolean lower,
            @RequestParam boolean upper,
            @RequestParam boolean numbers,
            @RequestParam boolean symbols
    ) {
        return pg.generatePassword(
                length, lower, upper, numbers, symbols
        );
    }
}
