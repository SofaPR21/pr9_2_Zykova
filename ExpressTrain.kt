package railway

//Класс представляющий экспресс-поезд
class ExpressTrain(
    override val trainNumber: String,
    override val departureTime: String,
    override val arrivalTime: String,
    override val stations: List<String>,
    override val price: Double,
    val speed: Double //свойство скорости экспресс-поезда
) : BaseTrain(trainNumber, departureTime, arrivalTime, stations, price) {
    override fun toString(): String {
        return "Экспресс-поезд $trainNumber (Скорость: $speed км/ч) - Цена: $price"
    }
}