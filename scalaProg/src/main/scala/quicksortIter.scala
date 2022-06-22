object quicksortIterative {
    def main(args: Array[String]) {
        var nums = Array(5,4,8,6,2)
        for(i <- 0 to nums.length - 1)
            print(nums(i) + " ")
        quicksort(nums, 0, nums.length-1)
        println()
        for(i <- 0 to nums.length - 1)
            print(nums(i) + " ")
    }

    def quicksort(arr: Array[Int], low: Int, high: Int) {
        if(low < high) {
            val j = partition(arr, low, high)
            quicksort(arr,low,j-1)
            quicksort(arr, j+1, high)
        }
    }

    def partition(sub:Array[Int], low: Int, high: Int): Int = {
        val pivot = high 
        var i = low
        for(j <- low to high) {
            if(sub(j) < sub(pivot)) {
                swap(sub, i,j)
                i += 1
            }
        }
        swap(sub,i,pivot)
        i
    }

    def swap(sub:Array[Int], a:Int, b :Int) {
        val temp = sub(a)
        sub(a) = sub(b)
        sub(b) = temp
    }
}