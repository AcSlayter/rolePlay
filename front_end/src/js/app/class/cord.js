define(function(){

    return function Cord(x,y) {
        this.x = x;
        this.y = y;

        this.toString = function () {
            return "x:" + this.x + ",y:" + this.y;
        };
    }

});