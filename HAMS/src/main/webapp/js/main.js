$(function(){
	$('.container').load('toIndex');
	$('.title li').click(function(){
		$('.title li').removeClass('active');
		$(this).addClass('active');
		$('.index-search').hide();
		if($(this).text().trim()=="首页"){
			$('.container').load('toIndex');
		}
		if($(this).text().trim()=="建筑陈列"){
			$('.container').load('bulidshow');
			console.log($(this).text().trim());
		}
		if($(this).text().trim()=="新闻资讯"){
			$('.container').load('newBulletinShow?curPage=1');
			//$('.container').load('newBulletinShow', 'curPage=1');Post
		}

		if($(this).text().trim()=="素材收集"){
			$('.container').load('Materialcollection.jsp');
		}
		if($(this).text().trim()=="地图分布"){
			$('.container').html('');
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
			var map = new AMap.Map('mainbody', {

				center : [ 120.619585, 31.299379 ],
				pitch : 0,
				viewMode : '3D',
				zoom: 20, // 初始缩放倍数
				scrollWheel: false, // 禁止鼠标滚轮缩放
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
		if($(this).text().trim()=="关联检索"){
			console.log($(this).text().trim());
		}
		if($(this).text().trim()=="关于我们"){
			$('.container').load('aboutMe.html');
		}

	});
	$(' .bulletin a').click(function(){
		$('.container').load('newsMsg.html');

	})
	/*$('.tuijian .thumbnail').click(function(){
		$('.container').load('findBuildById');

	});*/
	$('#myCarousel .item').click(function(){
		$('.container').load('bulidmsg.html');

	});

});
function toCollection(){
	$('.container').load('Materialcollection.jsp');

}
function colse() {
	console.log("sdfghjkl");
	$('.title li.active').click();
	console.log("sdfghjkl");
}

