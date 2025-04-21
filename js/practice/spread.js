// const arr = [1,2,3,4,5];

// let newArr = [...arr ];

// console.log(arr);
// console.log(newArr);

// let gangA = [1,2,3,];
// let gangB = [5,6,7,];

// const gangAB = [...gangA, ...gangB];

// console.log(gangAB);


// let info = { name:"Akshay", age : 25 };
//  let update = {...info, package : "12 LPA"}

//  console.log(update);

//To find max of array

let arr = [1,2,3,4,5];

console.log(Math.max(arr));     //It prints Nan because it takes array as argument

console.log(Math.max(...arr));     // it prints max value of array because it takes every element of arrray as input witj help of spread(...)

 
