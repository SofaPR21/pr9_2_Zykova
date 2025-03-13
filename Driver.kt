package models

//основной класс для водителей
open class Driver (val name: String){

    //количество рейсов у водителя
    private var countFlights = 0

    //расписание работы
    private val work = Array(7){
        "не работает"
    }

    //метод для задания рабочего графика водителю
    fun WorkingSchedule(day: Int, schedule: String){
        if (day in 0..6){
            work[day] = schedule
        }
        else{
            println("некорректный день недели. Введите число от 0 до 6.")
        }
    }

    //метод вывода графтка работы
    fun InfoSchedule(){
        println("график работы водителя $name: ")

    }

    //метод о завершении рейса
    open fun End_Trip(car: Car){
        println("$name завершил рейсс на автомобиле ${car.brand} ${car.model}.")
    }

    //метод для подачи заявки на ремонт автомобиля
    open fun RequestRepair(car: Car){
        println("$name подал заявку на ремонт автомобиля ${car.brand} ${car.model}.")
    }
}