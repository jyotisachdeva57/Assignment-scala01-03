package knoldus

object MenuLauncher {

  def main(args: Array[String]): Unit = {
    val obj = new Operation
    val lvalue1 = 10
    val lvalue2 = 20
    val lvalue3 = 70
    val lvalue4 = 50
    val list1 = List(lvalue1, lvalue2, lvalue3, lvalue4)
    val l1value1 = 20
    val l1value2 = 30
    val l1value3 = 40
    val l1value4 = 50
    val list2 = List(l1value1, l1value2, l1value3, l1value4)
    val element = 3
    print("original list1 is ")
    print(list1)
    print("\n")
    print("original list2 is ")
    print(list1)
    print("\n")
    print("reverse list is ")
    print(obj.reverseList(list1))
    print("\n")
    print("After multiplying by 2 list is ")
    print(obj.listDouble(list1))
    print("\n")
    print("length of list is  ")
    print(obj.listLength(list1))
    print("\n")
    print("third element of list1 is ")
    print(obj.kthElement(element, list1))
    print("\n")
    print("area Of rectangle and parallelogram using higher order function is ")
    print(obj.area("rectangle", lvalue1, lvalue2, (a, b) => a * b))
    print("\n")
    print("area of rhombus using higher order function ")
    print(obj.area("rectangle", lvalue1, lvalue2, (a, b) => a * b))
    print("\nafter adding two lists result is ")
    print(obj.listsAdd(list1, list2))

  }


}
