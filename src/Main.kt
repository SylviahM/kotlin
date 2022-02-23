fun main(){
    var x=sum(67,35,90,70)
    println(x)

    var reminder=modulus(67,9)
    println(reminder)

    var name=("hello" + " "+"sylivia")
    println(name)


    println("i am interested in learning")




}










fun modulus(num1: Int, num2: Int):Int{
    var rem=num1%num2

    return(rem)
    }



fun sum(num1: Int, num2: Int,num3: Int,num4: Int):Int{
    var add=num1+num2+num3+num4
    return add
}







fun add(num1: Int ,num2: Int ,num3: Int ,num4: Int):Int{
    var sum=num1+num2+num3+num4
    return (sum)

}

fun name(name: String):String{
    var s=("Hello" + " " + name)
    return (s)

}


fun printlnfactaboutme(fact: String){
    print("i am interested" + " "+ fact)
}

















