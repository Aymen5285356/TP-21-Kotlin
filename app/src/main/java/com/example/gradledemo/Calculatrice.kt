package com.example.gradledemo

/**
 * Effectue des opérations mathématiques.
 */
class Calculatrice {

    /**
     * Divise a par b.
     *
     * @param a le dividende.
     * @param b le diviseur.
     * @return le résultat sous forme de Double.
     * @throws IllegalArgumentException si b est égal à zéro.
     *
     * Voir aussi la classe [Animal].
     */
    fun diviser(a: Int, b: Int): Double {
        require(b != 0) { "Le diviseur ne peut pas être zéro." }
        return a.toDouble() / b
    }
}