package com.alt.randomchating.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api")
@Controller
class LoginController {
@PostMapping("value = \"/user\"")
    fun login(): String{
        return "100"
    }
}