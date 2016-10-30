object Q5{

    def main (args: Array[String]) : Unit = {
        def pivotSort(lst: List[Int], n: Int) : List[Int] = {
        lst match {
				case Nil => n::lst // only one element n
				case head::tail => if(head <= n) head::pivotSort(tail, n) // for descending order, pivotSort is done with the "greater" list
					else pivotSort(tail, n) ::: List(head)
            }
        }
    }
}
