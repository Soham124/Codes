// console.log("Soham")
// let name = "Soham"
// name = 12
// name = "John"
// console.log(name)

// let myObj = {
//     name : "prakash",
//     age : 18
// }
// console.log(myObj)

//Objects:

//Functions:
function loginUserMessage(username) {
  if (!username) {
    console.log("please enter a username");
    return;
  }
  return username + " just logged in"
}
console.log(loginUserMessage("Soham"));
