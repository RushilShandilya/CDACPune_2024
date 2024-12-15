url = "https://jsonplaceholder.typicode.com/todos?_limit=2";
fetch(url)
  .then(function (data) {
    return data.json();
  })
  .then(function (data) {
    console.log(data);
  });
		
