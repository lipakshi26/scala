class Cal{

	var breadth:Int=25;
	 var length:Int=50;

	 var area: Int= length+breadth
	 var per:Int= 2*(length+breadth)
     
     def Calculate(): Unit={
     
     	println("Perimeter"+per); println("Area"+ area)
     }
 }
object Clas{

	  	def main(args:Array[String]): Unit={
	  		
	  		var obj=new Cal();
	  		obj.Calculate();
	  	}
	  	   }
	  