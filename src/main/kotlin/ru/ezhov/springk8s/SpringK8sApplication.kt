package ru.ezhov.springk8s

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
class SpringK8sApplication

fun main(args: Array<String>) {
    runApplication<SpringK8sApplication>(*args)
}

@RestController
class GuidController {

    @GetMapping("/")
    fun guid() = UUID.randomUUID().toString()
}