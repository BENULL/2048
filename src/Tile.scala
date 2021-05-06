case class Tile(var value: Int){

  private var merged = false

  def setMerged(): Unit = merged = false

  def mergeWith(other: Tile): Int = canMergeWith(other) match {
    case true => {
      merged = true
      value *= 2
      value
    }
    case _ => -1
  }

  def canMergeWith(other: Tile): Boolean = !merged && Option(other).isDefined && !other.merged && value == other.value

}