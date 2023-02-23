package com.example.devmaint

interface Destinations {
    val route: String
}
object Material: Destinations {
    override val route: String ="=Material"
}
object Task : Destinations {
    override val route: String = "Task"
}
object Tools : Destinations {
    override val route: String = "Tools"
}