package railway

fun main() {
    //Создаем объект системы продажи билетов
    val trainSystem = TrainTicketSystem()

    //Добавляем некоторые поезда с информацией о времени отправления и прибытия
    trainSystem.addTrain(ExpressTrain("100A", "10:00", "12:00", listOf("Москва", "Санкт-Петербург"), 1500.0, 120.0))
    trainSystem.addTrain(RegularTrain("150B", "10:30", "13:30", listOf("Москва", "Казань"), 2000.0, 5))
    trainSystem.addTrain(RegularTrain("200C", "11:00", "14:00", listOf("Санкт-Петербург", "Казань"), 1800.0, 8))

    //Выводим информацию о доступных поездах
    trainSystem.displayAllTrains()

    //Пассажир делает заявку на поездку
    val passengerRequest = PassengerRequest("Санкт-Петербург", "2023-10-15", "10:00")

    //Ищем подходящие поезда на основе заявки
    val availableTrains = trainSystem.findTrain(passengerRequest)
    if (availableTrains.isNotEmpty()) {
        println("Доступные поезда:")
        //Выводим информацию о доступных поездах
        for (train in availableTrains) {
            train.displayInfo()
        }

        //Пассажир выбирает первый доступный поезд
        val selectedTrain = availableTrains[0]
        //Создаем билет на основе заявки и выбранного поезда
        val ticket = trainSystem.generateTicket(passengerRequest, selectedTrain)
        // Выводим информацию о билете
        println("Ваш билет на поезд ${ticket.selectedTrain.trainNumber} успешно приобретен.")

        //изменение билета
        println("\nХотите изменить ваш билет? (1 - Да, 2 - Нет)")
        val choice = readLine()
        if (choice == "1") {
            println("\nВыберите новый поезд:")
            trainSystem.displayAllTrains() // Отображаем все поезда
            println("Введите номер нового поезда:")
            val newTrainNumber = readLine()

            //Находим новый поезд по номеру
            val newTrain = availableTrains.firstOrNull { it.trainNumber == newTrainNumber }
            if (newTrain != null) {
                trainSystem.changeTicket(ticket, newTrain) //Изменяем билет
            } else {
                println("Поезд с номером $newTrainNumber не найден.")
            }
        }

        //отмена билета
        println("\nХотите отменить ваш билет? (1 - Да, 2 - Нет)")
        val cancelChoice = readLine()
        if (cancelChoice == "1") {
            trainSystem.cancelTicket(ticket) // Отмена билета
        }
    } else {
        //Если поезда не найдены, выводим соответствующее сообщение
        println("К сожалению, поезда по вашему запросу не найдены.")
    }
}