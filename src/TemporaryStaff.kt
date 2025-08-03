class TemporaryStaff(name: String, id: Int, val contractDuration: Int) : Employee(name, id) {
    override fun displayInfo() {
        println("Temporary Staff - Name: $name, ID: $id, Contract Duration: $contractDuration months")
    }

    fun extendContract(months: Int) {
        println("Contract extended by $months months.")
    }
}
