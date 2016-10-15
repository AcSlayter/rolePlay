define(["../../common/ButtonActions"], function(btnActions){

    var pageButtons;

    //page init
    function privateInit(buttons) {
        console.log("Running Load : dots");

        pageButtons = new btnActions.Buttons();
        pageButtons.init(buttons);

        $(".btn").click(function(){
            pageButtons.btnClick(this);
        });

    }

    function buttonMappings(){
        var mButtons = {};

        mButtons["play"] = function(){
           //TODO: page level buttons
        };

        return mButtons;
    }

    privateInit(buttonMappings());

    require(["app/module/gameBoard"]);

});