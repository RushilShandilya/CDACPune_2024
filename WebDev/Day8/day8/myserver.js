var http = require("http");

var ws = http.createServer(function (request, response) {
  response.writeHead(200, { "Content-Type": "text/html" });
  response.write("<h1>Welcome CDAC 1</h1>");
  response.end();
});
ws.listen(5555, function () {
  console.log("Server running 5555 ");
});

// http
//   .createServer(function (request, response) {
//     response.write("Welcome CDAC 2");
//     response.end();
//   })
//   .listen(4444);
