$(function(){
	$("#footer").load("foot.html");
	$("#header").load("header.html");
	$("#header1").load("header1.html");
})

function UrlSearch() {
   var name,value; 
   var str=location.href; //鍙栧緱鏁翠釜鍦板潃鏍�
   var num=str.indexOf("?") 
   str=str.substr(num+1); //鍙栧緱鎵€鏈夊弬鏁�   stringvar.substr(start [, length ]

   var arr=str.split("&"); //鍚勪釜鍙傛暟鏀惧埌鏁扮粍閲�
   for(var i=0;i < arr.length;i++){ 
    num=arr[i].indexOf("="); 
    if(num>0){ 
     name=arr[i].substring(0,num);
     value=arr[i].substr(num+1);
     this[name]=value;
     } 
    } 
} 

function alert(e){
	$("body").append('<div id="msg"><div id="msg_top">娓╅Θ鎻愮ず<span class="msg_close">脳</span></div><div id="msg_cont">'+e+'</div><div class="msg_close" id="msg_clear" style="background:#4C7FFE">纭畾</div></div>');
     $(".msg_close").click(function (){
        $("#msg").remove();
    });     
}

function nores(){
	var str = "";
	str = '<img src="imgs/nocon.png"/><p style="text-align: center">鎼滅储鏃犵粨鏋�</p>';
	return str
}
