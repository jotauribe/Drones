package domain

case class Drone(position: Position, orientation: Orientation) {}

object Drone {
  def apply(x: Int, y: Int, o: Orientation): Drone =
    Drone(Position(x, y), o)

  def moveTo(): Drone = ???

  def rotateTo(): Drone = ???
}