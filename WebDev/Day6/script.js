let employees = [];
//let employeeid = [];

let _empid;
let _name;
let _city;
let empobj;

let count = document.querySelector("#empcount");
let alreadyexist = document.querySelector("#alreadyexist");

function addEmployee() {
    alreadyexist.textContent = "";

    _empid = parseFloat(document.getElementById("empid").value);
    _name = document.getElementById("empname").value;
    _city = document.getElementById("empcity").value;

    if (!_empid || !_name.trim() || !_city.trim()) {
        alreadyexist.textContent = "Please fill all the spaces correctly!";
        return;
    }

    // if (employeeid.includes(_empid)) {
    //     alreadyexist.textContent = "ID Already Exist !!!";
    //     return;
    // }

    if (employees.some((emp) => emp.empid === _empid)) {
        alreadyexist.textContent = "ID Already Exist !!!";
        return;
    }

    if (isNaN(_empid) || _empid <= 0) {
        alreadyexist.textContent = "Please enter a valid positive ID.";
        return;
    }

    //employeeid.push(_empid);
    employees.push({ _empid, _name, _city });

    //count.textContent = employeeid.length;
    count.textContent = employees.length;

    document.getElementById("empid").value = "";
    document.getElementById("empname").value = "";
    document.getElementById("empcity").value = "";

    //console.log(employeeid);
    console.log(employees);
}

function dispEmployee() {
    const table = document.getElementById("emptable");
    const tbody = table.querySelector("tbody");

    table.hidden = false;
    tbody.innerHTML = "";

    employees.forEach((item, index) => {
        const row = document.createElement("tr");

        const tdId = document.createElement("td");
        tdId.textContent = item._empid;
        row.appendChild(tdId);

        const tdName = document.createElement("td");
        tdName.textContent = item._name;
        row.appendChild(tdName);

        const tdCity = document.createElement("td");
        tdCity.textContent = item._city;
        row.appendChild(tdCity);

        const tdActions = document.createElement("td");
        const deleteBtn = document.createElement("button");

        deleteBtn.textContent = "Delete";

        deleteBtn.onclick = () => deleteRow(index);

        tdActions.appendChild(deleteBtn);
        row.appendChild(tdActions);

        tbody.appendChild(row);
    });
}

function deleteRow(index) {
    employees.splice(index, 1);
    // employeeid.splice(index, 1);
    dispEmployee();
    count.textContent = employees.length;
}
