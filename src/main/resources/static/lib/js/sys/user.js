$(function(){
	user_vue = new Vue({
		el:"#user",
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
						user_table.reload('user_table');
					}
				})
			},
			toEdit:function(){
				
			},
			deleteUser:function(){
				var checked = user_table.checkStatus('user_table');
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
								user_table.reload('user_table');
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
		  user_table = layui.table;
		  
		  user_table.render({
			 id:'user_table'
		    ,elem: '#user_table'
		    ,url:basePath+'/sys/user/userList'
		    ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
		    ,cols: [[
		      {type:'checkbox'}
		      ,{field:'id', width:100, title: '用户id', sort: true}
		      ,{field:'userName', width:180, title: '用户名'}
		      ,{field:'account', title: '账号', sort: true}
		      ,{field:'phone', width:250, title: '手机号码'}
		      ,{field:'sex', title: '性别',width:100,templet:function(d){
		    	  return d.sex==1?'男':'女';
		       }} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
		      ,{field:'occupy', title: '职务', sort: true,width:200}
		      ,{field:'editPass', title: '密码权限',width:100,templet:function(d){
		    	  if(d.editPass==1){
			    	  return  '<input type="checkbox" name="switch" lay-skin="switch" checked>';
		    	  }else{
			    	  return  '<input type="checkbox" name="switch" lay-skin="switch" >';
		    	  }
		      }}
		      ,{field:'flag', title: '是否启用',width:100,templet:function(d){
		    	  if(d.flag==1){
			    	  return  '<input type="checkbox" name="switch" lay-skin="switch" checked>';
		    	  }else{
			    	  return  '<input type="checkbox" name="switch" lay-skin="switch" >';
		    	  }
		      }}

		    ]]
		  });
		});
	var user_layer;
	var user_form;
	var user_table;
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
