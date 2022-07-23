package de.jakkoble

import de.jakkoble.plugins.configureHTTP
import de.jakkoble.plugins.configureRouting
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureHTTP() // Extension Function
        configureRouting() // Extension Function
    }.start(wait = true)
}

/*
Simple Kotlin/Ktor API Example by Jakkoble
To test the API go to http://localhost:8080
The List is just saved in Runtime => if you stop the Server, the List is gone
*/