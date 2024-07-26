/**
 *json2.js 
 */

document.querySelector('div.container-fluid>div:nth-of-type(2)').remove();
document.querySelector('div.container-fluid>table').remove();

let json = `[{"id":1,"first_name":"Jannel","last_name":"Pieroni","email":"jpieroni0@friendfeed.com","gender":"Genderqueer","salary":1945},
{"id":2,"first_name":"Alistair","last_name":"Sorton","email":"asorton1@networkadvertising.org","gender":"Male","salary":6026},
{"id":3,"first_name":"Odey","last_name":"Clyne","email":"oclyne2@amazon.de","gender":"Polygender","salary":5199},
{"id":4,"first_name":"Craig","last_name":"Merrin","email":"cmerrin3@istockphoto.com","gender":"Male","salary":9621},
{"id":5,"first_name":"Ripley","last_name":"Annear","email":"rannear4@quantcast.com","gender":"Agender","salary":9888},
{"id":6,"first_name":"Libbey","last_name":"Thirkettle","email":"lthirkettle5@who.int","gender":"Female","salary":2595},
{"id":7,"first_name":"Brocky","last_name":"Edwicke","email":"bedwicke6@arizona.edu","gender":"Male","salary":2419},
{"id":8,"first_name":"Corrina","last_name":"Sainter","email":"csainter7@guardian.co.uk","gender":"Female","salary":9285},
{"id":9,"first_name":"Merrile","last_name":"Pettie","email":"mpettie8@infoseek.co.jp","gender":"Female","salary":5979},
{"id":10,"first_name":"Deva","last_name":"Cafe","email":"dcafe9@un.org","gender":"Female","salary":7568},
{"id":11,"first_name":"Vidovik","last_name":"Burnitt","email":"vburnitta@wix.com","gender":"Male","salary":2396},
{"id":12,"first_name":"Jack","last_name":"Bennion","email":"jbennionb@xinhuanet.com","gender":"Male","salary":8875},
{"id":13,"first_name":"Logan","last_name":"Perrett","email":"lperrettc@people.com.cn","gender":"Male","salary":6799},
{"id":14,"first_name":"Darice","last_name":"Presdee","email":"dpresdeed@github.io","gender":"Female","salary":1758},
{"id":15,"first_name":"Malachi","last_name":"Pimlott","email":"mpimlotte@is.gd","gender":"Male","salary":9826},
{"id":16,"first_name":"Glen","last_name":"Gilli","email":"ggillif@nba.com","gender":"Female","salary":5041},
{"id":17,"first_name":"Agustin","last_name":"Zanetello","email":"azanetellog@symantec.com","gender":"Male","salary":5763},
{"id":18,"first_name":"Roberto","last_name":"Brashier","email":"rbrashierh@opensource.org","gender":"Male","salary":1440},
{"id":19,"first_name":"Lauri","last_name":"Shoemark","email":"lshoemarki@fastcompany.com","gender":"Female","salary":9657},
{"id":20,"first_name":"Krystyna","last_name":"Sigmund","email":"ksigmundj@wix.com","gender":"Female","salary":8515}]`;

let employees = JSON.parse(json);
console.log(employees);

document.querySelector('#searchGender').addEventListener('change', function(e) {

})
initList();
function initList() {
	let traget = document.getElementById('empList');
	traget.innerHTML ='';
	let selValue = document.querySelector('#searchGender').value
	employees.forEach(emp => {
		if (selValue == 'All' || emp.gender == selValue) {
			traget.appendChild(makeRow(emp));
		}
	});
}

initList();

//createElement ('tr')<<tr생성하기
//사원정보 => 
function makeRow(emp = {}) {
	let fields = ['id', 'first_name', 'last_name', 'salary'];
	let tr = document.createElement('tr');
	fields.forEach(field => {
		let td = document.createElement('td');
		td.innerHTML = emp[field];
		tr.appendChild(td);

	})
	return tr;

}