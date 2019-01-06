<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link   href="../Themes/layui/css/layui.css"  rel="stylesheet"   media="all">
  <script src="../Themes/layui/layui.js"           charset="utf-8"></script>
<title>Insert title here</title>
</head>
<body>
  <div class="demoTable"  style="margin-top: 5px;">
  关键词:
  <div class="layui-inline">
    <input class="layui-input" name="id" id="demoReload" autocomplete="off">
  </div>
  <div class="layui-input-inline">
       <input class="layui-input" name="id2" id="demoReload2" autocomplete="off">
      </div>
  <button id="btnQuery"   class="layui-btn" data-type="reload">搜索</button>
  
  <button id="btnAdd"  onclick="goAdd();"class="layui-btn" data-type="reload">+新增</button>
</div>
</fieldset>

<table class="layui-hide" id="LAY_table_user" lay-filter="LAY_table_user"></table>
 <script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>              
          

<script>
layui.use('table', function(){
  var table = layui.table;
  
  //方法级渲染
  table.render({
    elem: '#LAY_table_user'
    ,url: '/MyBatisServletWeb/PageDemoServlet'
    ,cols: [[
      {checkbox: true, fixed: true}
      ,{field:'id', title: 'ID', width:80, sort: true, fixed: true}
      ,{field:'username', title: '用户名', width:80}
      ,{field:'sex', title: '性别', width:80, sort: true}
      ,{field:'city', title: '城市', width:80}
      ,{field:'sign', title: '签名'}
      ,{field:'experience', title: '积分', sort: true, width:80}
      ,{field:'score', title: '评分', sort: true, width:80}
      ,{field:'classify', title: '职业', width:80}
      ,{field:'wealth', title: '财富', sort: true, width:135}
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
    ]]
    ,id: 'LAY_table_user'
    ,page: true
    ,limits: [3,5,10]
    ,limit: 5 //每页默认显示的数量
    ,height: 500
    ,loading: false //请求数据时，是否显示loading
    ,done:function(res){
        userPage.data = res.data;
    }
  });
  
 
  var $ = layui.$, active = {
    reload: function(){    
       var index  = layer.msg('查询中，请稍后...',{icon:16,time:false,shade:0});   
       setTimeout(function(){
    	 //执行重载
   		table.reload('LAY_table_user', {
   				  page: {
     						 curr: 1 //重新从第 1 页开始
    						}
    			,where: {
      								keyword1: $('#demoReload').val(),
      								keyword2: $('#demoReload2').val()         
   						 }
     	});//end reload
        layer.close(index);
      },100);  //end setTimeout
          
    }
  };
  
  //定义可供外部调用的方法
  window.loadData =function(){
	  var table = layui.table;
		setTimeout(function(){
	    table.reload('LAY_table_user', {
	        url: '/MyBatisServletWeb/PageDemoServlet',
	        page:{
	            curr:1  //从第一页开始
	        },
	        method:'get',
	        where:{
	       		keyword1: $('#demoReload').val(),
					keyword2: $('#demoReload2').val() 
	        } 
	        }); 
	    },100);  //end setTimeout
  } 
  
  $('#btnQuery').on('click', function(){	
		 //var type = $(this).data('type');
		   // active[type] ? active[type].call(this) : '';
		   loadData();
	   });
  
//头工具栏事件
  table.on('toolbar(LAY_table_user)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
      case 'getCheckData':
        var data = checkStatus.data;
        layer.alert(JSON.stringify(data));
      break;
      case 'getCheckLength':
        var data = checkStatus.data;
        layer.msg('选中了：'+ data.length + ' 个');
      break;
      case 'isAll':
        layer.msg(checkStatus.isAll ? '全选': '未全选');
      break;
    };
  });
  
//监听行工具事件
table.on('tool(LAY_table_user)', function(obj){
  var data = obj.data;
  //console.log(obj)
  if(obj.event === 'del'){
    layer.confirm('真的删除行么', function(index){
      obj.del();
      layer.close(index);
    });
  } else if(obj.event === 'edit'){
    layer.prompt({
      formType: 2
      ,value: data.email
    }, function(value, index){
      obj.update({
        email: value
      });
      layer.close(index);
    });
  }
});
  
   });
   
 

 function goAdd()
 { 
 
	 var url = "family_dibao_city_add.html";
	 alert(url);
     top.openDialog(url, 'User_Form', '添加', 600, 550, 50, 10);    
} 
 
</script>
</body>
</html>