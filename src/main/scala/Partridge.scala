object Partridge {

  val terms = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
  val foundSome = "Mine's a Pint"
  val foundNone = "Lynn, I've pierced my foot on a spike!!"

  def part(args : Array[String]): String = {
    args.count(term => terms.contains(term)) match {
      case 0 => foundNone
      case x => foundSome + "!" * x

    }
  }



}

