package com.alt.randomchating.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class LoginController {
@RequestMapping("/login")
    fun login(): String{
        return "Hello"
    }
}