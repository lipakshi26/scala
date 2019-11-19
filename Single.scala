class ArraySingle{
	var arr = Array(1,2,3,4,5)
	def show():Unit={
	for(a<-arr)
	println(a)
    }
}
object Single{
	def main(args:Array[String]):Unit={
       var a= new ArraySingle()
       a.show()
	}
}