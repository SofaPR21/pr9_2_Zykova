package railway

//Класс представляющий обычный поезд
class RegularTrain(
    override val trainNumber: String,
    override val departureTime: String,
    override val arrivalTime: String,
    override val stations: List<String>,
    override val price: Double,
    val stopsCount: Int //свойство количества остановок
) : BaseTrain(trainNumber, departureTime, arrivalTime, stations, price) {
    override fun toString(): String {
        return "Обычный поезд $trainNumber (Остановок: $stopsCount) - Цена: $price"
    }
}