function loadMapJs(){
	var script = document.createElement("script");
	script.type = "text/javascript";
	script.src = "http://api.map.baidu.com/api?v=2.0&ak=iG8Kl4sa2teqAgGIBGoPloCX&callback=init";
	document.body.appendChild(script);
}

function init(){
	var map = new BMap.Map("map");            // 创建Map实例
	var point = new BMap.Point(116.404, 39.915); // 创建点坐标
	map.centerAndZoom(point,15);                 
	map.enableScrollWheelZoom();                 //启用滚轮放大缩小
	map.enableKeyboard();					//启动键盘放大缩小
	map.addEventListener("moveend", drawStations);
}

function drawStations(){
	var _this = this;
	var bounds = this.getBounds();
	$("input[name=minX]").val(bounds.getSouthWest().lng);
	$("input[name=minY]").val(bounds.getSouthWest().lat);
	$("input[name=maxX]").val(bounds.getNorthEast().lng);
	$("input[name=maxY]").val(bounds.getNorthEast().lat);
	console.log($("input[name=minX]").val());
	
	 $.ajax({
		 async: true,
         type: "POST",
         url: "/Tsme/map/getGeoMsg",
         data: $("#queryMsgForm").serialize(),
         success: function (result) {
        	
        	var arr = eval(result);
        	for(var i=0; i<arr.length; i++){
        		console.log(arr[i].name);
        	}
             
         },
         error: function () {
             alert("aaa");
         }
     });
	
}