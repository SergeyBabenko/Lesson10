fun main() {
    val animalsList = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val animalsSet = setOf("Крош", "Ежик", "Нюша", "Бараш")
    val copiedAnimalsArrayList = ArrayList<String>()
    val copiedAnimalsHashSet = HashSet<String>()
    for (i in animalsList) {
        copiedAnimalsArrayList.add(i)
    }
    for (i in animalsSet) {
        copiedAnimalsHashSet.add(i)
    }
    print("New ArrayList: ")
    printCollectionByElement(copiedAnimalsArrayList)
    print("\nNew HashSet: ")
    printCollectionByElement(copiedAnimalsHashSet)
}

fun printCollectionByElement(collection: Collection<String>) {
    for (i in collection) {
        print("$i ")
    }
}