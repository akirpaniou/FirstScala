object Main extends App {
 io.StdIn.readInt
 def sum(n:Int):Int = {
     if(n<1)0
     else{
         val input = readInt
         input + sum(n-1)
     }
 }
 println(sum(3))
}