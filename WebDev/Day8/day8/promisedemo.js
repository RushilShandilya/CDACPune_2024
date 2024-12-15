console.log("starting");

// function startup() {
//   return new Promise(function (resolve, reject) {
//     console.log("Inside start()");
//     reject("Timer finished broker");
//     // setTimeout(function () {
//     //   console.log("Timer finished");
//     //   reject("Timer finished broker");
//     // }, 2000);
//   });
// }
// pp = startup();
// pp.then(
//   function (data) {
//     console.log("then : " + data);
//   },
//   function (err) {
//     console.log("then : " + err);
//   }
// );

// console.log("end ");

p = new Promise(function (resolve, reject) {
  reject("Solution not updated");
});
p.then(function (data) {
  console.log(data);
}).catch(function (err) {
  console.log("Some error occurred : " + err);
});
console.log("Ending");
