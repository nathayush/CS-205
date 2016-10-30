object Q1{

    def main (args: Array[String]) : Unit = {
    
        def fact(n: Int) : Int = {
        n match {
            case 0 => 1 //factorial of 0 is 1
            case n => n * fact(n-1) // factorial of any other integer is the product of the interger itself and the factorial of its predecessor
            }
        }
    }
}
