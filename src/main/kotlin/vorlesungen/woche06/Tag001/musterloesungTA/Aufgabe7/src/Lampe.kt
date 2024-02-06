class Lampe(
    var isOn: Boolean,
    var color: String,
    var location: String
) {
    fun switchOnOff() {
        isOn = !isOn
    }
}