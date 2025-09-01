const form = document.querySelector("form")

// arrow function
const msg = () =>{
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;

    if (idade >= 18) {
        alert(`${nome} é maior de idade.`)
    } else {
        alert(`${nome} é menor de idade.`)
    }
}

form.addEventListener(`submit`, function(event) {
    event.preventDefault();

    msg()
});