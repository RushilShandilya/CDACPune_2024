var readline = require("readline");
var fs = require("fs");
var { open } = require("fs/promises");
var rl = readline.createInterface({
  input: fs.createReadStream("cdac.txt"),
});
rl.on("line", function (line) {
  console.log(line); //or parse line
});

// myFileReader();
// async function myFileReader() {
//   const file = await open("cdac.txt");
//   for await (const line of file.readLines()) {
//     console.log(line);
//   }
// }
