Vue.component('cursos',
    {
        props: ['curso'],
        template: '<tr><td>{{curso.curso}}</td><td>{{curso.seccion}}</td><td>{{curso.docente}}</td><td>{{curso.horario}}</td></tr>'
    }
);
var app = null;
window.addEventListener('load',function () {
    app = new Vue({
        el: '#aplicacion',
        data: {
            login: true,

            matricula: false,
            notas: false,
            usuario: null,
            credencial: null,
            mensaje: null,
            listaCurso: null
        },
        methods: {
            ocultar: function () {
                this.matricula = false;
                this.notas = false;
                this.login = false
            },
            autenticar: function () {
                var thisaux = this;
                axios.post('servicio/autenticar',
                    {
                        usuario: thisaux.usuario,
                        credencial: thisaux.credencial
                    }
                )
                    .then(function (alumnoResponse) {
                        thisaux.mensaje = alumnoResponse.data.mensaje;
                        thisaux.ocultar();
                        thisaux.matricula = alumnoResponse.data.adentro;
                        thisaux.login = !alumnoResponse.data.adentro;
                        if (alumnoResponse.data.adentro) {
                            thisaux.verCursos();
                        }
                    })
                    .catch(function (error) {
                        thisaux.mensaje = 'Problemas de conectividad';
                    });
            },
            verCursos: function () {
                var thisaux = this;
                axios.post('servicioCurso/buscarCurso',
                    {
                        usuario: thisaux.usuario
                    })
                    .then(function (cursoResponse) {
                        thisaux.listaCurso = cursoResponse.data.cursos;
                        thisaux.ocultar();
                        thisaux.matricula = true
                    })
                    .catch(function (error) {
                    });
            },
            verNotas: function () {
                this.ocultar();
                this.notas = true;
            }
        }
    });
});

