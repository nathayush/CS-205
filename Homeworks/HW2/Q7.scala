object Q7{

    def main (args: Array[String]) : Unit = {
    
        def fastPower(x: Int, n: Int) : Long = {
        n match {
            case 0 => 1 // x^0 = 1
            case 1 => x // x^1 = x
            case even if n % 2 == 0 => fastPower(x,n/2) * fastPower(x,n/2) // 2^8 = 2^4 * 2^4
            case odd if n % 2 == 1 => x * fastPower(x,n/2) * fastPower(x,n/2) // 2^9 = 2 * 2^4 * 2^4
            }
        }
    }
}
