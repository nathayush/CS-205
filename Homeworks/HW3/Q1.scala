object Q1{
    
    class Queue() {

        var lst: List[Any] = Nil

        def enqueue(x: Any): Unit = {
            this.lst = this.lst:::List(x) // concatenates the class list and the element to be added
        }

        def dequeue(): Unit = {
            this.lst match {
                case Nil => this.lst = Nil // empty list, nothing to remove
                case head::tail => this.lst = tail // drops the fist element
            }
        }

        def equals(that: Queue): Boolean = {
            (this.lst, that.lst) match {
                case (Nil, Nil) => true // both are empty lists
                case (head1::tail1, head2::tail2) => (head1.equals(head2)) && (tail1.equals(tail2)) // head1 and head2 should be equal, tail1 and tail2 should be equal
                case _ => false // anything other than that is false
            }
        }

        override def hashCode(): Int = {
            var count: Int = 0
            this.lst.foreach{
                count = count + _.hashCode() // sums the hashcodes for all elements in the queue
            }
            return count
        }
    }
}