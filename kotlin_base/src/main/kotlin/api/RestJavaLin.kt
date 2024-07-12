package org.kot.api

import io.javalin.Javalin

fun main() {
    val app = Javalin.create().start(8088)

    app.get("/") { ctx -> ctx.result("Hello, World!") }

    app.get("/users") { ctx ->
        val users = listOf(
            User(1, "John Doe", "john.doe@example.com"),
            User(2, "Jane Smith", "jane.smith@example.com")
        )
        ctx.json(users)
    }

    app.post("/users") { ctx ->
        val user = ctx.bodyAsClass(User::class.java)
        println("New user: $user")
        ctx.status(201)
    }
}

data class User(val id: Int, val name: String, val email: String)