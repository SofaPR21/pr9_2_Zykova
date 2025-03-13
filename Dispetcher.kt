package dispatcher

import models.Car
import  models.Driver

class Dispatcher(){

    fun CountFlight(driver: Driver){

    }

    //метод для назначения рейса водителю
    fun AssignTrip(driver: Driver, car: Car){
        println("Диспетчер назначил водителю ${driver.name} рейс на автомобиле ${car.model} ${car.brand}")
    }

    //метод для отстранения водителя от работы
    fun SuspendDriver(driver: Driver){
        println("диспетчер отстранил водителя ${driver.name} от работы.")
    }
}
