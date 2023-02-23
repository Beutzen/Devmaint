package com.example.devmaint

interface Destinations {
    val route: String
    val title: String
    val icon : Int
}
object Material: Destinations {
    override val route: String ="=Material"
    override val title: String = "Material"
    override val icon = R.drawable.ic_menu
}
object Task : Destinations {
    override val route: String = "Task"
    override val title: String = "Task"
    override val icon = R.drawable.ic_home
}
object Tools : Destinations {
    override val route: String = "Tools"
    override val title: String = "Tools"
    override val icon = R.drawable.ic_location
}