package models

//базовый класс для автомобилей
open class Car (val brand: String, val model: String){

    //метод на запрос ремонта автомобиля
    open fun repair(){
        println("Автомобиль $brand $model требует ремонта.")
    }
}
