<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="admin-index">
	<dl>
		<dt class="qs">
			<i class="am-icon-users"></i>
		</dt>
		<dd>455</dd>
		<dd class="f12">用户数量</dd>
	</dl>

	<dl onclick="loadMap()">
		<dt class="cs">
			<i class="am-icon-area-chart"></i>
		</dt>
		<dd>map</dd>
		<dd class="f12">建筑分布</dd>
	</dl>
</div>
<div class="admin-biaoge"></div>
<script type="text/javascript">
	$('.admin-biaoge').load('admin/jQuery.html');
	function loadMap() {
		$('.admin').html("");
		var data = [ [ 120.504229, 31.282950 ], [ 120.594252, 31.313542 ],
				[ 120.632532, 31.323514 ], [ 120.570563, 31.310902 ],
				[ 120.570563, 31.310902 ], [ 120.582064, 31.335245 ],
				[ 120.434607, 31.261318 ], [ 120.804022, 31.153257 ],
				[ 120.855521, 31.113290 ], [ 120.724371, 31.140329 ],
				[ 120.878867, 31.273056 ] ];
		//标记点的图标
		var icon = new AMap.Icon(
				{
					size : new AMap.Size(20, 30), // 图标尺寸
					image : '//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-red.png', // Icon的图像
					imageSize : new AMap.Size(20, 30)
				// 根据所设置的大小拉伸或压缩图片
				});

		var searchOptions = {
			map : map,
			panel : 'panel',
			keywords : '景点',
			pageSize : 5,
		};
		var search, center = [ 120.619585, 31.299379 ];
		var map = new AMap.Map('admin', {

			center : [ 120.619585, 31.299379 ],
			pitch : 0,
			viewMode : '3D',
			zoom : 20, // 初始缩放倍数
			scrollWheel : false, // 禁止鼠标滚轮缩放
			//设置地图背景图 
			mapStyle : 'amap://styles/norma'

		});

		map.setZoom(10); //设置地图层级
		new AMap.DistrictSearch({
			extensions : 'all',
			subdistrict : 0
		}).search('苏州', function(status, result) {
			// 外多边形坐标数组和内多边形坐标数组
			var outer = [ new AMap.LngLat(-360, 90, true),
					new AMap.LngLat(-360, -90, true),
					new AMap.LngLat(360, -90, true),
					new AMap.LngLat(360, 90, true), ];
			var holes = result.districtList[0].boundaries;

			var pathArray = [ outer ];
			pathArray.push.apply(pathArray, holes);
			var polygon = new AMap.Polygon({
				pathL : pathArray,
				//线条颜色，使用16进制颜色代码赋值。默认值为#006600
				strokeWeight : 4,
				//轮廓线透明度，取值范围[0,1]，0表示完全透明，1表示不透明。默认为0.9
				strokeOpacity : 0.2,
				//多边形填充颜色，使用16进制颜色代码赋值，如：#FFAA00
				fillColor : 'rgba(255,255,255,0.5)',
				//多边形填充透明度，取值范围[0,1]，0表示完全透明，1表示不透明。默认为0.9
				fillOpacity : 1,
				//轮廓线样式，实线:solid，虚线:dashed
				strokeStyle : 'solid',

				strokeDasharray : [ 10, 2, 10 ]
			});
			map.setDefaultCursor('pointer');
			data.forEach(function(item) {
				var marker = new AMap.Marker({
					icon : icon,
					position : item,
					offset : new AMap.Pixel(-10, -10)

				});
				console.log(marker);
				marker.setMap(map);
			});

			polygon.setPath(pathArray);
			map.add(polygon);

		})

	}
</script>