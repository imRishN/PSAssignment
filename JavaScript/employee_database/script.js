function getDatabase() {
    var checkBox = document.getElementById("checkbox");
    var name = document.getElementById("showName");
    if (checkBox.checked == true){
      name.style.display = "block";
      name.focus();
    } else {
       name.style.display = "none";
    }
  }

  function getEmployeeData(){
    var checkBox = document.getElementById("checkbox");
    var name;
    if (checkBox.checked == true){
        name = document.getElementById("showName").value;
        getInfoByName(name);
      } else {
          getAllInfo();
      }
  }

  var Employees = [
    {
        "Id": "1",
        "Name": "Rishab",
        "City": "KGP"
    },
    {
        "Id": "2",
        "Name": "Shreyansh",
        "City": "KGP"
    },
    {
        "Id": "3",
        "Name": "Gaurav",
        "City": "KGP"
    },
    {
        "Id": "4",
        "Name": "Garvit",
        "City": "KGP"
    },
    {
        "Id": "5",
        "Name": "Vaibhav",
        "City": "KGP"
    }
]

function getAllInfo(){
    var col = [];
    for (var i = 0; i<Employees.length; i++) {
        for (var colHead in Employees[i]) {
            if (col.indexOf(colHead) === -1) {
                col.push(colHead);
            }
        }
    }
    var table = document.createElement("table");  
    var tr = table.insertRow(-1);                 

    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");      
        th.innerHTML = col[i];
        tr.appendChild(th);
    }

    for (var i = 0; i < Employees.length; i++) {
        tr = table.insertRow(-1);
        for (var j = 0; j < col.length; j++) {    
            var tabCell = tr.insertCell(-1);   
            tabCell.innerHTML = Employees[i][col[j]];
        }
    }

    var tableContainer = document.getElementById("showData");  
    table.className="table table-bordered table-striped";
    table.style.textAlign="center";
    tableContainer.innerHTML = "";
    tableContainer.appendChild(table);
}


function getInfoByName(name){
    var col = [];
    for (var i = 0; i<Employees.length; i++) {
        for (var colHead in Employees[i]) {
            if (col.indexOf(colHead) === -1) {
                col.push(colHead);
            }
        }
    }
    var table = document.createElement("table");  
    var tr = table.insertRow(-1);                

    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");      
        th.innerHTML = col[i];
        tr.appendChild(th);
    }

    for (var i = 0; i < Employees.length; i++) {
        if(Employees[i][col[1]].localeCompare(name)==0){
            tr = table.insertRow(-1);

            for (var j = 0; j < col.length; j++) {      
                var tabCell = tr.insertCell(-1);   
                tabCell.innerHTML = Employees[i][col[j]];
            }
        }
    }

    var tableContainer = document.getElementById("showData");  
    table.className="table table-bordered table-striped";
    table.style.textAlign="center";
    tableContainer.innerHTML = "";
    
    if(table.rows.length>1){
        tableContainer.appendChild(table);
    }else{
        tableContainer.innerHTML = "No data available";
    }
}