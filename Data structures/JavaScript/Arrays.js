let numbers = [1,2,3,4,5,6,7,8,9,10]
let sum = 0;
for(let  i = 0; i < numbers.length; i++){
    sum += numbers[i];
}
console.log(sum)

let sentence = "The quick brown fox";
let arr = sentence.split(" ");
for (let i = 0; i < arr.length; i++){
    console.log("word " + i + ":" + arr[i]);
}

let nums = [1,2,3,3];
for (let i = 0; i < nums.length; i++){
    nums[i] *= 2;
}

// Shallow copy
let copied = nums;
nums[3] = 8;
console.log(nums);
console.log(copied);
console.log(Array.isArray(copied));

// deep copy
function deepCopy(arr1, arr2) {
    for (let i = 0; i < arr1.length; i++){
        arr2[i] = arr1[i];
    }
}

let index = [];
for (let i = 0; i < 10; i++){
    index[i] = i+1;
}
let seasums = []
deepCopy(index, seasums);
index[0] = 90;
console.log(index);
console.log(seasums);



// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
//
// let names = ["Dele", "Victor", "kemi", "Babayaro"];
// readline.question("Enter a name: ", name => {
//     let pos = names.indexOf(name);
//
//     if (pos >= 0)
//         console.log(name + " found at position " + pos);
//     else
//         console.log(name + " not found");
//     readline.close();
// })

console.log(index.toString());
console.log(index.join());
