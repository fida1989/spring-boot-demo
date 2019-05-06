package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
@RestController

class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@RestController
class Controller {
    @GetMapping("/")
    fun helloWorld() = "Hello World"

    @GetMapping("/{user}")
    fun helloUser(@PathVariable("user") user: String) = "Hello $user!"

    @RequestMapping("/")
    fun helloUserPost(@RequestParam("user", defaultValue = "User") user: String) = "Hello $user!"

}





