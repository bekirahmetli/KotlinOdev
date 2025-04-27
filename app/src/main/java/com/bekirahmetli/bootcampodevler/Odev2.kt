class Odev2 {

    //Celsius'u Fahrenheit'a çeviren metod
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    //Dikdörtgen çevresi hesaplayan metod
    fun dikdortgenCevre(kisaKenar: Double, uzunKenar: Double): Double {
        return 2 * (kisaKenar + uzunKenar)
    }

    //Faktöriyel hesaplayan metod
    fun faktoriyel(sayi: Int): Int {
        var result = 1
        for (i in 1..sayi) {
            result *= i
        }
        return result
    }

    //Kelime içindeki 'a' harfi sayısını bulan metod
    fun kacTaneAVar(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }

    //Kenar sayısına göre iç açılar toplamını hesaplayan metod
    fun icAcilarinToplami(kenar: Int): Int {
        return (kenar - 2) * 180
    }

    //Gün sayısına göre maaş hesabı yapan metod
    fun maasHesaplama(gunler: Int): Int {
        val toplamSaat = gunler * 8
        val duzenliSaatler = if (toplamSaat <= 160) toplamSaat else 160
        val mesaiSaatleri = if (toplamSaat > 160) toplamSaat - 160 else 0

        val maas = (duzenliSaatler * 10) + (mesaiSaatleri * 20)
        return maas
    }

    //Kota miktarına göre ücret hesaplayan metod
    fun kotaFiyatiniHesapla(kota: Int): Int {
        return if (kota <= 50) {
            100
        } else {
            val extraKota = kota - 50
            100 + (extraKota * 4)
        }
    }
}

fun main() {
    val odev2 = Odev2()

    //Sıcaklık Dönüşümü
    val fahrenheit = odev2.celsiusToFahrenheit(25.0)

    //Dikdörtgen Çevresi
    val cevre = odev2.dikdortgenCevre(5.0, 10.0)

    //Faktöriyel Hesabı
    val faktoriyelSonuc = odev2.faktoriyel(5)

    //Kelime İçinde 'a' Harfi Sayısı
    val Asayisi = odev2.kacTaneAVar("Merhaba dünya")

    //İç Açıların Toplamı
    val icAcilar = odev2.icAcilarinToplami(5)

    //Maaş Hesabı
    val maas = odev2.maasHesaplama(22)

    //Kota Ücreti Hesabı
    val kotaFiyat = odev2.kotaFiyatiniHesapla(70)


    println("1. Celsius -> Fahrenheit: $fahrenheit F")
    println("2. Dikdortgen Cevre: $cevre")
    println("3. Faktoriyel: $faktoriyelSonuc")
    println("4. Kelimedeki A sayisi: $Asayisi")
    println("5. Ic Acilarin Toplami: $icAcilar")
    println("6. Maas: $maas")
    println("7. Kota Fiyat: $kotaFiyat")
}
