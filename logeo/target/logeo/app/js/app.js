var app = null;
window.addEventListener('load',function () {
    app=new Vue({
        el:'#aplicacion',
        data:{
            login:true,
            matricula :false,
            notas : false,
            usuario: null,
            credencial : null,
            mensaje: null
        },
        methods:{
            ocultar:function () {
                this.matricula=false;
                this.notas=false;
                this.login=false
            },
            autenticar:function () {
                var thisaux =this;
                axios.post('servicio/autenticar',
                    {
                        usuario:thisaux.usuario,
                        credencial:thisaux.credencial
                    }
                )
                    .then(function (alumnoResponse) {
                        thisaux.mensaje=alumnoResponse.data.mensaje;
                        thisaux.ocultar();
                        thisaux.login=!alumnoResponse.data.adentro;
                        thisaux.matricula=alumnoResponse.data.adentro;
                    })
                    .catch(function (error) {
                        thisaux.mensaje = 'Problemas de conectividad';
                    });
            },
            verNotas :function () {
                this.ocultar();
                this.notas=true;
            },
            verMatricula:function () {
                this.ocultar();
                this.matricula=true
            }
        }
    });
});
