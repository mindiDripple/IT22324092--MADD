class PermanentStaff(name: String, id: Int, val benefits: String) : Employee(name, id) {
    override fun displayInfo() {
        println("Permanent Staff - Name: $name, ID: $id, Benefits: $benefits")
    }

    fun applyForLeave(days: Int) {
        println("Leave applied for $days days.")
    }
}

