fun conditional(){

    var age=30

    when (age){
        1->print("Age is 1")
        30->print("Age is 30")
        else->print("Age not defined")
    }

    when (age){
        in 10..20 ->print("Teenager")
        in 21..50 ->print("Adult")
        else->print("Old")
    }
}