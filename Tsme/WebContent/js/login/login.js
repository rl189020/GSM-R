/**
 * 
 */
function changeCheckNum(){
    var img = document.getElementById("checkNumImage");
    img.src="/Tsme/login/checkNumberShow?timeStamp="+new Date().getTime();
}

function submit(){
	$("#form").submit();
}