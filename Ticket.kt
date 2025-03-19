package railway

//класс для создания билета по заявке
data class Ticket(
    val request: PassengerRequest, //Заявка пассажира на поездку
    val selectedTrain: BaseTrain //Выбранный поезд (базовый класс)
)