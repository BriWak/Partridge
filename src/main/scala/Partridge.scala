object Partridge {


  val terms = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
  val some = "Mine's a Pint"
  val none = "Lynn, I've pierced my foot on a spike!!"

  def part(args : Array[String]): String = {
    args.count(term => terms.contains(term)) match {
      case 0 => none
      case x => some + "!" * x

    }
  }



}

