package models

//класс для грузовиков (наследующий класс Car)
class Truck (brand: String, model: String) : Car(brand, model){

    //переопределение метода ремонта для грузовиков
    override fun repair(){
        println("Автомобиль $brand $model требует ремонта.")
    }

}