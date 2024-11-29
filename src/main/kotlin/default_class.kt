package org.example


fun main() {

    val person1 = Person("Иван", 20, "Дизайнер")
    val person2 = Person("Андрей", 25, "Программист")
    val person3 = Person("Олег", 25, "Безработный")
    calculateSalaryByWork(person1.work)
    calculateSalaryByWork(person2.work)
}


class Person(val name: String, val age: Int, val work: String) {
    constructor(
        name: String
    ) : this(
        name = name,
        age = 0,
        work = "Бомж"
    ) {

    }

    fun calculateSalaryByWork(work: String) {
        when (work) {
            "Дизайнер" -> println("Зарплата для $work = 90.000 руб")
            "Программист" -> println("Зарплата для $work = 120.000 руб")
            "Безработный"  -> println("Зарплата для $work = 0 руб")
        }
    }
}


