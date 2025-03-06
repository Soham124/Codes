let arrRadius = [1, 2, 3, 4, 6, 8]

function area(radiuses) {
    let areaArr = []
    for (i=0; i<radiuses.length; i++) {
        areaArr.push(3.14 * radiuses[i] * radiuses[i])
    }
    return areaArr
}

function diameter(radiuses) {
    let diameterArr = []
    for (i=0; i<radiuses.length; i++) {
        diameterArr.push(2 * radiuses[i])
    }
    return diameterArr
}
 
function circumference(radiuses) {
    let circumferenceArr = []
    for (i=0; i<radiuses.length; i++) {
        circumferenceArr.push(2 * 3.14 * radiuses[i])
    }
    return circumferenceArr
}

console.log(area(arrRadius))
console.log(diameter(arrRadius))
console.log(circumference(arrRadius))