package railway

//класс на запрос пассажира
data class PassengerRequest(
    val destination: String, //Конечная станция
    val travelDate: String, //Дата поездки
    val travelTime: String //Время поездки
)