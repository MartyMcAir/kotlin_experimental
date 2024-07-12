package org.kot.api

import java.io.IOException
import java.net.HttpURLConnection
import java.net.InetSocketAddress
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer
import java.util.concurrent.Executors

fun main() {
    // curl http://localhost:8080
    val server = HttpServer.create(InetSocketAddress(8080), 0)
    server.createContext("/", object : HttpHandler {
        @Throws(IOException::class)
        override fun handle(exchange: HttpExchange) {
            if (exchange.requestMethod == "GET") {
                val response = "Hello, World!"
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.length.toLong())
                val os = exchange.responseBody
                os.write(response.toByteArray())
                os.close()
            }
        }
    })
    server.executor = Executors.newFixedThreadPool(4)
    server.start()
    println("Server started on port 8080")
}