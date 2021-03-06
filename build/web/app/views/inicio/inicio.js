$(document).ready(function () {
    $('#txt_email').wysihtml5();
    $("#form_email").submit(function (e) {

        enviarArchivoExcel()
        e.preventDefault();
        e.stopPropagation();
        return false;

    })
})

function enviarArchivoExcel() {
    var data = new FormData();
    $.each($('#file_excel')[0].files, function (i, file) {
        data.append('file_excel', file);
    });
    var column = $("#txt_column").val();
    var subject = $("#txt_asunto").val();
    var cuerpoMensaje = encodeURIComponent($("#txt_email").val());

    $.ajax({
        url: endpoints.send_email + "?column=" + column + "&email=" + cuerpoMensaje + "&subject=" + subject,
        data: data,
        cache: false,
        contentType: false,
        processData: false,
        type: 'POST',
        success: function (data) {
            console.log(data)
            if (data.status == 1)
            {
                eModal.alert("se envió el correo corectamente");
            } else
            {
                eModal.alert(data.description);
            }

        },
        error: function (request, textStatus, error) {
            eModal.alert("Ha ocurrido un error.");
        }
    });
}