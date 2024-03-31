document.addEventListener('DOMContentLoaded', function() {
    var cartoon = document.getElementById('cartoon');

    // Function to make the cartoon walk
    function walk() {
        cartoon.style.left = 'calc(100% - 200px)';
        setTimeout(function() {
            cartoon.style.left = '0';
        }, 4000);
    }
    walk();
});

