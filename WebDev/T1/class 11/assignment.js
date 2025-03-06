const input = prompt("");
let count = 0;

for(let i = 0; i<=input.length; i++){
    let D = input.toLowerCase;
    let X = D.slice(i,(i+1))
    if(D=='a'||D=='e'||D=='i'||D=='o'||D=='u'){
        count++;
    }
}

console.log(count)
