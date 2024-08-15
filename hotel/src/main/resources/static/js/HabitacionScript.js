const url="http://localhost:8080";

$(document).ready(function () {
    // Hacer una petición AJAX cuando la página carga
    $.ajax({
        url: url+'/habitacion/inicio',
        type: 'GET',
        success: function (data) {
            $('#habitaciones-container').html(data);
        },
        error: function () {
            console.error("Error al cargar las habitaciones.");
        }
    });
});