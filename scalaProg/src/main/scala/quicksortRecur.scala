object quicksort {
    def main(args:Array[String]) {
        val nums = List(1, 2, 3, 5, 4,8,6,0)
        println(nums)
        println(sort(nums))
    }

    def sort(a:List[Int]): List[Int] = {
        val len = a.length
        if(len < 2) a 
        else {
            val pivot = a(len/2)
            sort(a.filter(_ < pivot)):::
            a.filter(_==pivot):::
            sort(a.filter(_ > pivot))
        }
    }
}