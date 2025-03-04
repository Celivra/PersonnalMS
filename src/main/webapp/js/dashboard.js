function showSection(section) {
    // 隐藏所有功能区
    const sections = document.querySelectorAll('.section');
    sections.forEach(function(section) {
        section.style.display = 'none';
    });

    const sections2 = document.querySelectorAll('.section2');
    sections2.forEach(function(section) {
        section.style.display = 'none';
    });

    // 显示选中的功能区
    const selectedSection = document.getElementById(section);
    selectedSection.style.display = 'block';
}
document.addEventListener("DOMContentLoaded", function () {
    // 获取所有编辑按钮
    const editButtons = document.querySelectorAll(".editButton");

    editButtons.forEach(button => {
        button.addEventListener("click", function () {
            // 获取当前行的数据
            const id = this.getAttribute("data-id");
            const name = this.getAttribute("data-name");
            const gender = this.getAttribute("data-gender");
            // const age = this.getAttribute("data-age");
            const birth = this.getAttribute("data-birth");
            const email = this.getAttribute("data-email");
            const phone = this.getAttribute("data-phone");
            const poliLook = this.getAttribute("data-poli_look");

            // 填充编辑表单
            document.getElementById("editId").value = id;
            document.getElementById("editName").value = name;
            document.getElementById("editGender").value = gender;
            // document.getElementById("editAge").value = age;
            document.getElementById("editBirth").value = birth;
            document.getElementById("editEmail").value = email;
            document.getElementById("editPhone").value = phone;
            document.getElementById("editPoliLook").value = poliLook;

            // 显示编辑表单
            showSection('edit');
        });
    });
});