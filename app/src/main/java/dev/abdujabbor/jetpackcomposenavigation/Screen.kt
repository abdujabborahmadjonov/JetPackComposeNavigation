package dev.abdujabbor.jetpackcomposenavigation

sealed class Screen(var route :String){
    object MainScreen:Screen("main_screen")
    object DeatailScreen:Screen("detail_screen")
    fun withArgs(vararg args:String):String{
        return buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }
    }
}
