/**
 * 
 */
console.log("basic.js");

let name = "김수호";
let address = '대구 100번지';
let age = 15;

//const myInfo = { name: name, address: address, age: age }
const myInfoAry = [name, address, age];
//createElement('span') => <span></span>
//innerText/innerHTML= 값
//부모 appendChild(자식) => <부모><자식/></부모>
function makeDom() {
	friends.forEach(function(myInfoAry) {
		// friend정보를 한건씩 반복
		for (let prop in myInfoAry) {
			console.log(prop + ',' + myInfoAry[prop]);
		}

	});
}



makeDom();
function makeDom() {
	//for ..in..
		for(let prop in myInfo){
			let span = document.createElement('span');
			span.innerHTML = myInfo[prop] + '  ';
			document.getElementById('show').appendChild(span);
		}
	
}

console.log(`이름은 ${name}이고 주소는 ${address} 입니다 ${age > 20 ? '성년' : '미성년'}입니다`);
console.log(typeof name);
console.log(typeof age);

const obj = {
	name: "홍길동",
	age: 20,
	myInfo: function() {
		return this.name + ',' + this.age;
	}
}
console.log(`이름은 ${obj.name}, 나이는 ${obj['age']}`);
console.log(obj.myInfo());

for (let prop in obj) {
	console.log(`속성은 ${prop}이고 값은 ${obj[prop]}`);
}

const ary = [1, 2, 3];
ary.push(4);
ary.unshift(5);
// 5,1,2,3,4
for (let num of ary) {
	console.log(`값은 ${num}입니다`)
}

ary.forEach(function(item, idx, ary) {
	if (item % 2 == 0) {
		console.log('hhhh' + ary);
	}
});
ary.forEach(function(item, idx, ary) {
	if (idx == 0 || idx == ary.length - 1) {
		console.log(item);
	}
});

const friends = [
	{ name: "롱길동", address: "대구 100번지", height: 165 },
	{ name: "길동롱", address: "대구 110번지", height: 165 },
	{ name: "동길롱", address: "대구 120번지", height: 165 }
]

