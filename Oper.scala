object Oper{
	def main(args:Array[String]):Unit=
	{
	   var x: Int=15
	   var y: Int=20
	   var a=10
	   var b=25
	   //var a: Boolean=0
	   //var b: Boolean=00001101
	   //var and: Boolean= a&b
	   var sum: Int= x+y

	   println("Sum " +sum); println("sub " +(x-y)); println("divide " +(x/y)); println("modulus " +(x%y))
	   println("Equal  "+(a==b)); println("greater  "+(a>b)); println("smaller  "+(a< b));  println("smaller  "+(a<= b))
	   
	}

}