package myFirstSpringKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MyAplication

fun main(){
    runApplication<MyAplication>()

}