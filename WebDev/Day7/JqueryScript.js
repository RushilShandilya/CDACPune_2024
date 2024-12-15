const text_div = $('#result');

const table = $('<table>').addClass('table');

const headrow = $('<tr>');

const userId = $('<th>').text('userId');
const id = $('<th>').text('id');
const title = $('<th>').text('title');
const completed = $('<th>').text('completed');

headrow.append(userId, id, title, completed);
table.append(headrow);

function loadDoc() {
    $.ajax({
        url: 'https://jsonplaceholder.typicode.com/todos?_limit=25',
        method: 'GET',
        success: function(response) {
            response.forEach(item => {
                const row = $('<tr>');
                const userId = $('<td>').text(item.userId);
                const tdId = $('<td>').text(item.id);
                const tdTitle = $('<td>').text(item.title);
                const tdCompleted = $('<td>').text(item.completed);

                row.append(userId, tdId, tdTitle, tdCompleted);
                table.append(row);
            });
            text_div.append(table);
        }
    });
}

