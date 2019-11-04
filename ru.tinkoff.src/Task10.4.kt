fun main() {
    val animalsArrayList = ArrayList<String>().apply {
        this.add("Крош")
        this.add("Ежик")
        this.add("Нюша")
        this.add("Бараш")
    }
    val animalsHashSet = HashSet<String>().apply {
        this.add("Крош")
        this.add("Ежик")
        this.add("Нюша")
        this.add("Бараш")
    }
    print("ArrayList: ")
    printCollectionByElement(animalsArrayList)
    print("\nHashSet: ")
    printCollectionByElement(animalsHashSet)
}

fun printCollectionByElement(collection: Collection<String>) {
    for (i in collection) {
        print("$i ")
    }
}