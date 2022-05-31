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
        if ($("input[name='check']:checked").length==0){
            confirm("请至少选择一个目标")
        }else {
            for(i=0;i<check.length;i++){

                if(check[i].checked){
                    id.push(check[i].value);

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

                    for (let i = 0; i < id.length; i++) {
                        $("input[name='check']").parents('tr#'+id[i]).remove()
                    }

                    // $("input[name='check']:checked").parents('td').remove()

                    // $("input[name='check']").attr("checked",true).parents('td').remove()



                }
            })
        }

    })


})
$(function () {
    $('#returnbtn').click(function () {
        let check=document.getElementsByName('check')
        let id=new Array();
        if ($("input[name='check']:checked").length==0){
            confirm("请至少选择一个目标")
        }else {
            for(i=0;i<check.length;i++){

                if(check[i].checked){
                    id.push(check[i].value);

                }
            }

            $.ajax({
                url:'return',
                type:'post',
                data:{
                    id:JSON.stringify(id)

                },
                success:(req)=>{
                    window.alert("归还成功")

                    // for (let i = 0; i < id.length; i++) {
                    //     $("input[name='check']").parents('tr#'+id[i]).remove()
                    // }

                    // $("input[name='check']:checked").parents('td').remove()

                    // $("input[name='check']").attr("checked",true).parents('td').remove()
                    window.location.href='http://localhost:8080/llibrary_war_exploded/Detai'


                }
            })
        }

    })
})
$(function () {
    $('#again').click(function () {
        let check=document.getElementsByName('check')
        let id=new Array();
        if ($("input[name='check']:checked").length==0){
            confirm("请至少选择一个目标")
        }else {
            for(i=0;i<check.length;i++){

                if(check[i].checked){
                    id.push(check[i].value);


                }
            }
            confirm("确认续借吗")
            $.ajax({
                url:'again',
                type:'post',
                data:{
                    id:JSON.stringify(id)

                },
                success:(req)=>{
                    window.alert("续借成功")

                    // for (let i = 0; i < id.length; i++) {
                    //     $("input[name='check']").parents('tr#'+id[i]).remove()
                    // }

                    // $("input[name='check']:checked").parents('td').remove()

                    // $("input[name='check']").attr("checked",true).parents('td').remove()
                    window.location.href='http://localhost:8080/llibrary_war_exploded/Detai'


                }
            })
        }

    })
})
$(function () {
    $('.have').hide();
    $("input[name='radio']").change(function () {
        let num=$("input[name='radio']:checked").val();
        if(num==1){
            $(".have").hide()
            $(".not").show()
        }
        else{
            $(".have").show()
            $(".not").hide()
        }
    })
})
