fun main() {
    val animalsList = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val animalsSet = setOf("Крош", "Ежик", "Нюша", "Бараш")
    print("List: ")
    printCollectionByElement(animalsList)
    print("\nSet: ")
    printCollectionByElement(animalsSet)
}

fun printCollectionByElement(collection: Collection<String>) {
    for (i in collection){
        print("$i ")
    }
}