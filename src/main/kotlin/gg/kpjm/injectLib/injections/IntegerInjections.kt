package gg.kpjm.injectLib.injections

class IntegerInjections {

    companion object {
        private val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")

        /**
         * Converts this integer to a Roman numeral if it is between 1 and 10.
         * Returns an empty string for zero and the decimal representation for
         * values outside the supported range.
         */
        fun Int.translateRoman(): String {
            if (this == 0) return ""
            return if (this in 1..10) romanNumerals[this] else this.toString()
        }
    }

}
