$(function(){
})
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#sales_table'
    ,url:basePath+'/sales/list'
    ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
    ,cols: [[
      {type:'checkbox'}
      ,{field:'id', width:100, title: '订单编号', sort: true}
      ,{field:'productName', width:100, title: '产品名'}
      ,{field:'productType', width:100, title: '产品类型', sort: true}
      ,{field:'broker', width:80, title: '经办人'}
      ,{field:'buyer', title: '购买人',width:80 } //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
      ,{field:'buyerPhone', title: '购买人电话', sort: true,width:120}
      ,{field:'receiver', title: '收货人', sort: true,width:80}
      ,{field:'receiverPhone', title: '收货人电话',width:120}
/*      ,{field:'projectId', width:100, title: '项目名', sort: true}
*/      ,{field:'installTime', width:160, title: '安装时间', sort: true,templet:function(d){
    	  return new Date(d.installTime).format("yyyy-MM-dd hh:mm:ss");
      }}
      ,{field:'installAddress', title: '安装地址', sort: true}

    ]]
  });
});