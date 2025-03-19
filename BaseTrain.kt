package railway

//Базовый класс для поездов
open class BaseTrain(
    open val trainNumber: String, //Номер поезда
    open val departureTime: String, //время отправления
    open val arrivalTime: String, //Время прибытия
    open val stations: List<String>, //Список остановок
    open val price: Double //Цена билета
) {
    //Метод для вывода информации о рейсе
    open fun displayInfo() {
        println("Поезд: $trainNumber")
        println("Время отправления: $departureTime")
        println("Время прибытия: $arrivalTime")
        println("Цена: $price")
        println("Маршрут: ${stations.joinToString(" -> ")}")
    }
}