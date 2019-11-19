object Matching {
   def main(args: Array[String]): Unit={
      val name = new Person("Alice", 25)
      val name1 = new Person("Bob", 32)
      //val name2 = new Person("Charlie", 32)
   
      for (person <- List(name,name1)) {
         person match {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) => println(
               "Age: " + age + " year, name: " + name + "?")
         }
      }
   }
   case class Person(name: String, age: Int)
}