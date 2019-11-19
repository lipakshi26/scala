object Sett {
   def main(args: Array[String]) :Unit={
      val fruit = Set("apples", "oranges", "pears")
      val nums: Set[Int] = Set(10,20,30,40)

      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
   }
}