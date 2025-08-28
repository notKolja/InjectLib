package gg.kpjm.injectLib.injections

class IntegerInjections {

    companion object {
        private val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")

        fun Integer.translateRoman(i: Int): String {
            if (i == 0) return ""
            return if (i in 1..10) romanNumerals[i] else i.toString()
        }
    }

}