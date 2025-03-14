package dispatcher

import models.Car
import models.Driver

class Dispetcher(){

    private var totalTripAssigned = 0

    //метод для вывода кол-ва назначеных рейсов
    fun CountFlight(){
        println("общее кол-во назначеных рейсов $totalTripAssigned.")
    }

    //метод для назначения рейса водителю
    fun AssignTrip(driver: Driver, car: Car) {
        if (driver.CheckingFlights()) {
            println("Диспетчер назначил водителю ${driver.name} рейс на автомобиле ${car.brand} ${car.model}.")
            totalTripAssigned++
        }
        else{
            println("у водителя ${driver.name} уже назначен рейс и в данный момент он не доступен.")
        }
    }

    //метод для отстранения водителя от работы
    fun SuspendDriver(driver: Driver){
        println("диспетчер отстранил водителя ${driver.name} от работы.")
    }
}
