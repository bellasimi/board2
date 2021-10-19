
let array =[];
for(let i=0; i <1000000;i++) {
array.push({id:i,name:'회원 ${i}'});
}

console.time("time-array");
const target = array.find(value => value.id ===200000);
console.timeEnd("time-array");


let object = {};

for(let i =0; i<1000000;i++) {
object[i] = {
id:i, name:'회원${i}'
};
}

console.time('time-object');
const target2= object["200000"];
console.timeEnd('time-object');