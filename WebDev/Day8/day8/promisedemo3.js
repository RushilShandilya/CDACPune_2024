async function myDisplay() {
  let myPromise = new Promise(function (resolve, reject) {
    resolve("I love You !!");
  });
  console.log(await myPromise);
}
console.log("End");

myDisplay();
