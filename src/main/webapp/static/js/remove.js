const doRequst=(id)=>{
    $.get(
'remover',
        {
id:id
        }
,(data)=>{
             $('tr#'+id).remove()
            window.alert("移除成功")
        }
    )
}
const doe=(id)=>{
    $.get(
        'shop',
        {
            id:id
        },
        (data)=>{
            window.alert("加入成功")
        }

    )
}
$(function () {
    $('#del').click(function () {
        $("input[value='check']").attr("checked",true);
    })
})