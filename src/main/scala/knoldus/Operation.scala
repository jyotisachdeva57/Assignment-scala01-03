package knoldus

class Operation {

  def listDouble(list: List[Int]): List[Int] = {
    list.map(x => x * 2)
  }

  def fibonacci(number: Int): Int = {
    def fibTailRecur(num: Int, first: Int, second: Int): Int = num match {
      case 0 => first
      case _ => fibTailRecur(num - 1, second, first + second)
    }

    fibTailRecur(number, 0, 1)
  }

  def reverseList(list: List[Int]): List[Int] = {
    def reverseInternal(res: List[Int], list: List[Int]): List[Int] = {
      list match {
        case Nil => res
        case (head :: tail) => {
          reverseInternal(head :: res, tail)
        }
      }
    }

    reverseInternal(Nil, list)
  }

  def listLength(list: List[Int]): Int = {

    def listInternal(list: List[Int]): Int = {
      list match {
        case Nil => 0
        case head :: tail => 1 + listLength(tail)
      }
    }

    listInternal(list)
  }
 def kthElement(element: Int, list: List[Int]): Int = {
      list match {
        case head if(element==0)=> list.head
        case head ::tail => kthElement(element - 1, tail)
        case _ => throw new NoSuchElementException
      }
  }
 

  def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {
    val shapenew = shape.toLowerCase
    shapenew match {
      case "rectangle" | "parallelogram" => s"area of $shape is ${f(first, second)}"
      case "rhombus" => s"area of $shape is  ${f(first, second) / 2}"

    }
  }


  def listsAdd(list1: List[Int], list2: List[Int]): List[Int] = {
    val lengthl1 = list1.length
    val lengthl2 = list2.length
    if (list1.isEmpty) {
      list2
    }
    else if (list2.isEmpty) {
      list1
    }
    else if (lengthl1 == lengthl2) {
      for ((x, y) <- list1 zip list2) yield (x + y)
    }
    else {
      list1.zipAll(list2, 0, 0).map { case (a, b) => a + b }
    }
  }
}
