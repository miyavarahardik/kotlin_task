fun main(){
     println("Enter a number of table : ")
     var number = readLine()!!.toInt()
     table(number)

}

fun table(num:Int){
     for(i in 1..10){
          println("$num x $i = ${num*i}")

     }
}