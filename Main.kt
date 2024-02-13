import java.lang.Exception

fun main()
{
    try
    {
        val avto = Avto()
        avto.Input(avto)
        avto.Output(avto)
        avto.Top_marki(avto)
        avto.Skor_Wt(avto)
        avto.Stoim(avto)
    }
    catch (e: Exception)
    {
        println("Информация введена некорректно.")
    }
}