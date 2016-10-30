object Q2{

    def main(args: Array[String]): Unit = {
        
        def split(lst: List[Int]): (List[Int], List[Int]) = {
            var lst1: List[Int] = Nil
            var lst2: List[Int] = Nil
            var lst3: List[Int] = lst // copying the input list for usage

            while (lst3 != Nil) {
                lst1 = lst1:+(lst3.head) // adds the first element of the original list to lst1
                lst3 = lst3.tail // removes the first element from the original list

                if (lst3 != Nil) {
                    lst2 = lst3.last::lst2 // adds the last element of the original list to lst2
                    lst3 = lst3.init // removes the last element from the original list
                }
            } // the list keeps getting smaller and smaller from both the ends, the while loop ends when the list becomes nil. so, lst1 has the first half of the original list and lst2 has the second half
            return (lst1, lst2)
        }
        Console.println(split(List(1,2,3,4,5)))
    }
}
