define(["../../common/ButtonActions"], function(btnActions){

    //page init
    function privateInit(buttons) {
        console.log("Running Load : menu");

        pageButtons = new btnActions.Buttons();
        pageButtons.init(buttons);

        $(".btn").click(function(){
            pageButtons.btnClick(this);
        });
    }

    function buttonMappings(){
        var mButtons = {};

        mButtons["play"] = function(){
            window.open("board.html","_self")
        };

        return mButtons;
    }


    privateInit(buttonMappings());

});