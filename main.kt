import models.Car
import models.Driver
import dispatcher.Dispetcher

fun main(){

    //создаем автомобиль
    var car1 = Car("Porsche", "911 Carrers кабриолет")

    //создаем водителя
    var driver1 = Driver("Роман")

    //создаем график работы для водителя
    driver1.WorkingSchedule(0, "9.00 - 17.00")
    driver1.WorkingSchedule(1, "9.00 - 17.00")
    driver1.WorkingSchedule(2, "не работает")
    driver1.WorkingSchedule(3, "9.00 - 17.00")
    driver1.WorkingSchedule(4, "9.00 - 17.00")
    driver1.WorkingSchedule(5, "9.00 - 17.00")
    driver1.WorkingSchedule(6, "не работает")

    //выводи графика водителя
    driver1.InfoSchedule()

    //создаем диспетчера
    var dispatcher1 = Dispetcher()

    //назначаем рейсы водителю
    dispatcher1.AssignTrip(driver1, car1)
    //проверка метода на уже назначеный рейс
    dispatcher1.AssignTrip(driver1, car1)

    //отметка водителя о завершении рейса
    driver1.End_Trip(car1)

    //водитель подал заявку о ремонте автомобиля
    driver1.RequestRepair(car1)

    //диспетчер отстраняет водителя от работы
    dispatcher1.SuspendDriver(driver1)

    //общее кол-во назначеных рейсов
    dispatcher1.CountFlight()

}

