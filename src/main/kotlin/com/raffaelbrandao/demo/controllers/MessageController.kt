package com.raffaelbrandao.demo.controllers

import com.raffaelbrandao.demo.data.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @GetMapping("/")
    fun index(@RequestParam("name") name : String) = "Hello, $name!"
    @GetMapping("/message")
    fun message() = listOf(
            Message("1", "Hello!"),
            Message("2", "Bonjour!"),
            Message("3", "Privet!"),
    )
}