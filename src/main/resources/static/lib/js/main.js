
$(function(){
	var main_vue = new Vue({
		el:"#main",
		data:{
			menuFirst:[],
			menuSecond:[],
			menuThird:[],
			leftMenu:[],
		},
		methods:{
			front:function(event){
				$("#main_content").load($(event.target).attr("url"));
			},
			salesManagement:function(){
				var href = "sales/sales.html";
				$("#main_content").load(href);
			},
			subMenu:function(event){
				var pid = $(event.target).attr("menuId");
				main_vue.leftMenu = [];
				for(var i=0;i<main_vue.menuSecond.length;i++){
					if(main_vue.menuSecond[i].pid==pid){
						var menuTemp = {first:null,second:[]};
						menuTemp.first = main_vue.menuSecond[i];
						var temp = [];
						for(var j=0;j<main_vue.menuThird.length;j++){
							if(main_vue.menuSecond[i].pid==main_vue.menuThird[j].pid){
								temp.push(main_vue.menuThird[j].pid);
							}
						}
						menuTemp.second = temp;
						main_vue.leftMenu.push(menuTemp);
						main_vue.$nextTick(function(){
							main_element.render();
						})

					}
				}
			}
		},
		mounted:function(){
			var first = [];
			var second = [];
			var third = [];
		    $.ajax({
		    	url:basePath+"/index/menus",
		    	method:"get",
		    	success:function(d){
		    		if(d.data.length){
		    			for(var i=0;i<d.data.length;i++){
		    				if(parseInt(d.data[i].menuType)==1){
		    					first.push(d.data[i]);
		    				}else if(parseInt(d.data[i].menuType)==2){
		    					second.push(d.data[i]);
		    				}else if(parseInt(d.data[i].menuType)==3){
		    					third.push(d.data[i]);
		    				}
		    			}
		    			main_vue.menuFirst = first;
		    			main_vue.menuSecond = second;
		    			main_vue.menuThird = third;
		    			main_vue.$nextTick(function(){
		    				
		    			})
		    		}
		    	}
		    })

		}
	})
	 var main_element;
	layui.use('element', function(){
		  main_element = layui.element;
		  
	});
	
	
})

