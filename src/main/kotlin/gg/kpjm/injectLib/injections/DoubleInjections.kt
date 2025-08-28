package gg.kpjm.injectLib.injections

import java.text.NumberFormat
import java.util.Locale

class DoubleInjections {

    companion object {

        /**
         * Formats a Double to a Currency format with custom Currency sign
         * example: 10000,00 formats to 10.000,00€
         */

        fun Double.formatCurrency(c: Char): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY)
            return formatter.format(this).replace('€', c).trim()
        }

        /**
         * Formats a Double to a Currency format with Euro sign
         * example: 10000,00 formats to 10.000,00€
         */

        fun Double.formatEuro(): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY)
            return formatter.format(this).trim()
        }

        /**
         * Formats a Double to a Currency format without Euro sign
         * example: 10000,00 formats to 10.000,00
         */
        fun Double.formatEuroWithoutSymbol(): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY)
            return formatter.format(this).replace("€", "").trim()
        }
    }

}