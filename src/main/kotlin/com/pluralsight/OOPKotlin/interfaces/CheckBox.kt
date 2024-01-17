package module45

class CheckBox(override val numberOfClicks: Int) : Clickable {

    override fun click() {
        println("Checkbox has been clicked $numberOfClicks times")
    }
}