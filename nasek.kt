class Nasek
{
    var name = "Насекомое"
    var skor_pered = 0.0
    var okras = " "
    var eda = " "
    var sr_obit = " "
    var skor_myhi = 5.0
    fun Input(nasek: Nasek)
    {
        println("Введите название насекомого ")
        nasek.name = readLine()!!.toString()
        println("Введите скорость передвижения насекомого(м/с)")
        nasek.skor_pered = readLine()!!.toDouble()
        println("Введите окрас насекомого ")
        nasek.okras = readLine()!!.toString()
        println("Введите предпочтения в еде насекомого ")
        nasek.eda = readLine()!!.toString()
        println("Введите среду обитания насекомого ")
        nasek.sr_obit = readLine()!!.toString()
    }
    fun Output(nasek: Nasek)
    {
        println("Название:" + nasek.name)
        println("Скорость:" + nasek.skor_pered)
        println("Окрас:" +nasek.okras)
        println("Предпочтения в еде:" +nasek.eda)
        println("Среда обитания:" +nasek.sr_obit)
    }

    fun Skor(nasek: Nasek)
    {
        when (nasek.skor_pered > skor_myhi)
        {
            false -> println(nasek.name + " не быстрее мухи");
            true -> println(nasek.name + " быстрее мухи")
        }
    }

    fun Okras(nasek: Nasek)
    {
       if(nasek.okras == "Желтый" || nasek.okras == "желтый") println("Насекомые с таким же окрасом: пчелы, бабочки-капустницы, тараканы домашние, жёлтые божьи коровки.")
       else if(nasek.okras == "Зеленый" || nasek.okras == "зеленый")println("Насекомые с таким же окрасом: обыкновенная златоглазка, зеленые богомолы, зеленые цикады, тараканы.")
       else if(nasek.okras == "Cиний" || nasek.okras == "синий" ||nasek.okras == "Голубой" || nasek.okras == "голубой")println("Насекомые с таким же окрасом: голубые стрекрозы, голубые бабочки")
       else if(nasek.okras == "Белый" || nasek.okras == "белый")println("Насекомые с таким же окрасом: белые бабочки, сахарная чешуйница, белокрылка, личинки.")
       else if(nasek.okras == "Красный" || nasek.okras == "красный")println("Насекомые с таким же окрасом: красная божья коровка, клоп-солдатик, красный муравей.")
       else if(nasek.okras == "Черный" || nasek.okras == "черный")println("Насекомые с таким же окрасом: блохи, мошки, сороконожка.")
       else println("В базе данных нет такого окраса.")
    }
    fun Agata(nasek: Nasek)
    {
       // сороконожка, ТАРАКАНЫ,( мошки , комары)
        if (nasek.name == "сороконожка" || nasek.name == "таракан") println("Агата боится этого насекомого.")
        else if (nasek.name == "мошка" || nasek.name == "комар") println("Агату раздражает это насекомое.")
        else println("Агата относится к этому насекомому нейтрально.")
    }
}