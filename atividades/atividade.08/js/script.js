const form = document.querySelector("form")

// arrow function
const msg = () =>{
    let nome = document.querySelector('#nome').value;
    let peso = document.querySelector('#peso').value;
    let altura = document.querySelector('#altura').value;
    const result = peso/(altura*altura)
    let imc = result.toFixed(2);
    
    let legenda =
        (imc < 18.5 ) ? " esta abaixo do peso."
        : (imc < 24.9) ? "esta com peso normal"
        : (imc < 29.9) ? "esta com sobrepeso"
        : (imc < 34.9) ? "esta com obesidade grau 1"
        : (imc < 39.9) ? "esta com obesidade grau 2"
        : "você esta com obesidade mórbida";

    document.querySelector('#result').innerHTML = `${nome} seu imc é ${imc}, você esta${legenda}`;

}

form.addEventListener(`submit`, function(event) {
    event.preventDefault();

    msg()
});