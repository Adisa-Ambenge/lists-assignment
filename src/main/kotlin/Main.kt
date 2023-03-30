fun main() {
var friends = evenIndices(listOf("Angie","Jesse","Emmy","Nathan","Kalange","Ambenge"))
    println(friends)
    var values = heightsInMetres(listOf(57,60,55,84,72,59))
    println(values)
    sortedPeople()
    twoPeople(listOf())
    val security = Person("Njuguna",29,6.7,65.3)
    val cheff = Person("Anita",30,5.7,60.2)
    var twoPeople = mutableListOf<Person>(security,cheff)
    println(twoPeople)
    var car1 = Vehicles("KBZ514K",78)
    var car2 = Vehicles("KBU233T",80)
    var car3 = Vehicles("KCT453L",50)
    var car4= Vehicles("KDD673V",89)
    var Vehicles= listOf(car1,car2,car3,car4)
    println(vehicleList(Vehicles))
}
//QUESTION 1
fun evenIndices(names:List<String>):List<String>{
    var evenIndice= mutableListOf<String>()
    names.forEachIndexed { index, e ->
        if (index % 2 == 0)
            evenIndice.add(e)
    }
    return evenIndice

}
//QUESTION 2
fun heightsInMetres(height:List<Int>):String{
    var avg = height.average()
    var total = height.sum()
    var stmt = "Average height is $avg metres and the sum is $total metres"
    return stmt
}
//QUESTION 3
data class Person(val name:String,val age:Int,val height:Double,val weight:Double)
fun sortedPeople(){
    val student = Person("Angela",24,6.3,59.5)
    val trainer = Person("Joy",35,6.5,56.2)
    val staff = Person("Ann",40,6.2,60.2)
    val director = Person("Linda",32,6.5,54.5)
    val persons= listOf<Person>(student,trainer,staff,director)
val sorted = persons.sortedByDescending{Person->Person.age}
    println(sorted)
}
//QUESTION 4
fun twoPeople(twopple:List<Person>):List<Any>{
    return listOf()
}
//QUESTION 5
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var average=0
    vehicle.forEach { new->new.mileage
        average+=new.mileage
    }
    var totalAverage=average/vehicle.count()
    return totalAverage
}

