class Avto
{
    var marka = "Марка"
    var mosnost = 0.0
    var stoim = 0.0
    fun Input(avto: Avto)
    {
        println("Введите марку автомобиля")
        avto.marka = readLine()!!.toString()
        println("Введите мощность автомобиля(в л.с.)")
        avto.mosnost= readLine()!!.toDouble()
        println("Введите стоимость автомобиля(т. рублей)")
        avto.stoim = readLine()!!.toDouble()
    }
    fun Output(avto: Avto)
    {
        println("Марка: " + avto.marka)
        println("Мощность: " + avto.mosnost)
        println("Стоимость: " + avto.stoim)
    }
    fun Top_marki(avto: Avto)
    {
        if (avto.marka == "Nissan" ||avto.marka == "Porsche"||
            avto.marka == "Audi" ||avto.marka == "Hyundai"||
            avto.marka == "Ford" ||avto.marka == "Volkswagen"||
            avto.marka == "Honda" ||avto.marka == "BMW"||
            avto.marka == "Mercedes-Benz" ||avto.marka == "Toyota") println("Эта марка автомобиля входит в топ-10 самых популярных марок")
        else  println("Эта марка автомобиля НЕ входит в топ-10 самых популярных марок")
    }
    fun Skor_Wt(avto: Avto)
    {
        var mos = avto.mosnost * 735.49875;
        println("В этой марке автомобиля $mos Вт мощности")
    }
    fun Stoim(avto: Avto)
    {
        var sto1 = avto.stoim - (avto.stoim * 15 / 100) ;
        var sto2 = avto.stoim - (avto.stoim * 20 / 100);
        println("Со скидками в январе - феврале этот автомобиль будет стоить $sto2 - $sto1 т. рублей")
    }
}