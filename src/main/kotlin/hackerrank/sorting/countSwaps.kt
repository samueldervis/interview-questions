package hackerrank.sorting

/**
 * Count Swaps
 *
 *
 *
 * Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above.
 * Once sorted, print the following three lines:
 *
 * @param a The unsorted input array
 *
 * @return The number of swaps required to sort [a]
 *
 * @see <a href="https://www.hackerrank.com/challenges/ctci-bubble-sort/problem">Count Swap</a>
 */
fun countSwaps(a: IntArray): Int {
    val n = a.size
    var swapCount = 0
    for (i in 0 until n) {
        for (j in 0 until n - 1) {
            if (a[j] > a[j + 1]) {
                val temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
                swapCount++
            }
        }
    }
    return swapCount
}
