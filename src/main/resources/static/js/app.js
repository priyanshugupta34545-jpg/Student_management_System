document.addEventListener('DOMContentLoaded', function () {
  document.querySelectorAll('.delete-link').forEach(function (link) {
    link.addEventListener('click', function (event) {
      if (!window.confirm('Are you sure you want to delete this student record?')) event.preventDefault();
    });
  });
  const phoneInput = document.getElementById('phone');
  if (phoneInput) {
    phoneInput.addEventListener('input', function () {
      this.value = this.value.replace(/[^0-9]/g, '').slice(0, 10);
    });
  }
});
