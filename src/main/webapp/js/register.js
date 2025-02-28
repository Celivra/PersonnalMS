document.getElementById("registerForm").addEventListener("submit", function(event) {
    let isValid = true;

    // 获取输入框的值
    let username = document.getElementById("username").value.trim();
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();
    let confirmPassword = document.getElementById("confirmPassword").value.trim();

    // 验证用户名长度
    if (username.length <= 3) {
        document.getElementById("usernameError").style.display = "block";
        isValid = false;
    } else {
        document.getElementById("usernameError").style.display = "none";
    }

    // 验证邮箱格式
    let emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email)) {
        document.getElementById("emailError").style.display = "block";
        isValid = false;
    } else {
        document.getElementById("emailError").style.display = "none";
    }

    // 验证密码长度
    if (password.length <= 6) {
        document.getElementById("passwordError").style.display = "block";
        isValid = false;
    } else {
        document.getElementById("passwordError").style.display = "none";
    }

    // 确认密码是否一致
    if (password !== confirmPassword) {
        document.getElementById("confirmPasswordError").style.display = "block";
        isValid = false;
    } else {
        document.getElementById("confirmPasswordError").style.display = "none";
    }

    // 如果验证失败，则阻止表单提交
    if (!isValid) {
        event.preventDefault();
    }
});