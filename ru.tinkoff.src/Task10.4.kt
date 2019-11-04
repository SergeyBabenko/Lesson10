fun main() {
    val animalsArrayList = arrayListOf("Крош", "Ежик", "Нюша", "Бараш")
    val animalsHashSet = hashSetOf("Крош", "Ежик", "Нюша", "Бараш")
    print("ArrayList: ")
    printCollectionByElement(animalsArrayList)
    print("\nHashSet: ")
    printCollectionByElement(animalsHashSet)
}

fun printCollectionByElement(collection: Collection<String>) {
    for (i in collection){
        print("$i ")
    }
}