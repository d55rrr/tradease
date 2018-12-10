$(function(){
	usergroup_vue = new Vue({
		el:"#user_group",
		data:{
			userObj:{id:null,userName:"",account:"",phone:"",sex:null,occupy:"",editPass:null,flag:null},
			userShow:false
		},
		methods:{
			toAdd:function(){
				user_vue.userObj={id:null,userName:"",account:"",phone:"",sex:null,occupy:"",editPass:null,flag:null};
				user_form.render();
				user_layer.open({
					  type:1, 
					  content: $("#user_obj"),
		              area: ['650px', '400px'],
		              title:'添加',
		              btn:["保存","关闭"],
		              success:function(layero){  
		            	     var mask = $(".layui-layer-shade");  
		            	     mask.appendTo(layero.parent().parent());  
		            	     //其中：layero是弹层的DOM对象  
		              },
		              btn1:function(){
		            	  user_vue.add();
		            	  user_layer.closeAll();
		              },
		              btn2:function(){
		            	  user_layer.close();
		              }
		            	  
				});	
			},
			add:function(){
				$.post(basePath+'/sys/user/add',user_vue.userObj,function(d){
					if(d.code==0){
						alert("添加成功！");
						userGroup_table.reload('userGroup_table');
					}
				})
			},
			toEdit:function(){
				
			},
			deleteUser:function(){
				var checked = userGroup_table.checkStatus('userGroup_table');
				if(checked.data.length>0){
					var param = [];
					for(var i=0;i<checked.data.length;i++){
						param.push(checked.data[i].id);
					}
					
					$.ajax({
						url:basePath+"/sys/user/delete",
						method:"post",
						data:JSON.stringify(param),
						dateType:'json',
						contentType:"application/json",
						success:function(d){
							if(d.code==0){
								alert("删除成功！");
								userGroup_table.reload('userGroup_table');
							}else{
								alert("请选择要删除数据!");
							}
						}
					});
				}
			}
		}
	});
	layui.use('table', function(){
		  userGroup_table = guser_table = layui.table;
		  
		  userGroup_table.render({
			 id:'userGroup_table'
		    ,height:'full-180'
		    ,page:true
		    ,elem: '#userGroup_tbl'
		    ,url:basePath+'/sys/user/userList'
		    ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
		    ,cols: [[
		      {type:'checkbox'}
		      ,{field:'id', width:100, title: '用户组id', sort: true}
		      ,{field:'userName', width:150, title: '用户组名'}
		      ,{field:'account', title: '账号', sort: true}
		      ,{field:'flag', title: '是否启用',width:100,templet:function(d){
		    	  if(d.flag==1){
			    	  return  '<input type="checkbox" name="switch" lay-skin="switch" checked>';
		    	  }else{
			    	  return  '<input type="checkbox" name="switch" lay-skin="switch" >';
		    	  }
		      }}

		    ]]
		  });
		  guser_table.render({
			  	height:'full-240'
			  	,skin:'line'
			    ,page:true
				,id:'guser_table'
			    ,elem: '#guser_tbl'
			    ,url:basePath+'/sys/user/userList'
			    ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
			    ,cols: [[
			      {type:'checkbox'}
			      ,{field:'id', width:100, title: '用户组id', sort: true}
			      ,{field:'userName', width:150, title: '用户组名'}
			      ,{field:'account', title: '描述', sort: true}

			    ]]
			});
		  
	});
	$.get(basePath+'/system/menu/menuList',function(d){
		  debugger;
			var ztreeObj = $.fn.zTree.init($("#menu_ztree"),setting,d);
			ztreeObj.expandAll(true);

		})
	var user_layer;
	var user_form;
	var userGroup_table;
	var guser_table;
	var gmenu_table;
	var usergroup_vue;
	var menu_ztree;
	var setting = {
			view: {
				dblClickExpand: false,
				showLine: true,
				selectedMulti: false
			},
			data: {
				simpleData: {
					enable:true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: "0",
				},
				key:{
					name:'menuName'
				}
			},
			check:{
				enable:true
			}
		};
	
	layui.use(['form','layer'], function(){
		 user_layer = layui.layer;
		 user_form = layui.form;
		 user_form.on('radio(user_previ_radio)',function(data){
			 user_vue.userObj.editPass=data.value;
		 });
		 user_form.on('radio(user_sex_radio)',function(data){
			 user_vue.userObj.sex=data.value;
		 })
		
	});  
})
