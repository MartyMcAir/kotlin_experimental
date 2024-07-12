package org.kot.api

//import io.ktor.application.*
//import io.ktor.features.*
//import io.ktor.http.*
//import io.ktor.response.*
//import io.ktor.routing.*
//import io.ktor.server.engine.*
//import io.ktor.server.netty.*
//
//fun main() {
//    embeddedServer(Netty, port = 8080) {
//        configureRouting()
//    }.start(wait = true)
//}
//
//fun ContentType.Application.configureRouting() {
//    install(ContentNegotiation) {
//        jackson()
//    }
//
//    routing {
//        get("/") {
//            call.respondText("Hello, World!", ContentType.Text.Plain)
//        }
//    }
//}