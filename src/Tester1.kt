import java.io.IOException

object Tester1 {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val y = StringBuilder("for:   ")
        val z = StringBuilder("while: ")
        val y1 = StringBuilder("enhancedFor:   ")
        val x = "0".repeat(200000)
        val x1 = arrayOfNulls<String>(1)
        x1[0] = x
        val l = StringBuilder()
        val q = System.nanoTime() //start time of entire calculation program
        var g: Double
        g = 0.0
        while (g < 1000000) {
            l.append(g * (.00001 / 8)) //to "warm up" the JVM
            g++
        }
        g = 0.0
        while (g < 5000) {
            val a = System.nanoTime()
            for (i in 0 until x.length) {
                if (i % 121 == 0.0 && x[i] == '0') print("") //so it doesn't flood the console
            }
            val b = System.nanoTime()
            y.append((b - a) / 1000).append(" us, ")
            g++
        }
        println() //seperate between loop results
        g = 0.0
        while (g < 5000) {
            val len = x.toCharArray()
            val j = System.nanoTime()
            for (c in len) {
                if (c.toInt() % 121 == 0 && x[c.toInt()] == '0') print("")
            }
            val k = System.nanoTime()
            y1.append((k - j) / 1000).append(" us, ")
            g++
        }
        println()
        g = 0.0
        while (g < 5000) {
            var e = 0.0
            val d = System.nanoTime()
            while (e < x.length) {
                if (e.toString().toDouble() % 121 == 0.0 && e.toString().toDouble() / 1000000 > 1) print(e.toString().toDouble() / 1000000)
                e++
            }
            val f = System.nanoTime()
            z.append((f - d) / 1000).append(" us, ")
            g++
        }
        val v = System.nanoTime() //end time of entire calculation program
        println()
        println(y.toString())
        println(y1.toString())
        println(z.toString())
        println((v - q) / (1000 * 1000 * 1000).toString() + " s")
    }
}