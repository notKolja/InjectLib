package gg.kpjm.injectLib.injections

class IntegerInjections {

    companion object {
        private val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")

        fun Int.translateRoman(): String {
            if (this == 0) return ""
            return if (this in 1..10) romanNumerals[this] else this.toString()
        }
    }

}