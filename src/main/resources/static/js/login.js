// Call the dataTables jQuery plugin
$(document).ready(function() {
  // lo dejo vacío
});

async function iniciarSesion(){
  let datos={};
  datos.email=document.getElementById('txtEmail').value;
  datos.password=document.getElementById('txtPassword').value;

  const response = await fetch('api/login', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body:JSON.stringify(datos)
  });
  // No me gusta que devuelva String , cambio a JSON
   // Mejor solución sería recibir un 401 (fallo autenticación)
    // y actuar en consecuencia
    const respuesta = await response.json();
    if (respuesta.success == 'FALSE') {
      localStorage.token=respuesta.token;
      localStorage.email=datos.email;
      window.location.href='usuarios.html';
    }
  else alert(' Credenciales erróneas, intente de nuevo');
}