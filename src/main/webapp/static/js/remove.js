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

                confirm("加入成功")
        }

    )
}
$(function () {
    $('#del').click(function () {
        if(this.checked){
            $("input[name='check']").attr("checked",true);
        }
        else {
            $("input[name='check']").attr("checked",false);
        }
    })

})
$(function () {
    $('#btn').click(function () {

        // let check=$('.qin').val();
        let check=document.getElementsByName('check')
        let id=new Array();
        for(i=0;i<check.length;i++){

            if(check[i].checked){
                id.push(check[i].value);
                console.log(id[i])

            }
        }
        $.ajax({
            url:'shopreal',
            type:'post',
            data:{
                id:JSON.stringify(id)

            },

            success:(req)=>{
                window.alert("借阅成功")
                $('input')

            }
        })
    })


})
