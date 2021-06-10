package com.example.SpringBootAPIRest.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class HelloController {

    @RequestMapping("/")
    @ResponseBody //Spring considera que o retorno do método é o nome da página que ele deve carregar, mas ao utilizar a anotação @ResponseBody, indicamos que o retorno do método deve ser serializado e devolvido no corpo da resposta.um arquivo
    fun hello() = "Hello WorLd"

}