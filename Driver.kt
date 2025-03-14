package models

//основной класс для водителей
open class Driver (val name: String){

    //количество рейсов у водителя
    private var countFlights = 0

    //расписание работы
    private val work = Array(7) { "не работает" }

    //метод для задания рабочего графика водителю
    fun WorkingSchedule(day: Int, schedule: String){
        if (day in 0..6){
            work[day] = schedule
        }
        else{
            println("некорректный день недели. Введите число от 0 до 6.")
        }
    }

    //метод вывода графика работы водителя
    fun InfoSchedule(){
        println("график работы водителя $name: ")

        for ((index, schedule) in work.withIndex()){
            val day = when(index){
                0 -> "понедельник"
                1 -> "вторник"
                2 -> "среда"
                3 -> "четверг"
                4 -> "пятница"
                5 -> "суббота"
                6 -> "воскресенье"
                else -> "ошибка"
            }
            println("$day: $schedule")
        }
    }

    //метод о завершении рейса
    open fun End_Trip(car: Car){
        println("$name завершил рейсс на автомобиле ${car.brand} ${car.model}.")
        countFlights++
    }

    //метод для получения кол-ва рейсов
    fun GetCountFlights(): Int = countFlights

    //метод для проверки кол-ва рейсов у водителя
    fun CheckingFlights(): Boolean = countFlights < 1

    //метод для подачи заявки на ремонт автомобиля
    open fun RequestRepair(car: Car){
        println("$name подал заявку на ремонт автомобиля ${car.brand} ${car.model}.")
    }
}