package com.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password")
public class PasswordController {

    @GetMapping("/generate")
    public String generate(
            @RequestParam int length,
            @RequestParam boolean lower,
            @RequestParam boolean upper,
            @RequestParam boolean numbers,
            @RequestParam boolean symbols
    ) {
        return PasswordGenerator.generatePassword(
                length, lower, upper, numbers, symbols
        );
    }
}
