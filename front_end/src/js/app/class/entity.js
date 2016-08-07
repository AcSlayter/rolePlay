define(["app/class/Cord"], function (){

    return function Entity( lcord , lname , name  ) {
        this.cord = lcord;
        this.name = lname;
        this.entityType = name;
    };

});