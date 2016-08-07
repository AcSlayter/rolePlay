define(function(){
    var mod = {};

    mod.ButtonActions = function (){
        this.btnMappings = {};

        this.init = function(buttons){
            this.btnMappings = buttons;
        };

        this.btnClick = function (myObject){
            var btnName = myObject.getAttribute("name");

            if( btnName in this.btnMappings ) {
                this.btnMappings[btnName]();
            }else{
                console.log("button handle not defined");
            }
        };

    };

    mod.Buttons = function () {};
    mod.Buttons.prototype = new mod.ButtonActions();

    return mod;
});