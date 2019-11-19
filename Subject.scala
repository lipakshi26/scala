trait name{
	def computers():Unit
	def mathematics():Unit
	def science:Unit={
	println("Bsc,Btech,Mtech,Msc")
	}
}
class Myclass extends name{
	def computers:Unit={
	println("Bca,Mca,Computer science")
	}

	def mathematics:Unit={
	println("Trigno,Discrete")
	}

	def pyschology:Unit={
	println("Human health and social work, Education")
	} 
}
object Subject{
	def main(args:Array[String]):Unit={
	var obj= new Myclass();
	obj.computers
	obj.science
	obj.mathematics
	obj.pyschology
}
}
