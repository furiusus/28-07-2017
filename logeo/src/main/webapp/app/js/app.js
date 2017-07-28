var app = null;
window.addEventListener('load',function () {
    app=new Vue({
        el:'#aplicacion',
        data:{
            login:true,
            matricula :false,
            notas : false,
            usuario: null,
            credencial : null
        },
        methods:{
            ocultar:function () {
                this.matricula=false;
                this.notas=false;
                this.login=false
            },

            ingresar : function () {
                if(this.usuario==71197765 && this.credencial==12345){
                    this.ocultar();
                    this.matricula=true
                }
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
