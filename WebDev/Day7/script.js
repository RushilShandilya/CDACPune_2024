const text_div = document.querySelector('#result');

const table = document.createElement('table');

table.setAttribute('class', 'table');

const headrow = document.createElement('tr');

const userId = document.createElement('th');
const id = document.createElement('th');
const title = document.createElement('th');
const completed = document.createElement('th'); 

userId.textContent = 'userId';
id.textContent = 'id';
title.textContent = 'title';
completed.textContent = 'completed';

headrow.appendChild(userId);
headrow.appendChild(id);
headrow.appendChild(title);
headrow.appendChild(completed);

table.appendChild(headrow);



function loadDoc(){ 
   const xhhtp = new XMLHttpRequest();
   xhhtp.open('GET', 'https://jsonplaceholder.typicode.com/todos?_limit=25');

   xhhtp.onreadystatechange = function(){
        if(xhhtp.readyState == 4 && xhhtp.status == 200){
            const response = JSON.parse(xhhtp.responseText);
            response.forEach(item => {
                const row = document.createElement('tr');

                const userId = document.createElement('td');
                const tdId = document.createElement('td');
                const tdTitle = document.createElement('td');
                const tdCompleted = document.createElement('td');

                userId.textContent = item.userId;
                tdId.textContent = item.id;
                tdTitle.textContent = item.title;
                tdCompleted.textContent = item.completed;

                row.appendChild(userId);
                row.appendChild(tdId);
                row.appendChild(tdTitle);
                row.appendChild(tdCompleted);

                table.appendChild(row);
            });
            text_div.appendChild(table);
        }
   };
   xhhtp.send();
}


