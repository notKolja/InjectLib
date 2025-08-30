package gg.kpjm.injectLib.injections

import java.text.NumberFormat
import java.util.Locale

class DoubleInjections {

    companion object {

        /**
         * Formats this double using the German locale and replaces the default euro
         * symbol with the provided one.
         *
         * @param c Currency symbol to substitute for the euro sign.
         * @return Formatted currency string.
         */
        fun Double.formatCurrency(c: Char): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY)
            return formatter.format(this).replace('€', c).trim()
        }

        /**
         * Formats this double using the given locale's currency settings.
         *
         * @param locale Locale whose currency format should be applied.
         * @return Formatted currency string.
         */
        fun Double.formatCurrency(locale: Locale): String {
            val formatter = NumberFormat.getCurrencyInstance(locale)
            return formatter.format(this).trim()
        }

        /**
         * Formats this double using the German locale with the euro symbol.
         *
         * @return Formatted currency string including the euro sign.
         */
        fun Double.formatEuro(): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY)
            return formatter.format(this).trim()
        }

        /**
         * Formats this double using the German locale and removes the currency
         * symbol from the result.
         *
         * @return Formatted currency string without any currency symbol.
         */
        fun Double.formatEuroWithoutSymbol(): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale.GERMANY)
            return formatter.format(this).replace("€", "").trim()
        }
    }

}
