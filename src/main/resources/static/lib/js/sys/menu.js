

$(function(){
	menu_vue= new Vue({
		el:"#menu",
		data:{
			pmenus:[{menuName:''}],
			menuObj:{id:null,menuName:"",menuType:1,pid:0,url:"",order:null,isEnd:null,icon:""}
			
		},
		methods:{
			toAdd:function(){
				menu_vue.menuObj={id:null,menuName:"",menuType:1,pid:0,url:"",order:null,isEnd:null,icon:""};
				menu_form.render();
				menu_layer.open({
					  type:1, 
					  content: $("#menu_obj"),
		              area: ['650px', '400px'],
		              title:'添加',
		              btn:["保存","关闭"],
		              success:function(layero){  
		            	     var mask = $(".layui-layer-shade");  
		            	     mask.appendTo(layero.parent().parent());  
		            	     //其中：layero是弹层的DOM对象  
		              },
		              btn1:function(){
		            	  menu_vue.add();
		            	  menu_layer.closeAll();
		            	  menu_table.initTable();
		              },
		              btn2:function(){
		            	  menu_layer.close();
		              }
		            	  
				});	
			},
			add:function(){
				$.post(basePath+'/system/menu/add',menu_vue.menuObj,function(d){
					if(d.code){
						alert("添加成功！");
					}
				})
			},
			toEdit:function(){
				var menuId = menu_table.getSelected();
				if(!menuId){
					return ;
				}
				menu_vue.getInfo(menuId);
				menu_form.render();
				menu_layer.open({
					  type:1, 
					  content: $("#menu_obj"),
		              area: ['650px', '400px'],
		              title:'添加',
		              btn:["保存","关闭"],
		              success:function(layero){  
		            	     var mask = $(".layui-layer-shade");  
		            	     mask.appendTo(layero.parent().parent());  
		            	     //其中：layero是弹层的DOM对象  
		              },
		              btn1:function(){
		            	  menu_vue.edit();
		            	  menu_layer.closeAll();
		            	  menu_table.initTable();
		              },
		              btn2:function(){
		            	  menu_layer.close();
		              }
		            	  
				});	
				
			},
			getInfo:function(id){
				$.get(basePath+"/system/menu/queryMenu",{id:id},function(d){
					if(d.code==0){
						menu_vue.menuObj = d.obj;
					}
				})
			},
			edit:function(){
				$.post(basePath+"/system/menu/update",menu_vue.menuObj,function(d){
					if(d.code==0){
						alert("更新成功!");
					}
				})
			},
			deleteMenu:function(){
				debugger;
				var menuId = menu_table.getSelected();
				$.get(basePath+"/system/menu/delete",{id:menuId},function(d){
					if(d.code==0){
						alert("删除成功！");
		            	menu_table.initTable();
					}
				})
			}
		}
	});
	var menu_layer;
	var menu_form;
	var menu_table= {
		    id: "menu_table",
		    table: null,
		    layerIndex: -1,
		    initColumn:function(){
		    	var columns = [
		    	               {field: 'selectItem', radio: true},
		    	               {title: '菜单名', field: 'menuName', align: 'center', valign: 'middle', sortable: true, width: '100px'},
		    	               {title: '菜单类型', field: 'menuType', align: 'center', valign: 'middle', sortable: true, width: '100px',formatter:function(row,index){
		    	            	   return row.menuType==1?"一级菜单":row.menuType==2?"二级菜单":row.menuType==3?"三级菜单":"";
		    	               }},
		    	               {title: '路径', field: 'url', align: 'center', valign: 'middle', width: '100px',formatter:function(row,index){
		    	            	   if(row.url){
		    	            		   return row.url;
		    	            	   }
		    	            	   return "暂无";
		    	               }},
		    	               {title: '图标', field: 'icon', align: 'center', valign: 'middle', sortable: true, width: '150px',formatter:function(row,index){
		    	            	   if(row.icon){
		    	            		   return '<i class="layui-icon" style=" color: #1E9FFF;">'+row.icon+'</i>';
		    	            	   }
		    	            	   return "暂无";
		    	               }},
		    	               {title: '排序', field: 'order', align: 'center', valign: 'middle', sortable: true, width: '100px'},
		    	               {title: '尾节点', field: 'isEnd', align: 'center', valign: 'middle', sortable: true, width: '100px',formatter:function(row,index){
		    	            	   return row.isEnd?"是":"否";
		    	               }}
		    	               ]
		    	           return columns;
		    },
		    initTable:function(){
		    	var dataUrl =basePath+'/system/menu/menuList';
		    	var that = this;
		    	var colunms = that.initColumn();
	            var table = new TreeTable(menu_table.id, dataUrl, colunms);       	
	            table.setRootCodeValue(0);
	            table.setExpandColumn(1);
	            table.setIdField("id");
	            table.setCodeField("id");
	            table.setParentCodeField("pid");
	            table.setExpandAll(false);
	            //table.setData({startDate:startDate,endDate:endDate,decomposeId:decomposeId,ifdCode:ifdCode,flowCode:flowCode}); 
	           //table.setCallback(callback);
	            table.init();
	            that.table = table;
		    },
		    getSelected:function() {
		        var selected = $("#menu_table").bootstrapTreeTable('getSelections');
		        if (selected.length == 0) {
		            alert("请选择一条记录");
		            return false;
		        } else {
		            return selected[0].id;
		        }
		    }
	};
	menu_table.initTable();
	layui.use(['form','layer'], function(){
		 menu_layer = layui.layer;
		 menu_form = layui.form;
		 menu_form.on('select(menu_one_type)',function(data){
			 $.get(basePath+'/system/menu/menus',{menuType:(data.value-1)},function(d){
				menu_vue.pmenus = d.data;
				menu_vue.$nextTick(function(){
					menu_form.render();
					menu_vue.menuObj.menuType=data.value;
				})
			 })
		 })
		 menu_form.on('select(menu_two_type)',function(data){
			 menu_vue.menuObj.pid=data.value?data.value:0;
		 })
		 menu_form.on('radio(menu_end_radio)',function(data){
			 menu_vue.menuObj.isEnd=data.value;
		 })
		
	});  
})