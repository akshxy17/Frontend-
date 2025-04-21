//Array Destructring 

let arr = [1,2,3,4,5];

const [first, second] = arr;

console.log(first);

console.log(second);

//Spread and Rest with destructring

let person = {
    name : "akshay",
    age : 23,
    job : "SDE=1",
    package : "20LPA"
};

let updated = {...person, location : "Hyderabad" }  //Spread 

console.log(updated); 

//Rest

let [ java, ...restlang ] = ["Java", "C", "C++", "Python"];

console.log(java);


console.log(restlang);



