import java.util.Scanner;
object User{
	def main(args:Array[String]):Unit={
      println("Enter the number you want to check")
      //var a= scala.io.StdIn.readLine()
        val scanner= new Scanner(System.in)
        println("Enter your name: ")
        val a= scanner.nextLine()
      println("check the name "+a)
     
	}
}