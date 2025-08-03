//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val tempStaff = TemporaryStaff("Tom", 101, 6)
    tempStaff.displayInfo()
    tempStaff.extendContract(3)

    val permStaff = PermanentStaff("Jane", 202, "Health Insurance")
    permStaff.displayInfo()
    permStaff.applyForLeave(10)
}

