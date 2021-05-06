case object State extends Enumeration {
  type State = Value
  val start, won, running, over = Value
}