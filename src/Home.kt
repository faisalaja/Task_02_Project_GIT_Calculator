import com.sun.tools.corba.se.idl.constExpr.Plus

/**
 * Create by Muhammad Al Faisal on 12/12/20, 2020
 */
open class Home {

    open fun printHasil() {
        println("=====================")
        println("+Aplikasi Kalkulator+")
        Plus().print(20, 30)
        Minus().print(50, 30)
    }
}