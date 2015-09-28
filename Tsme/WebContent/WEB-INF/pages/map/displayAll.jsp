<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/Tsme/css/map/map.css" />
<link rel="stylesheet" href="/Tsme/css/public.css" />
<script src="/Tsme/js/jQuery/jquery-1.7.2.js"></script>
<script src="/Tsme/js/map/map.js"></script>
<title>全国地图</title>
</head>
<body onload="loadMapJs();">
<div class="map" id="map"></div>
<!-- 这是地图页面<br/>
<a href="/Tsme">跳转到首页</a><br/> -->
<form id="queryMsgForm">
	<input name="minX" id="minX" type="hidden">
	<input name="minY" id="minY" type="hidden">
	<input name="maxX" id="maxX" type="hidden">
	<input name="maxY" id="maxY" type="hidden">
</form>
</body>
</html>