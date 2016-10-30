object Q3{
    
    var x: Int = 0
    var sum: Int = 0
    
    trait Runnable {
        def run(): Unit
    }
    
    class mythread(lst: List[Int]) extends Thread with Runnable {
        override def run(): Unit = {
            while(x != lst.length){
                sum = sum + lst(x)
                x = x + 1
            }
        }
    }
    
    def main(args: Array[String]): Unit = {
        
        val lst1 = (1 to 250000).toList
        val lst2 = (250001 to 500000).toList
        val lst3 = (500001 to 750000).toList
        val lst4 = (750001 to 1000000).toList
        
        val thread1 = new Thread(new mythread(lst1))
        val thread2 = new Thread(new mythread(lst2))
        val thread3 = new Thread(new mythread(lst3))
        val thread4 = new Thread(new mythread(lst4))
        
        thread1.start
        thread2.start
        thread3.start
        thread4.start
        
        Console.println(sum)
    }
}
