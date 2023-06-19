import scala.io.StdIn.readLine
object Q4 extends App(){
  def cost(x:Double) = if(x<50) {((x*3)+(24.95*x))} else {(((x-50)*0.75)+(50*3)+(24.95*0.6*x))}
  print(cost(60))
}
