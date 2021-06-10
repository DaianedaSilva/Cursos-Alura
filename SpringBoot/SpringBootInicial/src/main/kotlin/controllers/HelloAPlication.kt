package myFirstSpringKotlinApp.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloAPlication {

    @RequestMapping("/")
    fun hello() = "CURRENCYCONVERSION!"

}