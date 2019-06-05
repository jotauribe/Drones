package domain

case class Position(x: Int, y: Int) {}


object Position {
  def apply(x: Int, y: Int): Position = Position(x, y)
}