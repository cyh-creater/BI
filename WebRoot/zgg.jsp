<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>山西转型综合改革示范区金融大数据监控平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		
	<link type="text/css" href="front/bi/index.css" rel="stylesheet"/>
	<link rel="stylesheet" type="text/css" href="front/bi/swiper.min.css" />
	
	
	<link rel="stylesheet" href="front/iziModal/css/iziModal.min.css">
	<script src="<%=path %>/front/iziModal/js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<script src="http://www.jq22.com/jquery/1.11.1/jquery.min.js"></script>
	<script type="text/javascript" src="front/bi/swiper-3.4.2.min.js"></script>
	<script src="front/iziModal/js/iziModal.min.js" type="text/javascript"></script>
	<script src="front/js/echarts.min.js" type="text/javascript"></script>
	
	
	
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=3.0&ak=or4zpL1QujRKLL5U5br54Ao8rjwoB99O"></script>
	<style>
		.anchorBL{
			display:none;
		}
	.gundong{
		height:150px;
		padding-bottom:20px;
		display: block;
	 	white-space: nowrap;
	 	text-overflow: ellipsis;
	 	overflow: hidden;
		}
	</style>
	
  </head>
  
<body>
	<div class="title">
		<img src="front/bi/img/tit1.png" />
		<span>山西转型综合改革示范区金融大数据监控平台</span>
		<img src="front/bi/img/tit2.png" />
	</div>
	<div class="content">
		<div class="left">
			<div class="top">
				<div class="tit">
					<img src="front/bi/img/tit.png" alt="">
					<span>综改示范区布局图</span>
					<a href='front/bi/zgqmap.html' target="_blank" class="d-tip">
					   <img src="front/bi/img/add.png" alt="" />
					   <span>查看全图</span>
					</a>
				</div>
				<div class="con" id="allmap">
	
				</div>
			</div>
			<ul class="bottom">
				<li>
					<div class="tit">
						<img src="front/bi/img/tit.png" alt="">
						<span>园区工业用电量排名（亿千瓦时）</span>
					</div>
					<div class="con">
						<ul class="gundong">
							<ul>
							<c:forEach items="${ydlpm}" var="s" varStatus="t">
									<li style="width: 95%;height: 20px;display: block;margin:10px 5px 10px 5px;color:white ;">
										<span>${t.index+1}、</span>
										<span>${s.parkName}</span>
										<span style="float: right;">${s.pElectric}&nbsp;</span>
									</li>
							</c:forEach>
								
							</ul>
						</ul>	
					</div>
				</li>
				<li>
					<div class="tit">
						<img src="front/bi/img/tit.png" alt="">
						<span>园区税收排名（亿万元）</span>
					</div>
					<div class="con">
						<ul class="gundong">
							<ul>
							<c:forEach items="${sspm}" var="s" varStatus="t">
									<li style="width: 95%;height: 20px;display: block;margin:10px 5px 10px 5px;color:white ;">
										<span>${t.index+1}、</span>
										<span>${s.parkName}</span>
										<span style="float: right;">${s.pTax}&nbsp;</span>
									</li>
							</c:forEach>
								
							</ul>
						</ul>
					</div>
				</li>
			</ul>
		</div>
		<div class="right">
			<div class="top">
				<div class="tit">
					<img src="front/bi/img/tit.png" alt="">
					<span>园区运营现状分析</span>
				</div>
				<ul class="con">
					<li>
						<h6>生产总值变化情况（亿万元）</h6>
						<div class="licon" id="reportContainer2" style="width: 280px;height: 210px;background: rgba(16,29,76,0.8);" >
							
							
						</div>
					</li>
					<li>
						<h6>固定资产投资变化情况（亿万元）</h6>
						<div class="licon"  id="reportContainer3" style="width: 280px;height: 210px;background: rgba(16,29,76,0.8);">
								
						</div>
					</li>
					<li>
						<h6>社会消费品零售总额变化情况（亿万元）</h6>
						<div class="licon" id="reportContainer4"  style="width: 280px;height: 210px;background: rgba(16,29,76,0.8);">
							
						</div>
					</li>
					<li>
						<h6>出口变化情况（亿万元）</h6>
						<div class="licon" id="reportContainer5"  style="width: 280px;height: 210px;background: rgba(16,29,76,0.8);">
							
						</div>
					</li>
				</ul>
			</div>
			<div class="bottom">
				<div class="tit">
					<img src="front/bi/img/tit.png" alt="">
					<span>园区企业性质分析</span>
				</div>
				<ul class="con">
					<li>
						<h6>企业数量分布图</h6>
						<div class="licon"  id="reportContainer6" style="width: 280px;height: 140px;">
							
						</div>
					</li>
					<li>
						<h6>企业结构分布图</h6>
						<div class="licon" id="reportContainer7" style="width: 280px;height: 140px;">
								
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="right-r">
			<div class="top">
				<div class="tit">
					<img src="front/bi/img/tit.png" alt="">
					<span>金融平台实时数据</span>
				</div>
				<div class="con">
					<c:forEach items="${sssj}" var="sj" varStatus="t">
							<div class="li">
								<div class='swiper-li'>
								   <p>${sj.rType }：</p>
								   <div>
									   <span>${sj.rNumber}家</span>
									   <span>
										   <img src="front/bi/img/top.png" alt="" />
										   <span>${sj.rRising}%</span>
									   </span>
								   </div>
								</div>
							</div>
					</c:forEach>
							<!-- <div class="li">
								<div class='swiper-li'>
								   <p>债权融资：</p>
								   <div>
									   <span>105,000万</span>
									   <span>
										   <img src="front/bi/img/top.png" alt="" />
										   <span>3%</span>
									   </span>
								   </div>
								</div>
							</div>
							<div class="li">
								<div class='swiper-li'>
								   <p>股权融资：</p>
								   <div>
									   <span>95,500万</span>
									   <span>
										   <img src="front/bi/img/top.png" alt="" />
										   <span>5%</span>
									   </span>
								   </div>
								</div>
							</div>
							<div class="li">
								<div class='swiper-li'>
								   <p>股权项目：</p>
								   <div>
									   <span>115,540个</span>
									   <span>
										   <img src="front/bi/img/top.png" alt="" />
										   <span>7%</span>
									   </span>
								   </div>
								</div>
							</div>
							<div class="li">
								<div class='swiper-li'>
								   <p>合作机构：</p>
								   <div>
									   <span>1,089个</span>
									   <span>
										   <img src="front/bi/img/top.png" alt="" />
										   <span>1%</span>
									   </span>
								   </div>
								</div>
							</div>
	 -->
				</div>
			</div>
			<div class="bottom">
				<div class="tit">
					<img src="front/bi/img/tit.png" alt="">
					<span>平台终端访问数据</span>
				</div>
				<div class="con">
					<ul class='wen-ei'>
						<li>
						   <img src="front/bi/img/weixin.png" alt="" />
						   <div>
							   <p>
								   <span>已关注：</span>
								   <span>${con.bClose }人</span>
							   </p>
							   <p>
								   <span>发布信息：</span>
								   <span>${con.bReleaseInfo }条</span>
							   </p>
						   </div>
						</li>
						<li>
							<img src="front/bi/img/ie.png" alt="" />
						   <div>
							   <p>
								   <span>今日访问ip：</span>
								   <span>${con.bVisit }</span>
							   </p>
							   <p>
								   <span>累计访问ip：</span>
								   <span>${con.bAccVisit }</span>
							   </p>
						   </div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div id='time' class="time">2018/12/28  星期五</div>
	</div>


<!-- 模态窗口 -->
<div id="modal-default" class="iziModal">
</div>
<div id="modal-iframe3" class="iziModal light"></div>
<div id="modal-iframe4" class="iziModal light"></div>
<div id="modal-iframe5" class="iziModal light"></div>
<div id="modal-iframe6" class="iziModal light"></div>
<div id="modal-iframe7" class="iziModal light"></div>
  </body>
   <script type="text/javascript">
    function showtime() {
        var today, hour, second, minute, year, month, date;
        var strDate;
        today = new Date();
        var n_day = today.getDay();
        switch(n_day) {
            case 0:
            {
                strDate = "星期日"
            }
                break;
            case 1:
            {
                strDate = "星期一"
            }
                break;
            case 2:
            {
                strDate = "星期二"
            }
                break;
            case 3:
            {
                strDate = "星期三"
            }
                break;
            case 4:
            {
                strDate = "星期四"
            }
                break;
            case 5:
            {
                strDate = "星期五"
            }
                break;
            case 6:
            {
                strDate = "星期六"
            }
                break;
            case 7:
            {
                strDate = "星期日"
            }
                break;
        }
        //year = today.getYear();
        year = today.getFullYear();
        month = today.getMonth() + 1;
        date = today.getDate();
        hour = today.getHours();
        minute = today.getMinutes();
        second = today.getSeconds();
        //document.getElementById('time').innerHTML = year + "年" + month + "月" + date + "日 " + strDate +" " + hour + ":" + minute + ":" + second; //显示时间
        document.getElementById('time').innerHTML = year + "年" + month + "月" + date + "日 " + " " + " " + strDate; //显示时间
        setTimeout("showtime();", 1000); //设定函数自动执行时间为 1000 ms(1 s)
    }
    showtime()



</script>
<!--
<script type="text/javascript">

    $.get('${base}/shengchanzongzhi/tolist.action',function(data,status){
        console.log(data);
        var dataAxis2 = data.data.sc_months;
        var data2 = data.data.sc_data;
        var data12 = data.data.sc_data1;

        jianbian(document.getElementById('reportContainer2'),dataAxis2,data2,data12,"生产总值","生产总值同比","#4986F3","#2C4E9C","#152257");
        toonechart(dataAxis2,data2,data12,"modal-default","reportContainer2","sczz","生产总值变化");

        jianbian(document.getElementById('reportContainer3'),data.data.gd_months,data.data.gd_data,data.data.gd_data1,"固定资产投资","固定资产投资同比","#61BBA3","#3B6E7A","#172653");
        toonechart(data.data.gd_months,data.data.gd_data,data.data.gd_data1,"modal-iframe3","reportContainer3","gdzc","固定资产投资");

        jianbian(document.getElementById('reportContainer4'),data.data.ssxfp_months,data.data.ssxfp_data,data.data.ssxfp_data1,"社会消费品零售总额","社会消费品零售总额同比","#49B3C6","#2F6D90","#142353");
        toonechart(data.data.ssxfp_months,data.data.ssxfp_data,data.data.ssxfp_data1,"modal-iframe4","reportContainer4","lsze","社会消费品零售总额");

        jianbian(document.getElementById('reportContainer5'),data.data.ck_months,data.data.ck_data,data.data.ck_data1,"出口变化","出口变化同比","#B79E6C","#776E61","#19234E");
        toonechart(data.data.ck_months,data.data.ck_data,data.data.ck_data1,"modal-iframe5","reportContainer5","ckbh","出口变化");

        var legend6 = data.data.type_legend;
        var value6 = data.data.type_data;
        huan(document.getElementById('reportContainer6'),legend6,value6);
        toonechart(legend6,value6,"","modal-iframe6","reportContainer6","qysl","企业数量结构分布图");


        var legend7 = data.data.industry_legend;
        var value7 = data.data.industry_data;
        huan(document.getElementById('reportContainer7'),legend7,value7);
        toonechart(legend7,value7,"","modal-iframe7","reportContainer7","qysl","企业数量结构分布图");

    });


    function toonechart(dataAxis2,data2,data12,div,clickdiv,type,title){
        $("#"+div).iziModal(
            {
                //       title: 'iziModal with iframe',
                //      subtitle: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit.',
                title: title,
                iconClass: 'icon-settings_system_daydream',
                transitionIn: 'transitionIn',
                transitionOut: 'transitionOut',
                headerColor: '#fff',
                theme: 'light',
                width: 505,
                overlayClose: true,
                iframe : true,
                iframeHeight: 360,
                iframeURL: "${base}/indicatorsStatistic/toOneChart?dataAxis="+dataAxis2+"&data="+data2+"&data1="+data12+"&type="+type
            }
        );
        $(document).on('click', '#'+clickdiv, function (event) {
            event.preventDefault();
            $('#'+div).iziModal('open');
        });
	}


	function jianbian(div,dataAxis,data,data1,dataname,data1name,color1,color2,color3){
        var option = {
            grid:{top:6},
//    backgroundColor:'#1B203E',
            legend: {
                itemWidth: 10,
                itemHeight: 10,
                itemGap: 10,
                bottom:'0.1%',
                data:[ {name:dataname,}
                    , {name:data1name,icon:'rect',}],
                textStyle: { fontSize: 10, color: '#E8E8E9' }
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b}: {c}",
                textStyle:{fontSize:10}
            },
            xAxis: [
                {
                    axisLine: {
                        show: true
                    },
                    axisTick: {
                        show: false
                    },
                    splitLine: {     //网格线
                        "show": false
                    },
                    type: 'category',
                    boundaryGap: true,
                    data: dataAxis,
                    axisLabel: {
                        textStyle: {
                            color: '#345CB6'
                        },
                        fontSize:10,
                        interval:0,
                        rotate:45,
                    },
                    axisLine:{
                        lineStyle:{
                            color:'#345CB6',
                            width:3,//这里是为了突出显示加上的
                        }
                    }
                }
            ],
            yAxis: [
                {
                    axisLine: {
                        show: true
                    },
                    axisTick: {
                        show: false
                    },
                    splitLine: {     //网格线
                        show: false
                    },
                    axisLabel: {
                        textStyle: {
                            color: '#345CB6'
                        }
                        ,
                        fontSize:10,
                    },
                    type: 'value',
                    scale: true,
                    max: 400,
                    min: 0,
                    boundaryGap: [0.2, 0.2],
                    axisLine:{
                        lineStyle:{
                            color:'#345CB6',
                            width:2,//这里是为了突出显示加上的
                        }
                    }
                },
                {
                    axisLine: {
                        show: false
                    },
                    axisTick: {
                        show: false
                    },
                    splitLine: {     //网格线
                        show: false
                    },
                    type: 'value',
                    axisLabel: {
                        textStyle: {
                            color: '#53B4E6'
                        }
                        ,
                        fontSize:10,
                    },
                    formatter: '{value} %'
                }
            ],
            dataZoom: [
                {
                    type: 'inside'
                }
            ],
            series: [
                {
                    name: dataname,
                    type: 'bar',
                    xAxisIndex: 0,
                    yAxisIndex: 0,
                    barWidth : 10,//柱图宽度
                    itemStyle: {
                        normal: {
                            color: new echarts.graphic.LinearGradient(
                                0, 0, 0, 1,
                                [
                                    {offset: 0, color: color1},
                                    {offset: 0.5, color: color2},
                                    {offset: 1, color: color3}
                                ]
                            )
                        },
                        emphasis: {
                            color: new echarts.graphic.LinearGradient(
                                0, 0, 0, 1,
                                [
                                    {offset: 0, color: color1},
                                    {offset: 0.7, color: color2},
                                    {offset: 1, color: color3}
                                ]
                            )
                        }
                    },
                    data: data
                },
                {
                    name: data1name,
                    type:'line',
                    xAxisIndex: 0,
                    yAxisIndex: 1,
                    smooth: true,
                    symbol: 'circle',     //设定为实心点
                    symbolSize: 6,   //设定实心点的大小
                    itemStyle : {
                        normal : {
                            color: "#FFFFFF",
                            lineStyle:{
                                color:'#3469A8',
                                width:2
                            }
                        }
                    },
                    data:data1
                }
            ]
        };


        var myChart = echarts.init(div);
        myChart.setOption(option);

		// Enable data zoom when user click bar.
        /*var zoomSize = 6;
        myChart.on('click', function (params) {
            console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)]);
            myChart.dispatchAction({
                type: 'dataZoom',
                startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],
                endValue: dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]
            });
        });*/
	}

	function huan(div,legend,value){

        var data=[];
        for(var i=0;i<legend.length;i++){
            var name = legend[i];
            var value1 = value[i];
            var tmp = {};
            tmp.value = value1;
            tmp.name=name;
            data.push(tmp);
        }

	    var option = {
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b}: {c} ({d}%)"
                ,
                textStyle:{fontSize:10}
            },
            legend: {
                orient: 'vertical',
                x: 'right',
                y: '0',
                data: legend,
                textStyle:{fontSize:9,color:'#ffffff'},
                itemWidth:7,
                itemHeight:7,
                itemGap:3
            },
            series: [
                {
                    name:'企业数量',
                    type:'pie',
                    radius: ['50%', '70%'],
                    center:['45%', '45%'],
                    avoidLabelOverlap: false,
                    label: {
                        normal: {
                            show: false,
                            position: 'center'
                            ,
                            textStyle: {
                                fontSize: '10',
                                fontWeight: 'bold'
                            }
                        },
                        emphasis: {
                            show: true,
                            textStyle: {
                                fontSize: '12',
                                fontWeight: 'bold'
                            }
                        }
                    },
                    labelLine: {
                        normal: {
                            show: false
                        }
                    },
                    data:data
                }
            ]
        };
        var myChart = echarts.init(div);
        myChart.setOption(option);
	}
</script> -->
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");    // 创建Map实例
	map.centerAndZoom(new BMap.Point(112.686417,37.721199), 11);  // 初始化地图,设置中心点坐标和地图级别
	map.setCurrentCity("太原");          // 设置地图显示的城市 此项是必须设置的
	map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
//	madeBoundary();        //加载颜色

    function madeBoundary() {
        var datas = new Array("太原市-#e4ff02","晋中市-#e4ff02");
        var bdary = new BMap.Boundary();
        for(var i=0;i<datas.length;i++){
              getBoundary(datas[i],bdary);
          } 
    } 
    
    function getBoundary(data,bdary){    
          data = data.split("-");
        bdary.get(data[0], function(rs){       //获取行政区域
            var count = rs.boundaries.length; //行政区域的点有多少个
            var pointArray = [];
            for (var i = 0; i < count; i++) {
                var ply = new BMap.Polygon(rs.boundaries[i], {strokeWeight: 2, strokeColor: "#ff0000",fillOpacity:0.5,fillColor:data[1]}); //建立多边形覆盖物
                map.addOverlay(ply);  //添加覆盖物
            }
        })
    }

	//学府园区1
	var polygon1 = new BMap.Polygon([

		new BMap.Point(112.591142,37.699639),
		new BMap.Point(112.593082,37.70692),
		new BMap.Point(112.59337,37.71026),
		new BMap.Point(112.587621,37.710859),
		new BMap.Point(112.585716,37.709232),
		new BMap.Point(112.585321,37.707662),
		new BMap.Point(112.583991,37.707748),
		new BMap.Point(112.582734,37.703265),
		new BMap.Point(112.582734,37.703265)
	], {strokeColor:"#ec0080", fillColor: "#ec0080", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon1);           //增加多边形

	var circle1 = new BMap.Circle(new BMap.Point(112.588, 37.707),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5, fillColor: "#ffffff"}); //创建圆
    map.addOverlay(circle1);         
	var polyline1 = new BMap.Polyline([
		new BMap.Point(112.588, 37.707),
		new BMap.Point(112.565, 37.707),
		new BMap.Point(112.565, 37.800)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline1); 


	//学府园区2
	var polygon2 = new BMap.Polygon([

		new BMap.Point(112.555641,37.813387),
		new BMap.Point(112.554779,37.799531),
		new BMap.Point(112.548455,37.786985),
		new BMap.Point(112.548311,37.781224),
		new BMap.Point(112.558228,37.781281),
		new BMap.Point(112.559953,37.778086),
		new BMap.Point(112.565486,37.778086),
		new BMap.Point(112.564768,37.781281),
		new BMap.Point(112.576913,37.781281),
		new BMap.Point(112.5772,37.784019),
		new BMap.Point(112.584674,37.784019),
		new BMap.Point(112.584674,37.812304),
		new BMap.Point(112.584387,37.813216)
	], {strokeColor:"#ec0080", fillColor: "#ec0080", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon2);           //增加多边形

	var circle2 = new BMap.Circle(new BMap.Point(112.565, 37.800),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle2);                     // 将标注添加到地图中 

	var polyline2 = new BMap.Polyline([
		new BMap.Point(112.350, 37.800),
		new BMap.Point(112.560, 37.800)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline2);   

	var opts1 = {
	  position : new BMap.Point(112.350, 37.800),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-50, -10)    //设置文本偏移量
	}
	var label1 = new BMap.Label("学府产业园区8.37平方公里", opts1);  // 创建文本标注对象
		label1.setStyle({
			 color : "white",
			 fontSize : "12px",
			 border : 0,
			 background : "#ec0080",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label1);   



	//阳曲产业园1:
	var polygon3 = new BMap.Polygon([

		new BMap.Point(112.69089,38.183104),
		new BMap.Point(112.695777,38.188776),
		new BMap.Point(112.711443,38.189797),
		new BMap.Point(112.739614,38.187869),
		new BMap.Point(112.765629,38.178793),
		new BMap.Point(112.760742,38.135211),
		new BMap.Point(112.725385,38.136347),
		new BMap.Point(112.722223,38.147244),
		new BMap.Point(112.721648,38.161091),
		new BMap.Point(112.721648,38.160637)
	], {strokeColor:"#00c1ea", fillColor: "#00c1ea", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon3);           //增加多边形

	var circle3 = new BMap.Circle(new BMap.Point(112.735, 38.170),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle3);                     // 将标注添加到地图中 

	var polyline3 = new BMap.Polyline([
		new BMap.Point(112.735, 38.170),
		new BMap.Point(112.969428,38.023945)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline3);   

	//阳曲产业园2:
	var polygon4 = new BMap.Polygon([

		new BMap.Point(112.645472,38.042286),
		new BMap.Point(112.65582,38.04024),
		new BMap.Point(112.656251,38.034499),
		new BMap.Point(112.660276,38.032226),
		new BMap.Point(112.657401,38.030407),
		new BMap.Point(112.656826,38.022675),
		new BMap.Point(112.660276,38.02313),
		new BMap.Point(112.658766,38.014374),
		new BMap.Point(112.653305,38.014374),
		new BMap.Point(112.653736,38.012725),
		new BMap.Point(112.664372,38.011986),
		new BMap.Point(112.67508,38.011929),
		new BMap.Point(112.686147,38.01608),
		new BMap.Point(112.696783,38.021652),
		new BMap.Point(112.707419,38.022846),
		new BMap.Point(112.719276,38.024551),
		new BMap.Point(112.731924,38.031259),
		new BMap.Point(112.751903,38.03575),
		new BMap.Point(112.780577,38.047288),
		new BMap.Point(112.798255,38.052516),
		new BMap.Point(112.795237,38.078993),
		new BMap.Point(112.786254,38.099498),
		new BMap.Point(112.741914,38.094955),
		new BMap.Point(112.737889,38.083595),
		new BMap.Point(112.721792,38.075869),
		new BMap.Point(112.680398,38.053141),
		new BMap.Point(112.678673,38.046322),
		new BMap.Point(112.679248,38.041775),
		new BMap.Point(112.676948,38.041775),
		new BMap.Point(112.67163,38.044332),
		new BMap.Point(112.675798,38.053141),
		new BMap.Point(112.677092,38.060926),
		new BMap.Point(112.67393,38.065245),
		new BMap.Point(112.674792,38.069563),
		new BMap.Point(112.669905,38.070245),
		new BMap.Point(112.650502,38.047686),
		new BMap.Point(112.650502,38.04814)
	], {strokeColor:"#00c1ea", fillColor: "#00c1ea", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon4);           //增加多边形

	var circle4 = new BMap.Circle(new BMap.Point(112.720, 38.050),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle4);                     // 将标注添加到地图中 

	var polyline4 = new BMap.Polyline([
		new BMap.Point(112.720, 38.050),
		new BMap.Point(112.969428,38.023945)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline4);  

	//阳曲产业园3:
	var polygon5 = new BMap.Polygon([

		new BMap.Point(112.614857,37.877672),
		new BMap.Point(112.614857,37.86172),
		new BMap.Point(112.622619,37.861264),
		new BMap.Point(112.628943,37.860125),
		new BMap.Point(112.628943,37.863088),
		new BMap.Point(112.63153,37.863771),
		new BMap.Point(112.63268,37.866734),
		new BMap.Point(112.634404,37.873571),
		new BMap.Point(112.632392,37.874026),
		new BMap.Point(112.628943,37.871292),
		new BMap.Point(112.627218,37.872203),
		new BMap.Point(112.628655,37.879267),
		new BMap.Point(112.624056,37.879039),
		new BMap.Point(112.623194,37.8779),
		new BMap.Point(112.623194,37.8779)

	], {strokeColor:"#00c1ea", fillColor: "#00c1ea", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon5);           //增加多边形

	var circle5 = new BMap.Circle(new BMap.Point(112.623, 37.868),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle5);                     // 将标注添加到地图中 

	var polyline5 = new BMap.Polyline([
		new BMap.Point(112.623, 37.868),
		new BMap.Point(112.969428,38.023945)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline5);  

	var opts2 = {
	  position : new BMap.Point(112.969428,38.023945),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-20, -10)    //设置文本偏移量
	}
	var label2 = new BMap.Label("阳曲产业园区104.11平方公里", opts2);  // 创建文本标注对象
		label2.setStyle({
			 color : "white",
			 background : "#00c1ea",
			 border : 0,
			 fontSize : "12px",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label2); 



	//大学城产业园:
	var polygon6 = new BMap.Polygon([

		new BMap.Point(112.660312,37.776204),
		new BMap.Point(112.655856,37.773922),
		new BMap.Point(112.66218,37.771868),
		new BMap.Point(112.666061,37.770043),
		new BMap.Point(112.673391,37.763425),
		new BMap.Point(112.683452,37.754296),
		new BMap.Point(112.696387,37.746078),
		new BMap.Point(112.713922,37.725988),
		new BMap.Point(112.718234,37.721421),
		new BMap.Point(112.723876,37.715427),
		new BMap.Point(112.726966,37.715541),
		new BMap.Point(112.739614,37.715941),
		new BMap.Point(112.739614,37.722905),
		new BMap.Point(112.731781,37.722791),
		new BMap.Point(112.73099,37.744481),
		new BMap.Point(112.757652,37.745108),
		new BMap.Point(112.758766,37.773238),
		new BMap.Point(112.742956,37.773009),
		new BMap.Point(112.733649,37.772268),
		new BMap.Point(112.724451,37.770899),
		new BMap.Point(112.719133,37.770271),
		new BMap.Point(112.701202,37.77204),
		new BMap.Point(112.692722,37.772097),
		new BMap.Point(112.684602,37.772268),
		new BMap.Point(112.668504,37.775519),
		new BMap.Point(112.668504,37.775519)
	], {strokeColor:"#009cff", fillColor: "#009cff", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon6);           //增加多边形

	var circle6 = new BMap.Circle(new BMap.Point(112.720, 37.755),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle6);                     // 将标注添加到地图中 

	var polyline6 = new BMap.Polyline([
		new BMap.Point(112.720, 37.755),
		new BMap.Point(112.900, 37.755)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline6);  

	var opts3 = {
	  position : new BMap.Point(112.900, 37.755),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-10, -15)    //设置文本偏移量
	}
	var label3 = new BMap.Label("大学城产业园区27.6平方公里", opts3);  // 创建文本标注对象
		label3.setStyle({
			 color : "white",
			 border : 0,
			 background : "#009cff",
			 fontSize : "12px",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label3); 



	//晋中新能源汽车园区：
	var polygon7 = new BMap.Polygon([

		new BMap.Point(112.778924,37.744652),
		new BMap.Point(112.794231,37.745508),
		new BMap.Point(112.794087,37.747391),
		new BMap.Point(112.820533,37.747676),
		new BMap.Point(112.821468,37.744423),
		new BMap.Point(112.820893,37.732096),
		new BMap.Point(112.821755,37.726844),
		new BMap.Point(112.784098,37.725474),
		new BMap.Point(112.777199,37.742141),
		new BMap.Point(112.777774,37.744423)
	], {strokeColor:"#004eff", fillColor: "#004eff", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon7);           //增加多边形

	var circle7 = new BMap.Circle(new BMap.Point(112.800, 37.735),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle7);                     // 将标注添加到地图中 

	var polyline7 = new BMap.Polyline([
		new BMap.Point(112.800, 37.735),
		new BMap.Point(112.890, 37.735)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline7); 
	
	var opts4 = {
	  position : new BMap.Point(112.890, 37.735),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-10, -5)    //设置文本偏移量
	}
	var label4 = new BMap.Label("晋中新能源汽车园区8.8平方公里", opts4);  // 创建文本标注对象
		label4.setStyle({
			 color : "white",
			 background : "#004eff",
			 border: 0,
			 fontSize : "12px",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label4); 


	//晋中汇通产业园区：
	var polygon8 = new BMap.Polygon([

	new BMap.Point(112.72172,37.716226),
	new BMap.Point(112.7256,37.712458),
	new BMap.Point(112.729445,37.709917),
	new BMap.Point(112.729589,37.70612),
	new BMap.Point(112.730882,37.695756),
	new BMap.Point(112.709323,37.695071),
	new BMap.Point(112.709143,37.68836),
	new BMap.Point(112.711335,37.662855),
	new BMap.Point(112.651257,37.661027),
	new BMap.Point(112.642058,37.664226),
	new BMap.Point(112.623948,37.678622),
	new BMap.Point(112.623661,37.683649),
	new BMap.Point(112.626823,37.685476),
	new BMap.Point(112.626823,37.689588),
	new BMap.Point(112.633722,37.689588),
	new BMap.Point(112.633722,37.695528),
	new BMap.Point(112.64407,37.702437),
	new BMap.Point(112.667067,37.70238),
	new BMap.Point(112.677415,37.70809),
	new BMap.Point(112.684027,37.71517),
	new BMap.Point(112.685069,37.722477),
	new BMap.Point(112.686614,37.73709),
	new BMap.Point(112.670229,37.73709),
	new BMap.Point(112.667067,37.73435),
	new BMap.Point(112.661318,37.73435),
	new BMap.Point(112.661605,37.737546),
	new BMap.Point(112.672241,37.739829),
	new BMap.Point(112.672241,37.742797),
	new BMap.Point(112.67799,37.74508),
	new BMap.Point(112.677703,37.749873),
	new BMap.Point(112.671666,37.749873),
	new BMap.Point(112.670804,37.759688),
	new BMap.Point(112.671666,37.763796),
	new BMap.Point(112.683164,37.753525),
	new BMap.Point(112.694375,37.746449),
	new BMap.Point(112.717084,37.721564)
	], {strokeColor:"#80ca00", fillColor: "#80ca00", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon8);           //增加多边形

	var circle8 = new BMap.Circle(new BMap.Point(112.685, 37.690),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle8);                     // 将标注添加到地图中 

	var polyline8 = new BMap.Polyline([
		new BMap.Point(112.685, 37.690),
		new BMap.Point(112.850, 37.690)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline8); 
	
	var opts5 = {
	  position : new BMap.Point(112.850, 37.690),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-10, -10)    //设置文本偏移量
	}
	var label5 = new BMap.Label("晋中汇通产业园区(包括中鼎物流园)49.2平方公里", opts5);  // 创建文本标注对象
		label5.setStyle({
			 color : "white",
			 border : 0,
			 background : "#80ca00",
			 fontSize : "12px",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label5); 


	//科技创新城：
	var polygon9 = new BMap.Polygon([

		new BMap.Point(112.686183,37.736633),
		new BMap.Point(112.67048,37.736776),
		new BMap.Point(112.667211,37.733894),
		new BMap.Point(112.655425,37.733894),
		new BMap.Point(112.633865,37.733209),
		new BMap.Point(112.626966,37.73318),
		new BMap.Point(112.620067,37.733465),
		new BMap.Point(112.620355,37.725217),
		new BMap.Point(112.622726,37.720736),
		new BMap.Point(112.624164,37.716169),
		new BMap.Point(112.624092,37.711059),
		new BMap.Point(112.623948,37.695556),
		new BMap.Point(112.633326,37.695556),
		new BMap.Point(112.643926,37.702837),
		new BMap.Point(112.667067,37.702923),
		new BMap.Point(112.677559,37.708775),
		new BMap.Point(112.68356,37.715569),
		new BMap.Point(112.683596,37.71674),
		new BMap.Point(112.684997,37.726673)
	], {strokeColor:"#ecac00", fillColor: "#ecac00", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon9);           //增加多边形

	var circle9 = new BMap.Circle(new BMap.Point(112.655, 37.725),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle9);                     // 将标注添加到地图中 

	var polyline9 = new BMap.Polyline([
		new BMap.Point(112.655, 37.725),
		new BMap.Point(112.350, 37.725)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline9); 
	
	var opts6 = {
	  position : new BMap.Point(112.350, 37.725),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-50, -10)    //设置文本偏移量
	}
	var label6 = new BMap.Label("科技创新城20.03平方公里", opts6);  // 创建文本标注对象
		label6.setStyle({
			 color : "white",
			 background : "#ecac00",
			 border : 0,
			 fontSize : "12px",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label6); 


	//武宿综合保税区：
	var polygon10 = new BMap.Polygon([

		new BMap.Point(112.619708,37.756921),
		new BMap.Point(112.630128,37.756949),
		new BMap.Point(112.6302,37.752755),
		new BMap.Point(112.637315,37.752612),
		new BMap.Point(112.637459,37.747591),
		new BMap.Point(112.645651,37.747591),
		new BMap.Point(112.645651,37.743596),
		new BMap.Point(112.62517,37.743482),
		new BMap.Point(112.625242,37.740714),
		new BMap.Point(112.620355,37.740742),
		new BMap.Point(112.619852,37.740714)
	], {strokeColor:"#cc00ff", fillColor: "#cc00ff", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon10);           //增加多边形

	var circle10 = new BMap.Circle(new BMap.Point(112.625, 37.750),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle10);                     // 将标注添加到地图中 

	var polyline10 = new BMap.Polyline([
		new BMap.Point(112.625, 37.750),
		new BMap.Point(112.350, 37.750)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline10); 
	
	var opts7 = {
	  position : new BMap.Point(112.350, 37.750),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-70, -15)    //设置文本偏移量
	}
	var label7 = new BMap.Label("武宿综合保税区2.94平方公里", opts7);  // 创建文本标注对象
		label7.setStyle({
			 color : "white",
			 fontSize : "12px",
			 height : "20px",
			 background : "#cc00ff",
			 border : 0,
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label7); 


	//唐槐产业园区：
	var polygon11 = new BMap.Polygon([

		new BMap.Point(112.62305,37.679279),
		new BMap.Point(112.591861,37.680022),
		new BMap.Point(112.593945,37.686019),
		new BMap.Point(112.590208,37.686533),
		new BMap.Point(112.585752,37.687047),
		new BMap.Point(112.591214,37.699154),
		new BMap.Point(112.598831,37.696755),
		new BMap.Point(112.60149,37.701952),
		new BMap.Point(112.603071,37.705949),
		new BMap.Point(112.60379,37.710003),
		new BMap.Point(112.584962,37.711659),
		new BMap.Point(112.586686,37.730554),
		new BMap.Point(112.594376,37.730497),
		new BMap.Point(112.595741,37.763881),
		new BMap.Point(112.60264,37.764053),
		new BMap.Point(112.606305,37.764851),
		new BMap.Point(112.608964,37.765821),
		new BMap.Point(112.613133,37.767076),
		new BMap.Point(112.613133,37.764224),
		new BMap.Point(112.618163,37.764053),
		new BMap.Point(112.61845,37.753554),
		new BMap.Point(112.618738,37.753326),
		new BMap.Point(112.619313,37.740543),
		new BMap.Point(112.619313,37.733465),
		new BMap.Point(112.619672,37.725017),
		new BMap.Point(112.622116,37.71988),
		new BMap.Point(112.623337,37.716112),
		new BMap.Point(112.623337,37.695099),
		new BMap.Point(112.632967,37.695042),
		new BMap.Point(112.633111,37.690188),
		new BMap.Point(112.626284,37.690074),
		new BMap.Point(112.626212,37.685733),
		new BMap.Point(112.623194,37.683906)
	], {strokeColor:"#ff6c00", fillColor: "#ff6c00", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon11);           //增加多边形

	var circle11 = new BMap.Circle(new BMap.Point(112.610, 37.700),200,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle11);                     // 将标注添加到地图中 

	var polyline11 = new BMap.Polyline([
		new BMap.Point(112.610, 37.700),
		new BMap.Point(112.350, 37.700)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline11); 
	
	var opts8 = {
	  position : new BMap.Point(112.350, 37.700),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-70, -5)    //设置文本偏移量
	}
	var label8 = new BMap.Label("唐槐产业园区25.04平方公里", opts8);  // 创建文本标注对象
		label8.setStyle({
			 color : "white",
			 fontSize : "12px",
			 background : "#ff6c00",
			 border : 0,
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label8); 


	//潇河产业园区：
	var polygon12 = new BMap.Polygon([

		new BMap.Point(112.789057,37.636655),
		new BMap.Point(112.634404,37.634827),
		new BMap.Point(112.634404,37.641685),
		new BMap.Point(112.611408,37.641228),
		new BMap.Point(112.59531,37.658142),
		new BMap.Point(112.514822,37.66317),
		new BMap.Point(112.483777,37.677337),
		new BMap.Point(112.476878,37.684191),
		new BMap.Point(112.450431,37.655856),
		new BMap.Point(112.42686,37.649457),
		new BMap.Point(112.400414,37.613334),
		new BMap.Point(112.396389,37.611504),
		new BMap.Point(112.382016,37.561633),
		new BMap.Point(112.375117,37.549732),
		new BMap.Point(112.476303,37.545612),
		new BMap.Point(112.541268,37.544239),
		new BMap.Point(112.547592,37.561633),
		new BMap.Point(112.560815,37.572617),
		new BMap.Point(112.618882,37.572617),
		new BMap.Point(112.622906,37.571702),
		new BMap.Point(112.622331,37.567583),
		new BMap.Point(112.620606,37.567125),
		new BMap.Point(112.620606,37.557972),
		new BMap.Point(112.627505,37.554768),
		new BMap.Point(112.62808,37.551563),
		new BMap.Point(112.633829,37.551106),
		new BMap.Point(112.639004,37.544697),
		new BMap.Point(112.715467,37.544697),
		new BMap.Point(112.733865,37.55431),
		new BMap.Point(112.756861,37.577193),
		new BMap.Point(112.771234,37.604186),
		new BMap.Point(112.780433,37.616535),
		new BMap.Point(112.791931,37.636198)
	], {strokeColor:"#ec0000", fillColor: "#ec0000", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	map.addOverlay(polygon12);           //增加多边形

	var circle12 = new BMap.Circle(new BMap.Point(112.610, 37.600),300,{strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5}); //创建圆
    map.addOverlay(circle12);                     // 将标注添加到地图中 

	var polyline12 = new BMap.Polyline([
		new BMap.Point(112.610, 37.600),
		new BMap.Point(112.850, 37.600)
	], {strokeColor:"#ffffff", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	map.addOverlay(polyline12); 
	
	var opts9 = {
	  position : new BMap.Point(112.850, 37.600),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(-10, -10)    //设置文本偏移量
	}
	var label9 = new BMap.Label("潇河产业园区343.48平方公里", opts9);  // 创建文本标注对象
		label9.setStyle({
			 color : "white",
			 background : "#ec0000",
			 border: 0,
			 fontSize : "12px",
			 height : "20px",
			 lineHeight : "20px",
			 fontFamily:"微软雅黑"
		 });
	map.addOverlay(label9); 



	var styleJson = [{
    "featureType": "land",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "color": "#155bc9ff"
    }
}, {
    "featureType": "water",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "color": "#6ebbe6ff"
    }
}, {
    "featureType": "green",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "color": "#093364ff"
    }
}, {
    "featureType": "building",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "building",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#dadada00"
    }
}, {
    "featureType": "subwaystation",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "color": "#113549B2"
    }
}, {
    "featureType": "education",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "color": "#12223dff"
    }
}, {
    "featureType": "medical",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "color": "#12223dff"
    }
}, {
    "featureType": "scenicspots",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "color": "#12223dff"
    }
}, {
    "featureType": "highway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "weight": 4
    }
}, {
    "featureType": "highway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#3d5fadff"
    }
}, {
    "featureType": "highway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#fed66900"
    }
}, {
    "featureType": "highway",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "highway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "highway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "highway",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "arterial",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "weight": 2
    }
}, {
    "featureType": "arterial",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffeebb00"
    }
}, {
    "featureType": "arterial",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "arterial",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "arterial",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "local",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "weight": 1
    }
}, {
    "featureType": "local",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "local",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "local",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "local",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#979c9aff"
    }
}, {
    "featureType": "local",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffffff"
    }
}, {
    "featureType": "railway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "weight": 1
    }
}, {
    "featureType": "railway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#aa9770ff"
    }
}, {
    "featureType": "railway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "subway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "weight": 1
    }
}, {
    "featureType": "subway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#aa9770ff"
    }
}, {
    "featureType": "subway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "subway",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "subway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#979c9aff"
    }
}, {
    "featureType": "subway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffffff"
    }
}, {
    "featureType": "continent",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "continent",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "continent",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "continent",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "city",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "city",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "city",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "city",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "town",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "town",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "town",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#1966c4ff"
    }
}, {
    "featureType": "road",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#507ddbff"
    }
}, {
    "featureType": "poilabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "districtlabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "road",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "road",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "road",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "district",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "poilabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "poilabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#517eddff"
    }
}, {
    "featureType": "poilabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "manmade",
    "elementType": "geometry",
    "stylers": {
        "color": "#6ca79aff",
        "visibility": "off"
    }
}, {
    "featureType": "districtlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "entertainment",
    "elementType": "geometry",
    "stylers": {
        "color": "#12223dff",
        "visibility": "off"
    }
}, {
    "featureType": "shopping",
    "elementType": "geometry",
    "stylers": {
        "color": "#12223dff",
        "visibility": "off"
    }
}, {
    "featureType": "highway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 6
    }
}, {
    "featureType": "highway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 7
    }
}, {
    "featureType": "highway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 8
    }
}, {
    "featureType": "highway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 9
    }
}, {
    "featureType": "highway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 10
    }
}, {
    "featureType": "highway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 6
    }
}, {
    "featureType": "highway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 7
    }
}, {
    "featureType": "highway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 8
    }
}, {
    "featureType": "highway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 9
    }
}, {
    "featureType": "highway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 10
    }
}, {
    "featureType": "highway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 6
    }
}, {
    "featureType": "highway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 7
    }
}, {
    "featureType": "highway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 8
    }
}, {
    "featureType": "highway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 9
    }
}, {
    "featureType": "highway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 10
    }
}, {
    "featureType": "nationalway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 6
    }
}, {
    "featureType": "nationalway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 7
    }
}, {
    "featureType": "nationalway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 8
    }
}, {
    "featureType": "nationalway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 9
    }
}, {
    "featureType": "nationalway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 10
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 6
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 7
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 8
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 9
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 10
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 6
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 7
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 8
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 9
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,10",
        "level": 10
    }
}, {
    "featureType": "provincialway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 8
    }
}, {
    "featureType": "provincialway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 9
    }
}, {
    "featureType": "provincialway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 10
    }
}, {
    "featureType": "provincialway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 8
    }
}, {
    "featureType": "provincialway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 9
    }
}, {
    "featureType": "provincialway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 10
    }
}, {
    "featureType": "provincialway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 8
    }
}, {
    "featureType": "provincialway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 9
    }
}, {
    "featureType": "provincialway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "8,10",
        "level": 10
    }
}, {
    "featureType": "cityhighway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 6
    }
}, {
    "featureType": "cityhighway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 7
    }
}, {
    "featureType": "cityhighway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 8
    }
}, {
    "featureType": "cityhighway",
    "stylers": {
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 9
    }
}, {
    "featureType": "cityhighway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 6
    }
}, {
    "featureType": "cityhighway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 7
    }
}, {
    "featureType": "cityhighway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 8
    }
}, {
    "featureType": "cityhighway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 9
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 6
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 7
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 8
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels",
    "stylers": {
        "visibility": "off",
        "curZoomRegionId": "0",
        "curZoomRegion": "6,9",
        "level": 9
    }
}, {
    "featureType": "subwaylabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "subwaylabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "tertiarywaysign",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "tertiarywaysign",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "provincialwaysign",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "provincialwaysign",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "nationalwaysign",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "nationalwaysign",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "highwaysign",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "highwaysign",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "village",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "district",
    "elementType": "labels.text",
    "stylers": {
        "fontsize": 20
    }
}, {
    "featureType": "district",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "country",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "country",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "water",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "water",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "cityhighway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#3d5fadff"
    }
}, {
    "featureType": "cityhighway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "tertiaryway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#22386bff"
    }
}, {
    "featureType": "tertiaryway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff1"
    }
}, {
    "featureType": "provincialway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#3d5fadff"
    }
}, {
    "featureType": "provincialway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#3d5fadff"
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "highway",
    "elementType": "labels.text",
    "stylers": {
        "fontsize": 20
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "nationalway",
    "elementType": "labels.text",
    "stylers": {
        "fontsize": 20
    }
}, {
    "featureType": "provincialway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "provincialway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "provincialway",
    "elementType": "labels.text",
    "stylers": {
        "fontsize": 20
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels.text",
    "stylers": {
        "fontsize": 20
    }
}, {
    "featureType": "cityhighway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "estate",
    "elementType": "geometry",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "tertiaryway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "tertiaryway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "fourlevelway",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "fourlevelway",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "scenicspotsway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "scenicspotsway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "universityway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "universityway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "vacationway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#12223dff"
    }
}, {
    "featureType": "vacationway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "fourlevelway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "fourlevelway",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#213259ff"
    }
}, {
    "featureType": "fourlevelway",
    "elementType": "geometry.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "transportationlabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "transportationlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "transportationlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "transportationlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "educationlabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "educationlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "educationlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "educationlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "transportation",
    "elementType": "geometry",
    "stylers": {
        "color": "#113549ff",
        "visibility": "off"
    }
}, {
    "featureType": "airportlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "airportlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "scenicspotslabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "scenicspotslabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "medicallabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "medicallabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "medicallabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "scenicspotslabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "airportlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "entertainmentlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "entertainmentlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "entertainmentlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "estatelabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "estatelabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "estatelabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "businesstowerlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "businesstowerlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "businesstowerlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "companylabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "companylabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "companylabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "governmentlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "governmentlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "governmentlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "restaurantlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "restaurantlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "restaurantlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "hotellabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "hotellabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "hotellabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "shoppinglabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "shoppinglabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "shoppinglabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "lifeservicelabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "lifeservicelabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "lifeservicelabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "carservicelabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "carservicelabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "carservicelabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "financelabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "financelabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff00"
    }
}, {
    "featureType": "financelabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "otherlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#2dc4bbff"
    }
}, {
    "featureType": "otherlabel",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#ffffff0"
    }
}, {
    "featureType": "otherlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "background",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on",
        "color": "#131f4aff"
    }
}, {
    "featureType": "districtlabel",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#517eddff"
    }
}, {
    "featureType": "districtlabel",
    "elementType": "labels.icon",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "nationalway",
    "elementType": "geometry",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "arterial",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#476fc6ff"
    }
}, {
    "featureType": "scenicspotslabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "on"
    }
}, {
    "featureType": "estatelabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "restaurantlabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "hotellabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "shoppinglabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "lifeservicelabel",
    "elementType": "labels",
    "stylers": {
        "visibility": "off"
    }
}, {
    "featureType": "building",
    "elementType": "geometry.fill",
    "stylers": {
        "color": "#062950ff"
    }
}, {
    "featureType": "town",
    "elementType": "labels.text.stroke",
    "stylers": {
        "color": "#0b386d00"
    }
}, {
    "featureType": "district",
    "elementType": "labels.text.fill",
    "stylers": {
        "color": "#50e3c2ff"
    }
}];
map.setMapStyleV2({styleJson:styleJson});



</script>
<!--生产总值变化情况  -->
<script type="text/javascript">
							      // 基于准备好的dom，初始化echarts实例
							      var myChart = echarts.init(document.getElementById('reportContainer2'));

							      // 指定图表的配置项和数据
							      var option = {
							           backgroundColor: 'rgba(16,29,76,0.8)',
							          tooltip: {
							              show: true,
							               trigger: 'axis' 
							          },
							         
						   			     grid: {
							     			x: 43,
							                y: 40,
										    x2: 10,
										    y2: 30
   										 }, 
							         legend: {
							              data:[
							              {
								              name:'第一产业',
								              textStyle:{color:"#25c36c"}
							              },
							              {
								              name:'第二产业',
								              textStyle:{color:"#25c36c"}
							              },
							              {
								              name:'第三产业',
								              textStyle:{color:"#25c36c"}
							              }]
							          },
							          xAxis : [
							              {
							                  type : 'category',
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow',
                                				}
                            				},	
							                  data : [
							                      <c:forEach items="${areaProduceSumList}" var="a">
							                      "${a.month}",
							                      </c:forEach>
							                  ]
							              }
							          ],
							          yAxis : [
							              {
							                  type : 'value',
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				}
                            				},	
							        		 splitLine: {
            										show: false
      			 								 }
							              }
							          ],
							          series : [
							              {
							                  name:'第一产业',
							                  type:'line',
							                  data: [<c:forEach items="${areaProduceSumList}" var="areaProduceSum">
							         					${areaProduceSum.firstIndustry},
							     					 </c:forEach>]
							                 	 
							              },
							               {
							                  name:'第二产业',
							                  type:'line',
							                  data: [
							                  		<c:forEach items="${areaProduceSumList}" var="areaProduceSum">
							         					${areaProduceSum.secondIndustry},
							     					 </c:forEach>
							                  ]
							              },
							               {
							                  name:'第三产业',
							                  type:'line',
							                  data: [
							                  		<c:forEach items="${areaProduceSumList}" var="areaProduceSum">
							         					${areaProduceSum.thirdIndustry},
							     					 </c:forEach>
							                  		]
							              	}]  
							     	 };
							
							      // 使用刚指定的配置项和数据显示图表。
							      myChart.setOption(option);
			 		 </script>
			 		 <!--固定资产投资变化情况  -->
			 		 <script type="text/javascript">
							      // 基于准备好的dom，初始化echarts实例
							      var myChart1 = echarts.init(document.getElementById('reportContainer3'));
			
							      // 指定图表的配置项和数据
							      var option = {
							         backgroundColor: 'rgba(16,29,76,25)',
							          tooltip: {
							              show: true,
							             trigger: 'axis'
							          },
							         
						   			    grid: {
							     			x: 43,
							                y: 47,
										    x2: 10,
										    y2: 30
   										 }, 
							         legend: {
							               data:[
							              {
								              name:'第一产业',
								              textStyle:{color:"#25c36c"}
							              },
							              {
								              name:'第二产业',
								              textStyle:{color:"#25c36c"}
							              },
							              {
								              name:'第三产业',
								              textStyle:{color:"#25c36c"}
							              },
							              {
								              name:'房地产开发',
								              textStyle:{color:"#25c36c"}
							              }]
							          },
							          xAxis : [
							              {
							                  type : 'category',
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				}
                            				},	
							                  data : [
							                      <c:forEach items="${data1}" var="a">
							                      "${a.month}",
							                      </c:forEach>
							                  ]
							              }
							          ],
							          yAxis : [
							              {
							                  type : 'value',
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				}
                            				},	
							                  splitLine: {
            										show: false
      			 								 }
							              }
							          ],
							          series : [
							              {
							                  name:'第一产业',
							                  type:'line',
							                  data: [<c:forEach items="${data1}" var="areaProduceSum">
							         					${areaProduceSum.firstIndustry},
							     					 </c:forEach>]
							                 	 
							              },
							               {
							                  name:'第二产业',
							                  type:'line',
							                  data: [
							                  		<c:forEach items="${data1}" var="areaProduceSum">
							         					${areaProduceSum.secondIndustry},
							     					 </c:forEach>
							                  ]
							              },
							               {
							                  name:'第三产业',
							                  type:'line',
							                  data: [
							                  		<c:forEach items="${data1}" var="areaProduceSum">
							         					${areaProduceSum.thirdIndustry},
							     					 </c:forEach>
							                  		]
							              	},
							              	 {
							                  name:'房地产开发',
							                  type:'line',
							                  data: [
							                  		<c:forEach items="${data1}" var="areaProduceSum">
							         					${areaProduceSum.fangdichan},
							     					 </c:forEach>
							                  		]
							              	}]  
							     	 };
							
							      // 使用刚指定的配置项和数据显示图表。
							      myChart1.setOption(option);
							   </script>
							   
							      
							   <!--社会消费品零售总额变化情况  --> 
							   <script type="text/javascript">
							      // 基于准备好的dom，初始化echarts实例
							      var myChart1 = echarts.init(document.getElementById('reportContainer4'));
			
							      // 指定图表的配置项和数据
							      var option = {
							         backgroundColor: 'rgba(16,29,76,0.8)',
							          tooltip: {
							              show: true,
							              /* trigger: 'axis' */
							          },
							         
						   			    grid: {
							     			x: 37,
							                y: 40,
										    x2: 10,
										    y2: 30
   										 }, 
							           legend: {
							              data:[
							              {
								              name:'零售总额',
								              textStyle:{color:"#25c36c"}
							              }]
							          },
							          xAxis : [
							              {
							                  type : 'category',
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				}
                            				},	
							                  data : [
							                      <c:forEach items="${data2}" var="a">
							                      "${a.month}",
							                      </c:forEach>
							                  ]
							              }
							          ],
							          yAxis : [
							              {
							                  type : 'value',
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				}
                            				},	
							                  splitLine: {
            										show: true
      			 								 }
							              }
							          ],
							          series : [
							              {
							                  name:'零售总额',
							                  type:'bar',
							                  data: [<c:forEach items="${data2}" var="areaProduceSum">
							         					${areaProduceSum.socialRetail},
							     					 </c:forEach>]
							                 	 
							              }]  
							     	 };
							
							      // 使用刚指定的配置项和数据显示图表。
							      myChart1.setOption(option);
							   </script>
							   
							   
							   <!--出口变化情况  -->
							   <script type="text/javascript">
							      // 基于准备好的dom，初始化echarts实例
							      var myChart1 = echarts.init(document.getElementById('reportContainer5'));
			
							      // 指定图表的配置项和数据
							      var option = {
							         backgroundColor: 'rgba(16,29,76,0.8)',
							           tooltip: {
							              show: true,
							             /*  trigger: 'axis' */
							          }, 
							           grid: {
							     			x: 37,
							                y: 40,
										    x2: 10,
										    y2: 30
   										 },
									legend: {
							              data:[
							              {
								              name:'出口总额',
								              textStyle:{color:"#25c36c"}
							              }]
							          },
							          xAxis : [
							              {
							                type : 'category',
							                axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				}
                            				},	
							                  data : [
							                      <c:forEach items="${data3}" var="a">
							                      "${a.month}",
							                      </c:forEach>
							                  ]
							              }
							          ],
							          yAxis : [
							              {
							                  type : 'value',
							                  splitLine: {
            										show: true
      			 								 },
							                  axisLine:{
                                				lineStyle:{
                                    				color:'yellow'
                                				},
                                				 
                            				},
							              }
							          ],
							          series : [
							              {
							                  name:'出口总额',
							                  type:'bar',
							                  data: [<c:forEach items="${data3}" var="areaProduceSum">
							         					${areaProduceSum.totalExportVolume},
							     					 </c:forEach>]
							                 	 
							              }]  
							     	 };
							
							      // 使用刚指定的配置项和数据显示图表。
							      myChart1.setOption(option);
							   </script>
							   
							   
							   <!--企业数量分布图  -->
							   <script type="text/javascript">
							      // 基于准备好的dom，初始化echarts实例
							      var myChart1 = echarts.init(document.getElementById('reportContainer6'));
			
							      // 指定图表的配置项和数据
							      var option = {
							         backgroundColor: 'rgba(16,29,76,0.8)',
							         
							           tooltip: {
										        trigger: 'item',
										        formatter: "{a} <br/>{b}: {c} ({d}%)"
										    },
										    legend: {
										        orient: 'vertical',
										        x: 'left',
/* 										        data:['国有企业','集体企业','股份企业','联营企业','有限责任公司','股份有限公司','私营企业','港澳台商投资企业','外商投资企业','其他']
 */										    },
										    series: [
										        {
										            name:'国有企业',
										            type:'pie',
										            radius: ['50%', '70%'],
										            
										            avoidLabelOverlap: false,
										            label: {
										                normal: {
										                    show: false,
										                    position: 'center'
										                },
										                /* emphasis: {
										                    show: true,
										                    textStyle: {
										                        fontSize: '30',
										                        fontWeight: 'white'
										                    }
										                } */
										            },
										            labelLine: {
										                normal: {
										                    show: false
										                }
				},
				data:[					            	
					{value:'${list.publicCompany}', name:'国有企业'},
					{value:'${list.groupCompany}', name:'集体企业'},
					{value:'${list.shareCooperateCompany}', name:'股份企业'},
					{value:'${list.lianYingCompany}', name:'联营企业'},
					{value:'${list.limitedLiabilityCompany}', name:'有限责任公司'},
					{value:'${list.shareLimitedCompany}', name:'股份有限公司'},
					{value:'${list.privateCompany}', name:'私营企业'},
					{value:'${list.hkMTCompany}', name:'港澳台商投资企业'},
					{value:'${list.foreignCompany}', name:'外商投资企业'},
					{value:'${list.other}', name:'其他'}					                
				]
			}
		]
	};						
	// 使用刚指定的配置项和数据显示图表。
	myChart1.setOption(option);
</script>
							   
							   
<!--企业结构分布图  -->
<script type="text/javascript">

		// 基于准备好的dom，初始化echarts实例
		var myChart1 = echarts.init(document.getElementById('reportContainer7'));
			
		// 指定图表的配置项和数据
		var option = {
			backgroundColor: 'rgba(16,29,76,0.8)',
			tooltip: {
			 trigger: 'item',
			formatter: "{a} <br/>{b}: {c} ({d}%)"
		},
	/* 	    legend: {
			        type: 'scroll',
			        orient: 'vertical',
			        right: 0,
			        top: 0,
			        bottom: 10,
			        data: [
			        '农、林、牧、渔业','采矿业','制造业','电力、热力、燃气及水生产和供应业','建筑业','批发和零售业','交通运输、仓储和邮政业','住宿和餐饮业',
			        '信息传输、软件和信息技术服务业','金融业','房地产业','租赁和商务服务业','科学研究和技术服务业','水利、环境和公共设施管理业',
			        '居民服务、修理和其他服务业','教育','卫生和社会工作','文化体育和娱乐业','公共管理、社会保障和社会组织','国际组织'
			        ],
			
			        selectedMode: false
    		}, */
		series: [
			{
				name:'国有企业',
				type:'pie',
				radius: ['50%', '70%'],
				avoidLabelOverlap: false,
			label: {
				normal: {
					show: false,
					position: 'center'
				},
				emphasis: {
					show: true,
					textStyle: {
						fontSize: '30',
						fontWeight: 'bold'
					}
				}
			},
			labelLine: {
				normal: {
					show: false
				 }
			},
				data:[
										            	
					{value:'${list1.nongLinMYIndustry}', name:'农、林、牧、渔业'},
					{value:'${list1.caiKuangIndustry}', name:'采矿业'},
					{value:'${list1.produceIndustry}', name:'制造业'},
					{value:'${list1.dianReRqSGIndustry}', name:'电力、热力、燃气及水生产和供应业'},
					{value:'${list1.buildingIndustry}', name:'建筑业'},
					{value:'${list1.pifaLsIndustry}', name:'批发和零售业'},
					{value:'${list1.trafficHouseMailIndustry}', name:'交通运输、仓储和邮政业'},
					{value:'${list1.hostelCateringIndustry}', name:'住宿和餐饮业'},
					{value:'${list1.infoTranSoftItIndustry}', name:'信息传输、软件和信息技术服务业'},
					{value:'${list1.bankingIndustry}', name:'金融业'},
					{value:'${list1.fangdichanIndustry}', name:'房地产业'},
					{value:'${list1.rentBusinessIndustry}', name:'租赁和商务服务业'},
					{value:'${list1.scienceTechnologyIndustry}', name:'科学研究和技术服务业'},
					{value:'${list1.waterEnvironmentPublicIndustry}', name:'水利、环境和公共设施管理业'},
					{value:'${list1.neighbourRepairOtherIndustry}', name:'居民服务、修理和其他服务业'},
					{value:'${list1.educationIndustry}', name:'教育'},
					{value:'${list1.healthSocialWork}', name:'卫生和社会工作'},
					{value:'${list1.cultureSportAmusementIndustry}', name:'文化体育和娱乐业'},
					{value:'${list1.publicSocialSeSocialOr}', name:'公共管理、社会保障和社会组织'},
					{value:'${list1.internationalOrganization}', name:'国际组织'}
										                
				]
			}
		]
	};
							
	// 使用刚指定的配置项和数据显示图表。
	 myChart1.setOption(option);
</script>
							   
<!--园区税收排名  -->							   
<script type="text/javascript">
		
		//向上滚动
		function noticeUp(obj,top,time) {
			 $(obj).animate({
			 marginTop: top
			 }, time, function () {
			 $(this).css({marginTop:"0"}).find(":first").appendTo(this);
			 });
			};
			var tz = setInterval("noticeUp('.gundong ul','-38px','100')",1500);
		//鼠标悬浮时停止		
		$(".gundong").hover(function(){
			clearInterval(tz);
		},function(){
			tz = setInterval("noticeUp('.gundong>ul','-38px','100')",1500);
		});			   
</script>			
</html>
