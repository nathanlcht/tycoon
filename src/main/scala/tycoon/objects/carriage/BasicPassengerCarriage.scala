package tycoon.objects.carriage

import tycoon.ui.Tile

class BasicPassengerCarriage extends PassengerCarriage {
  val cost = 20
  val ticket_price = 3
  val weight = 100
  val max_passengers = 10
  var passengers = 0
  val tile = new Tile(Tile.locomotive)
}
