package railway

//Класс для управления продажей билетов на поезда
class TrainTicketSystem {
    private val trains = mutableListOf<BaseTrain>()
    private val tickets = mutableListOf<Ticket>()

    fun addTrain(train: BaseTrain) {
        trains.add(train)
    }

    fun findTrain(request: PassengerRequest): List<BaseTrain> {
        return trains.filter { train ->
            train.stations.contains(request.destination)
        }
    }

    fun generateTicket(request: PassengerRequest, selectedTrain: BaseTrain): Ticket {
        val ticket = Ticket(request, selectedTrain)
        tickets.add(ticket) //Сохраняем билет в системе
        return ticket
    }

    //Метод для вывода информации о всех рейсах
    fun displayAllTrains() {
        println("Доступные рейсы:")
        for (train in trains) {
            train.displayInfo()
            println() // Пустая строка для разделения информации о поездах
        }
    }

    //Метод для отмены рейса
    fun cancelTicket(ticket: Ticket) {
        tickets.remove(ticket)
        println("Билет на поезд ${ticket.selectedTrain.trainNumber} отменен.")
    }

    //Метод для изменения рейса
    fun changeTicket(ticket: Ticket, newTrain: BaseTrain) {
        cancelTicket(ticket) //Сначала отменяем старый билет
        val newTicket = generateTicket(ticket.request, newTrain)
    //Генерируем новый билет
        println("Ваш билет на поезд ${newTicket.selectedTrain.trainNumber} успешно изменен.")
    }
}