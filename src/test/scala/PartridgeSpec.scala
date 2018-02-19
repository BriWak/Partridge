import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must {

    "return 'Lynn, I've pierced my foot on a spike!!' if list is empty" in {

      Partridge.part(Array("")) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }

    "return Mine's a Pint! if list contains Partridge" in {

      Partridge.part(Array("Partridge")) mustEqual "Mine's a Pint!"
    }

    "return Mine's a Pint!! if list contains Partridge and PearTree" in {

      Partridge.part(Array("Partridge","PearTree")) mustEqual "Mine's a Pint!!"
    }

    "return Mine's a Pint!!! if list contains Partridge, PearTree, Nomad, and another value" in {

      Partridge.part(Array("Partridge", "PearTree", "Nomad", "1")) mustEqual "Mine's a Pint!!!"
    }

  }

}
