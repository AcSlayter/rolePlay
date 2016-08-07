define(['jquery'], function( $ ) {
    //when pageName is complete
    $(document).ready(function () {

        var pageName = $(document.body).attr('id'),
            pageJs = "app/page/" + pageName;

            requirejs([pageJs])
    });

});