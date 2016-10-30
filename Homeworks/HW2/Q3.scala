object Q3{

    def main (args: Array[String]) : Unit = {
        
        def sortInsert(lst: List[Int], n: Int) : List[Int] = {
        lst match{
			case Nil => n::lst // only one element n
			case head::tail => if (head >= n) n::lst // if n is less than the first element, it goes in first place
				else head::sortInsert(tail, n) // else the same procedure is done with the rest of the list
			}
        }
    }
}
