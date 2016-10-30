object Q4{

    def main (args: Array[String]) : Unit = {
        
        def sortInsert(lst : List[Int], n : Int) : List[Int] = {
            lst match{
                case Nil => List(n)
                case head::tail =>
                    if (head >= n) n::lst
                    else head::sortInsert(tail, n) // from q3
            }
        }
        def InsertionSort(lst : List[Int]) : List[Int] = {
            lst match{
                case Nil => Nil
                case head::tail => sortInsert(InsertionSort(tail), head) // recursively takes the first element and runs sortInsert on it with the remaining list
            }
        }
    }
}
