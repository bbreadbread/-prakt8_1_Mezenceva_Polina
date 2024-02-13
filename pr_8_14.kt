import java.lang.Exception

fun main()
{
    try
    {
        var avto = Avto()
        avto.Input(avto)
        avto.Output(avto)
    }
    catch (e: Exception)
    {
        println("Информация введена некорректно.")
    }
}