package module45

class Button(override val numberOfClicks: Int) : Clickable {
    override fun click() {
        println("Button has been clicked $numberOfClicks times")
    }
}