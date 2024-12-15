// var http = require('http');

// var dt = require('./myfirstmodule'); 

// var server5555 = http.createServer(function (request, response) {
//     // Set the response HTTP header with status and content type
//     response.writeHead(200, {'Content-Type': 'text/html'});
    
//     // Send the response body "Hello World "
//     response.write('The Date and Time is ' + dt.myDateTime());
    
//     // End the response
//     response.end();
// });


// server5555.listen(5555);


//--------------------------------------------

// var fs = require('fs');
// var http = require('http');

// var server5555 = http.createServer(function (req, res) {
//     fs.readFile('Day8/index.html', function (err, data) {
//         if (err) {
//             res.writeHead(500, { 'Content-Type': 'text/plain' });
//             res.write('Error: Unable to load the requested file.');
//             return res.end();
//         }
//         res.writeHead(200, { 'Content-Type': 'text/html' });
//         res.write(data);
//         res.end();
//     });
// });

// server5555.listen(5555, function () {
//     console.log('Server is listening on port 5555');
// });

//-------------------------------------------- 

// var fs = require('fs');

// fs.appendFile('Day8/text.txt', 'Hello', function (err) {
//     if (err) throw err;
//     console.log('Saved!');
// });

//----------------------------------------------

var fs = require('fs');
var http = require('http');
let combinedArr = [];



var server5555 = http.createServer(function (req, res) {
    fs.readFile('Day8/emp.json', function (err, data1) {
        if (err) {
            res.writeHead(500, { 'Content-Type': 'text/plain' });
            res.write('Error: Unable to load the requested file.');
            return res.end();
        }
        fs.readFile('Day8/dept.json', function (err, data2) {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.write('Error: Unable to load the requested file.');
                return res.end();
            }
            combinedArr = [JSON.parse(data1), JSON.parse(data2)];
            res.writeHead(200, { 'Content-Type': 'application/json' });
            res.write(JSON.stringify(combinedArr));
            res.end();
        });
    });
});

server5555.listen(5555, function () {
    console.log('Server is listening on port 5555');
});