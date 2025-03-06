function firstName(name, cb1, cb2){
    console.log(name)
    cb1('Singh') 
    cb2('19') //Call
}

function lastName(lastName){
    console.log(lastName)
}

function printAge(age){
    console.log(age)
}



firstName('Tanishq' , lastName , printAge);

