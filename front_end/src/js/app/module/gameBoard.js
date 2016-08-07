define(["../class/cord","../class/entity"],function (Cord,Entity) {
	//container vars
	var max_x = 0,
	    max_y = 0,
		scale = 0; 
	var gameBoardContainer;
	
	var entityList = [];
	
	//return type
	var module = {};
	
	function getMaxDimentions(){
		max_x = gameBoardContainer.width();
		max_y = gameBoardContainer.height();
	}

	function entityDisplay(entityNode){
		var node = document.createElement("div");
		node.className = "entity more-info";
		node.id = entityNode.name;
		node.style.marginLeft = entityNode.cord.x * 30;
		node.style.marginTop = entityNode.cord.y * 30;
		return node;
	}

	module.addEntity = function(entityObject){
		entityList.push(entityObject);
	};
	
	module.render = function(){
		gameBoardContainer.empty();//removes all inner objects
		for (var i = 0, len = entityList.length; i < len; i++) {
			gameBoardContainer.append(entityDisplay(entityList[i]));
		}
	};
	
	module.init = function (gameBoardId) {
		gameBoardContainer = gameBoardId;
		getMaxDimentions();
		scale = 30;


	};
    $(".more-info").click(function(){
        console.log("entity cool text");
    });


	function runBoard (){
		console.log("run Board");
		module.init($(".board-container"));
		module.addEntity(new Entity(new Cord(1,1)), "Fred");
        module.addEntity(new Entity(new Cord(1,4)), "Fred");
        module.addEntity(new Entity(new Cord(2,2)), "Fred");
        module.addEntity(new Entity(new Cord(2,3)), "Fred");
        module.addEntity(new Entity(new Cord(2,4)), "Fred");
		module.render();
	}
	runBoard();
});