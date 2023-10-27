console.log("Funcionou");

//Username com mais de 12 caracteres
document.addEventListener("DOMContentLoaded", function() {
    const usernameInput = document.getElementById("username");
    const usernameInvalidoDiv = document.querySelector(".dadoInvalido");
    const submitButton = document.getElementById("btn-cadastrar-space");

    usernameInput.addEventListener("input", function() {
        const usernameValue = usernameInput.value;

        if (usernameValue.length < 10) {
            usernameInvalidoDiv.style.display = "none";
            submitButton.disabled = false;
        } else {
            usernameInvalidoDiv.style.display = "block";
            submitButton.disabled = true;
        }
    });
    
    const emailInput = document.getElementById('email');
    const emailError = document.getElementById('email-invalido');
    
    emailInput.addEventListener('input', function() {
        const email = emailInput.value.toLowerCase();
        if (!isValidEmail(email)) {
            emailError.style.display = "block";
            submitButton.disabled = true;
        } else {
            emailError.style.display = "none";
            submitButton.disabled = false;
        }
    });

    function isValidEmail(email) {
        const validDomains = ['gmail.com', 'hotmail.com', 'outlook.com']; // Adicione os domínios desejados aqui
        const emailParts = email.split('@');
        if (emailParts.length === 2) {
            const domain = emailParts[1].toLowerCase();
            return validDomains.includes(domain);
        }
        return false;
    }

<<<<<<< HEAD
    const senhaInput = document.getElementById('senhaTrocaCadastro');
    const senhaConfirmInput = document.getElementById('senhaConfimCadastro');
    const senhaConfirmMsg = document.getElementById('senhaConfirmacaoMsg');

    senhaConfirmInput.addEventListener('input', function() {
        const senha = senhaInput.value;
        const senhaConfirm = senhaConfirmInput.value;

        if (senha === senhaConfirm) {
            submitButton.disabled = false;
            senhaConfirmMsg.style.display = "none"
        } else {
            submitButton.disabled = true;
            senhaConfirmMsg.style.display = "block"
        }
    });

});
=======
   



});
>>>>>>> 12ec2eaf35c453e168957a09fddaefa749630783
