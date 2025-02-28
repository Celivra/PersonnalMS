// Function to validate form before submission
function validateForm() {
    let username = document.getElementById('username');
    let password = document.getElementById('password');
    let usernameError = document.getElementById('usernameError');
    let passwordError = document.getElementById('passwordError');
    let isValid = true;

    // Clear previous error messages
    usernameError.textContent = '';
    passwordError.textContent = '';

    // Max length validation (e.g., 15 characters for both fields)
    const maxLength = 260;

    // Validate username
    if (username.value.length > maxLength) {
        usernameError.textContent = `Username should not exceed ${maxLength} characters.`;
        isValid = false;
    }

    // Validate password
    if (password.value.length > maxLength) {
        passwordError.textContent = `Password should not exceed ${maxLength} characters.`;
        isValid = false;
    }

    return isValid; // Return false if validation fails, preventing form submission
}
function showText(mySession) {
    var p = document.getElementById("hiddenText");
    if(mySession == 'null') p.innerText=" ";
    else if(mySession == 'UserNotFound') p.innerText="没有这个用户!";
    else if(mySession == 'NotPassword') p.innerText="密码错误!";
}