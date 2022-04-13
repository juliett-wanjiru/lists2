fun main() {
evenNames(listOf("mart","marry","jane","june","kyle","jimmy","jill","jude","ken","maina"))
    var m = Person("julie",19,3.4,30)
    var n = Person("wanjii",43,2.4,27)
    var persona= mutableListOf(m,n)
    println(persona)
    var o = Person("ken",72,2.2,56)
    var p = Person("johny",56,3.9,20)
    var new = mutableListOf(o,p)
    println(new)
    var sortlist= new.sortedByDescending { people-> people.age }
    println(sortlist)
   var d=Car("toyota",56)
    var f=Car("audi",38)
    var words=listOf(d,f)
    println(words)


}
fun evenNames(names:List<String>):List<String> {
        var newList=mutableListOf<String>()
        names.forEachIndexed(){ index,evenNames ->
              if((index%2)==0) {
             newList.add(evenNames)

              }

        }


        return newList
}
fun peopleHeights(height:List<Double>):String {

 var addition = height.sum()
    var averageHeight = height.average()
    var both = "$addition, $averageHeight"
    return both



}
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)

data class Car(var registration: String, var mileage: Int)







