package com.example.SpringBootAPIRest.controllers


import com.example.SpringBootAPIRest.model.Curso
import com.example.SpringBootAPIRest.model.Topico
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

@Controller
class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public fun lista():String{
        val topico = Topico("Duvida", "Duvida com Spring", Curso("Spring", "Programação"))

        return "Arrays.asList(topico, topico, topico)"
    }

}