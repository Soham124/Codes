// // Map method

// let nums = [1 ,2 ,3,4,5]

// // Calculate the sqaures of each element 
// //and store it in a new array

// // use a function



// function sqaureArrFn(arr){
//     let sqauaredArr = []
    
//     for (let i=0 ; i<arr.length ; i++){
//         sqauaredArr.push(arr[i]*arr[i])
//     }
//     return sqauaredArr
// }

// let results = sqaureArrFn(nums)

// console.log(results)

// console.log(nums)


// Map method

let numbers = [1 ,4 ,7 ,5 ,4]

function calculateSqaure(num){
  return num*2
}

const resultsMap = numbers.map(calculateSqaure)

console.log(resultsMap)
console.log(numbers)

// Excercise 

// const transactions = [1000 , 2000 , 8000 , 4000]

// const inrToUsd = 83;

// function convert(transaction){
//     return transaction/inrToUsd
// }


// let convertedAmounts = transactions.map(convert)
// console.log(convertedAmounts)