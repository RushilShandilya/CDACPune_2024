function calculate(){
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const operator = document.getElementById('selectops').value;

    let result;

    switch (operator) {
        case 'add':
            result = num1 + num2;
            break;
        case 'sub':
            result = num1 - num2;
            break;
        case 'mul':
            result = num1 * num2;
            break;
        case 'div':
            if (num2 !== 0) {
                result = num1 / num2;
                break;
            } else {
                alert('Error: Division by zero is not allowed.');
                return;
            }
        default:
            alert('Error: Invalid operator.');  
    }

    document.getElementById('result').textContent = result;

}