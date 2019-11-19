//import Array_.
  //  object Hi{
	//def main(args:Array[String]):Unit={
	//var arr=Array("Hi","Hello","Hey")
	
	//for(a<-arr)
	//{
	  //println(a)
	  
	//}
	//var arr1=Array(1,2,3)
	//var arr2=Array(3,4,5)
	//println("Second element changed
      //var arr3= concat(arr1,arr2)
      //for(c<-arr2)
      //{
      	//println(c)
      //}

	
	//}
//import Array._
  
// Creating object 
object Hi 
{ 
      
    // Main method 
def main(args: Array[String]) 
{ 
    var arr1 = Array(1, 2, 3, 4) 
    var arr2 = Array(5, 6, 7, 8) 
  
    var arr3 = concat( arr1, arr2) 
      
    // Print all the array elements 
    for ( x <- arr3 )  
    { 
        println( x ) 
    } 
} 
} 