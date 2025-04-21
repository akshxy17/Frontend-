function greet(name, fun){
    console.log('Hi' + name);
    fun();
}

let ask = () => setTimeout(() => {
    console.log("How are you?");
}, 1000);


greet('Akshay', ask);