class Pro{
	
	protected var x:Int=15

	def Display(): Unit=
	{
	  var x: Int=10
	  println(x)

	}

}
class second extends Pro
{
	  def Display1(): Unit=
	  {
	  	var x:Int=9
	  	println(x)
	  }
}
	object ModifyPro{

	def main(args:Array[String]): Unit=
	{
       var obj= new Pri()
       obj.Display()
       var obj1= new second()
       obj1.Display1

	}
	}
