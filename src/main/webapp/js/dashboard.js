function showSection(section) {
    // 隐藏所有功能区
    const sections = document.querySelectorAll('.section');
    sections.forEach(function(section) {
        section.style.display = 'none';
    });

    // 显示选中的功能区
    const selectedSection = document.getElementById(section);
    selectedSection.style.display = 'block';
}
