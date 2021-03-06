package hackerrank

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Computes the division and return a [BigDecimal] with the provided scale
 *
 * @param divisor the divisor
 * @param scale Scale of the [BigDecimal] quotient to be returned default is 6
 * @return the [BigDecimal] value of the division result
 *
 * @receiver Int
 */
private fun Int.divideAndKeepPrecision(divisor: Int, scale: Int = 6): BigDecimal =
    this.toBigDecimal().divide(divisor.toBigDecimal(), scale, RoundingMode.HALF_UP)

/**
 * Plus Minus
 *
 * Returns the ratio of positive values, to zero values, to negative value to 6 decimal places.
 * Makes use of [divideAndKeepPrecision] to perform division
 *
 * @param arr the input array
 *
 * @return the ratio of positive values to zero to negative values
 */
fun plusMinus(arr: IntArray): Array<String> {
    var positives = 0
    var zeros = 0
    var negatives = 0
    for (item in arr) {
        when {
            item > 0 -> positives++
            item == 0 -> zeros++
            else -> negatives++
        }
    }
    val pRatio = positives.divideAndKeepPrecision(arr.size)
    val nRatio = negatives.divideAndKeepPrecision(arr.size)
    val zRatio = zeros.divideAndKeepPrecision(arr.size)
    return arrayOf(pRatio.toString(), nRatio.toString(), zRatio.toString())
}

fun main() {
    println(plusMinus(intArrayOf(-4, 3, -9, 0, 4, 1)).contentToString())
}
