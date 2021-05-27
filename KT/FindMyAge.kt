import java.util.*

fun main(args: Array<String>) {
//------------ThisForCalculeUserAge------------//
    println("-------------------For calcule your age-------------------")

    //input
    print("Enter_Year_Of_Birth:")
    val yearOfAge:Int= readLine()!!.toInt()
    println("")
    print("Enter_Month_Of_Birth:")
    val monthOfAge:Int= readLine()!!.toInt()
    println("")
    print("Enter_Day_Of_Birth:")
    val dayOfAge:Int= readLine()!!.toInt()


    //process
    var year= Calendar.getInstance().get(Calendar.YEAR)
    var month= Calendar.getInstance().get(Calendar.MONTH) //xno lmoxkil
    var day= Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

    var ageY=year-yearOfAge
    var ageM= 12-monthOfAge+month
    var ageD= 31-day+dayOfAge
    if (ageM>12) {
        ageM= ageM-12
    }
    if ((month==1||month==3||month==5||month==7||month==9||month==11)&&(ageD>31)) {
        ageD= ageD-31
    }else if ((month==4||month==6||month==8||month==10||month==12)&&(ageD>30)) {
        ageD= ageD-30
    }else if(month==2 && ageD>28){
        ageD= ageD-29
    }

    //output
    println("your age is:  $ageY years old, and $ageM months, and $ageD days")
    println("thanks for use this app\n"+ "EndApp")
}
//???MafhemtWaalooooooooooo
//KighandirNhssab3mriiiii

//LKFIH-LANAFIH<12 == NATIJ-12 == LIBRGHIT

/*if (month<0){    }*/