async function calc() {
  return "50";
}
function calc1() {
  return Promise.resolve("500");
}

p = calc1();
p.then(function (result) {
  console.log(result);
});


