object Fun{
	def main(args:Array[String]):Unit=
	{
	    var numbers:List[Int]= List(1,2,3,4,5)
	    var res = numbers.reduce((x, y) => x + y)
	    var rs = numbers.zipWithIndex
	    var r= numbers.filter(_< 3)
	    println("reduce function "+res)
	    println("zipwithindex function "+rs)
	    println("filter function "+r)
	}
}