define(['jquery'], function( $ ) {
    //when pageName is complete
    $(document).ready(function () {
        //loads page based on page Name id in body tag
        var pageName = $(document.body).attr('id'),
            pageJs = "app/page/" + pageName;

            requirejs([pageJs])
    });

});