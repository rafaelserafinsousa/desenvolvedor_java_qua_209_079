document.addEventListener('DOMContentLoaded', function() {
    const cpfMask = document.querySelector('#cpf');
    const telefoneMask = document.querySelector('#telefone');
    const cepMask = document.querySelector('#cep');
    const form = document.querySelector('form');

    if (cpfMask) {
        cpfMask.addEventListener('input', function(){
            this.value = this.value
            .replace(/\D/g, '')
            .replace(/(\d{3})(\d)/, '$1.$2')
            .replace(/(\d{3})(\d)/, '$1.$2')
            .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
        });
    }

    if (telefoneMask) {
        telefoneMask.addEventListener('input', function(){
            this.value = this.value
            .replace(/\D/g, '')
            .replace(/(\d{2})(\d)/, '($1) $2')
            .replace(/(\d{4,5})(\d)/, '$1-$2')
            .replace(/(-\d{4})\d+?$/, '$1');
        });
    }

    if (cepMask) {
        cepMask.addEventListener('input', function(){
            this.value = this.value
            .replace(/\D/g, '')
            .replace(/(\d{5})(\d)/, '$1-$2');
        });
    }

    if (form) {
        form.addEventListener('submit', function() {
            cpfMask.value = cpfMask.value.replace(/\D/g, '');
            telefoneMask.value = telefoneMask.value.replace(/\D/g, '');
            cepMask.value = cepMask.value.replace(/\D/g, '');
        });
    }
});