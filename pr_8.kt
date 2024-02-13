import java.lang.Exception

fun main()
{
    try {
        var nasek = Nasek()
        nasek.Input(nasek)
        nasek.Output(nasek)
        nasek.Skor(nasek)
        nasek.Okras(nasek)
        nasek.Agata(nasek)
    }
    catch (e:Exception)
    {
        println("Информация введена некорректно.")
    }

}