trait MyTrait 
{ 
      
    def greeting:Unit={}
  
    def tutorial:Unit={ 
        println("This is a tutorial" +  
                "of Traits in Scala") 
    } 
} 

class MyClass extends MyTrait 
{ 
         def greeting() :Unit={ 
        println("Welcome to GeeksfoGeeks") 
    } 
}  
  
object Mainn 
{
    def main(args: Array[String])  
    { 
        val obj = new MyClass(); 
        obj.greeting 
        obj.tutorial 
    } 
} 