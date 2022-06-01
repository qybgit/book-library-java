//移除js
const doRequst = (id) => {
    $.get(
        'remover',
        {
            id: id
        }
        , (data) => {
            $('tr#' + id).remove()
            window.alert("移除成功")
        }
    )
}
//加入图书js
const doe = (id) => {
    $.get(
        'shop',
        {
            id: id
        },
        (data) => {

            confirm("加入成功")
        }
    )
}
//复选框全选
$(function () {
    $('#del').click(function () {
        if (this.checked) {
            $("input[name='check']").attr("checked", true);
        } else {
            $("input[name='check']").attr("checked", false);
        }
    })

})
//借阅js
$(function () {
    $('#btn').click(function () {

        // let check=$('.qin').val();
        let check = document.getElementsByName('check')
        let id = new Array();
        if ($("input[name='check']:checked").length == 0) {
            confirm("请至少选择一个目标")
        } else {
            for (i = 0; i < check.length; i++) {

                if (check[i].checked) {
                    id.push(check[i].value);

                }
            }

            $.ajax({
                url: 'shopreal',
                type: 'post',
                data: {
                    id: JSON.stringify(id)

                },
                success: (req) => {
                    window.alert("借阅成功")

                    for (let i = 0; i < id.length; i++) {
                        $("input[name='check']").parents('tr#' + id[i]).remove()
                    }

                    // $("input[name='check']:checked").parents('td').remove()

                    // $("input[name='check']").attr("checked",true).parents('td').remove()


                }
            })
        }

    })


})
//归还js
$(function () {
    $('#returnbtn').click(function () {
        let check = document.getElementsByName('check')
        let id = new Array();
        if ($("input[name='check']:checked").length == 0) {
            confirm("请至少选择一个目标")
        } else {
            for (i = 0; i < check.length; i++) {

                if (check[i].checked) {
                    id.push(check[i].value);

                }
            }

            $.ajax({
                url: 'return',
                type: 'post',
                data: {
                    id: JSON.stringify(id)

                },
                success: (req) => {
                    window.alert("归还成功")

                    // for (let i = 0; i < id.length; i++) {
                    //     $("input[name='check']").parents('tr#'+id[i]).remove()
                    // }

                    // $("input[name='check']:checked").parents('td').remove()

                    // $("input[name='check']").attr("checked",true).parents('td').remove()
                    window.location.href = 'http://localhost:8080/llibrary_war_exploded/Detai'


                }
            })
        }

    })
})
//续借js
$(function () {
    $('#again').click(function () {
        let check = document.getElementsByName('check')
        let id = new Array();
        if ($("input[name='check']:checked").length == 0) {
            confirm("请至少选择一个目标")
        } else {
            for (i = 0; i < check.length; i++) {

                if (check[i].checked) {
                    id.push(check[i].value);


                }
            }
            confirm("确认续借吗")
            $.ajax({
                url: 'again',
                type: 'post',
                data: {
                    id: JSON.stringify(id)

                },
                success: (req) => {
                    window.alert("续借成功")

                    // for (let i = 0; i < id.length; i++) {
                    //     $("input[name='check']").parents('tr#'+id[i]).remove()
                    // }

                    // $("input[name='check']:checked").parents('td').remove()

                    // $("input[name='check']").attr("checked",true).parents('td').remove()
                    window.location.href = 'http://localhost:8080/llibrary_war_exploded/Detai'


                }
            })
        }

    })
})
//radio按钮
$(function () {
    $('.have').hide();
    $("input[name='radio']").change(function () {
        let num = $("input[name='radio']:checked").val();
        if (num == 1) {
            $(".have").hide()
            $(".not").show()
        } else {
            $(".have").show()
            $(".not").hide()
        }
    })
})

// $(function () {
//     $('.pay').click(function () {
//         let num=$(this).parents('tr').attr("data")
//         let num2=$(this).parents('tr').children('td.book-name').text()
//         console.log(num2)
//         $('.order-test').text(num2)
//         console.log(num)
//         $('.cover').fadeIn(1000,'swing',()=>{
//
//         });
//     })
//     $(".close a").click(function () {
//         $(".cover").fadeOut();
//     })
// })
$(function () {


    $(".pay").click(function () {
        let id = $(this).parents('tr').attr("data")
        let num = $(this).parents('tr').children('td.finename').text()
        let num1 = $(this).parents('tr').children('td.finemoney').text()
        $(".order-test").text(num)
        $(".order-test2").text(num1)
$(".hid").text(id)
        $(".cover").fadeIn()
    })
    $(".cover a").click(function () {
        $(".cover").fadeOut()
    })
})
$(function () {
    $(".tofine").click(function () {
        let data=$(this).parents('.order').children('div.hid').text()//父盒子选cover就不行
        $.ajax({
            url:'ToFine',
            type:'post',

            data:{
                id:data
            },
            success:(req)=>{
                if(req=="1")
                confirm("还款成功")
               if(req=='0')
                   confirm("还款成功")
                window.location.href = 'http://localhost:8080/llibrary_war_exploded/fine'
            }
        })
    })
})
