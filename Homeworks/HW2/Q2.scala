object Q2{
	
    def main(args: Array[String]){
        def Split(lst: List[Int]): (List[Int], List[Int])= {	
		lst match{
			case Nil => (Nil, Nil) //null case
			case hd::tail if lst.length == 1 => (List(hd), Nil) 
			case hd::tail if lst.length > 1 => (hd::Split(tail.init)._1, Split(tail.init)._2:::List(lst.last)) //.1 and .2 take the first and second arguments, init takes the last
		      }
		}
}