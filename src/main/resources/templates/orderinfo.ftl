<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <style type="text/css">
    html,body,div,span,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,abbr,address,cite,code,del,dfn,em,img,ins,kbd,q,samp,small,strong,sub,sup,var,b,i,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,figcaption,figure,footer,header,hgroup,menu,nav,section,summary,time,mark,audio,video{margin:0;padding:0;border:0;outline:0;font-size:100%;vertical-align:baseline;background:transparent;font-family:"Microsoft YaHei"}body{line-height:1}:focus{outline:1}article,aside,canvas,details,figcaption,figure,footer,header,hgroup,menu,nav,section,summary{display:block}nav ul{list-style:none}blockquote,q{quotes:none}blockquote:before,blockquote:after,q:before,q:after{content:'';content:none}a{margin:0;padding:0;border:0;font-size:100%;vertical-align:baseline;background:transparent}ins{background-color:#ff9;color:#000;text-decoration:none}mark{background-color:#ff9;color:#000;font-style:italic;font-weight:bold}del{text-decoration:line-through}abbr[title],dfn[title]{border-bottom:1px dotted #000;cursor:help}table{border-collapse:collapse;border-spacing:0}hr{display:block;height:1px;border:0;border-top:1px solid #ccc;margin:1em 0;padding:0}input,select{vertical-align:middle}
    /*URL全部改为绝对路径*/
    @font-face {font-family: 'iconfont';
        src: url('/img/iconfont.eot'); /* IE9*/
        src: url('/img/iconfont.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */
        url('/img/iconfont.woff') format('woff'), /* chrome、firefox */
        url('/img/iconfont.ttf') format('truetype'), /* chrome、firefox、opera、Safari, Android, iOS 4.2+*/
        url('/img/iconfont.svg#iconfont') format('svg'); /* iOS 4.1- */
    }
    .iconfont{
        font-family:"iconfont" !important;
        font-size:16px;font-style:normal;
        -webkit-font-smoothing: antialiased;
        -webkit-text-stroke-width: 0.2px;
        -moz-osx-font-smoothing: grayscale;
    }
    a:link{text-decoration: none;color: inherit;}
    a:visited{text-decoration: none;color: inherit;}
    a:hover{text-decoration: none;color: inherit;}
    a:active{text-decoration: none;color: inherit;}
    .backStageLogo{width: 100%;height: 80px;background-color: #212f3a;}
    .backStageLogoContent{position: relative;margin:0 auto;width: 1238px;height: 80px;background: url(/img/logo.png) no-repeat left 13px;}
    .backStageLogoContent>h2{position: absolute;top: 35px;left: 153px;color: #fff;font-size: 20px;}

    .mainBody{position: relative;margin:0 auto;width: 1238px;border:1px solid transparent;}
    .sideBar{position: absolute;top: -11px;left: -16px;z-index: 1;width: 190px;}
    .roundImpact{width: 170px;height: 10px;margin: 0 auto;background:#d9d9d9;border: #fff solid 5px;border-radius: 10px;box-shadow: 0 0 5px #999;}
    .userInfo{position: absolute;z-index: 1;top: 11px;left: 15px;width: 160px;height: 834px;background-color: #f2f8fd;box-shadow: 0 0 5px #999;}
    .userIcon{width: 66px;height: 66px;margin: 30px auto 16px auto;border: 5px solid #fff;border-radius: 66px;box-shadow: 0 0 5px #999;}
    .userName{width: 160px;font-size: 16px;font-weight: bold;text-align: center;}

    .pageList{position: absolute;top: 175px;left: 6px;z-index: 2;list-style-type: none;font-size: 13px;}
    .listIconFont{font-size: 18px;}
    .onePageList{height: 47px;width: 170px;text-align: center;cursor: pointer;}
    .onePageList>p{display: inline-block;height: 40px;width: 120px;margin: 0 22px 7px 28px;line-height: 40px;border-bottom: 1px solid #c1cee0;}
    .onePageList_active{background: url(/img/userInfoClickImpact.png) no-repeat;color: #fff;}
    .onePageList_active>p{border-bottom: none;}

    .orderArea{position: relative;width: 1055px;margin-left: 181px;margin-top: 20px;border: 1px solid #dcdcdc;background-color: #fff;}
    .myMoney{margin-top: 30px;margin-left: 45px;font-size: 14px;}
    .allCash{width: 1015px;height: 118px;margin-top: 18px;margin-left: 19px;background-color: #f6fbfe;border: solid 1px #b9ddf3;overflow: hidden;}
    .oneCash{float: left;display: inline-block;width: 225px;height: 60px;margin-top: 27px;padding-left: 36px;margin-left: -2px;border-left: 1px dashed #b9ddf3;}
    .oneCash>p{font-size: 14px;}
    .cashNum{display: inline-block;margin-top: 12px;font-size: 36px;font-weight: bold;font-family: Arial;}
    .oneOrder{position: relative;width: 1014px;margin: 0 auto 10px auto;border: #dcdcdc 1px solid;}
    .allItem{width: 362px;}
    .orderTime{color: #969696;width: 165px;height: 30px;background-color: #f0f0f0;text-align: center;line-height: 30px;font-size: 12px;border-bottom: 1px solid #e5e5e5;}
    .orderNumber{height: 30px;background-color: #f0f0f0;text-align: center;line-height: 30px;font-size: 12px;width: 197px;border-bottom: 1px solid #e5e5e5;}
    .cashHead{width: 122px;height: 30px;background-color: #f0f0f0;text-align: center;line-height: 30px;font-size: 12px;border-bottom: 1px solid #e5e5e5;}
    .shouhuorenxinxi{width: 272px;height: 30px;background-color: #f0f0f0;text-align: center;line-height: 30px;font-size: 12px;border-bottom: 1px solid #e5e5e5;}

    
    .orderItemInfo{width: 362px;height: 99px;border-bottom: 1px solid #e5e5e5;}
    .orderItemInfo:last-child{border-bottom: none;}
    .orderItemPhoto{float: left;width: 60px;height: 60px;margin-top: 14px;margin-left: 14px;}
    .orderItemPhoto img{width: 60px;height: 60px;}
    .orderItemName{width: 240px;height: 60px;padding-top: 14px;margin-left: 90px;color: #333;}
    .orderItemName p{font-size: 11px;margin-bottom: 15px;}
    .orderItemName span{font-size: 11px;color: #969696;}
    .orderItemPayInfo{width: 122px;border-left: 1px solid #e5e5e5;border-right: 1px solid #e5e5e5;vertical-align: middle;}
    .orderItemPayInfo p{width:122px;margin: 0 auto;font-size: 11px;color: #a5a5a5;text-align: center;line-height: 26px;}
    .orderManInfo{width: 270px;vertical-align: middle;}
    .orderManInfo p{margin: 0 auto;width: 220px;font-size: 12px;line-height: 24px; }
    .dzXuQiu{border-top: 1px solid #e5e5e5;width: 756px;height: 30px;border-bottom: 1px solid #e5e5e5;line-height: 30px;font-size: 12px;background-color: #f0f0f0;text-align: center;}
    .dzInfo{width: 756px;height: 65px;font-size: 12px;line-height: 20px;}
    .dzInfo p{margin: 10px 20px 0;}



    .orderEditForConfirm{left: 756px;width: 258px;border: 1px solid #5188c6;height: 100%;}
    .orderEditHeadForConfirm{width: 258px;height: 31px;background-color: #5188c6;line-height: 31px;color: #fff;font-size: 16px;text-align: center;margin-bottom: 20px;}
    .orderEditForConfirm p{margin-left: 40px;color: #828382;font-size: 12px;line-height: 24px;}
    .orderEditForConfirm .tijiaoButton{display: block;width: 178px;height: 30px;margin: 0 auto;border-color: #f5f5f5;line-height: 30px;text-align: center;font-size: 14px;border: 1px solid #dcdcdc;border-radius: 3px;background-color: #5188c6;color: #fff;margin-bottom: 20px;cursor: pointer;}
    .orderEditForConfirm .fapiao{height: 78px;border: #828382 1px solid;width: 176px;margin: 10px auto 15px;}




    .orderEditConfirmed{left: 756px;width: 258px;height: 228px;border: 1px solid #5fc08b;background-color: #fafffc;}
    .orderEditHeadConfirmed{width: 258px;height: 31px;margin-bottom: 40px;background-color: #5fc08b;line-height: 31px;color: #fff;font-size: 16px;text-align: center;}
    .orderEditConfirmed p{margin-left: 40px;color: #828382;font-size: 12px;line-height: 24px;}
    .orderEditConfirmed .fapiao{height: 78px;border: #828382 1px solid;width: 176px;margin: 10px auto 15px;}



    .orderEditConfirm{left: 756px;width: 258px;height: 228px;border: 1px solid #e5e5e5;}
    .orderEditHeadConfirm{width: 258px;height: 31px;background-color: #f0f0f0;line-height: 31px;font-size: 12px;text-align: center;margin-bottom: 20px;}
    .orderEditConfirm p{margin-left: 40px;color: #828382;font-size: 12px;line-height: 24px;}
    .orderEditConfirm .fapiao{height: 78px;border: #828382 1px solid;width: 176px;margin: 10px auto 15px;}
    .orderEditConfirm .tijiaoButton{display: block;width: 178px;height: 30px;margin: 0 auto;border-color: #f5f5f5;line-height: 30px;text-align: center;font-size: 14px;border: 1px solid #dcdcdc;border-radius: 3px;background-color: #f0f0f0;color: #b4b4b4;margin-bottom: 20px;cursor: pointer;}


    .pageButtonArea{display: inline-block;width: 756px;height: 40px;margin: 20px 0 20px 20px;border-bottom: 2px solid #e8e8e8;}
    .pageButtonDiv{width: 110px;height: 40px;float: left;text-align: center;font-size: 14px;cursor: pointer;}
    .pageButton{width: 109px;height: 14px;line-height: 14px;border-right: 1px solid #e8e8e8;margin-top: 10px;}
    .pageButtonOn{color: #3696ef;border-bottom: 2px solid #3696ef;}
    .pageButton span{color: #3696ef;}

    .orderSum{float: right;width: 180px;height: 42px;margin-right: 45px;padding: 20px 15px;}
    .numToday,.numAll{float: right;width: 90px;height: 42px;}
    .orderSum p{font-size: 24px;font-weight: bold;font-family: Arial;color: #3696ef;}
    .orderSum span{font-size: 12px;color: #969696;}

    .pagination-flickr{width: 560px;height: 35px;padding-top: 20px;margin:0 auto;padding-bottom: 10px;}
    .pagination-flickr li{width: 31px;height: 31px;border: 1px #d7d7d7 solid;line-height: 31px;text-align: center;background-color: #fafafa;font-size: 13px;list-style:none;margin: 0 2px;float: left;color: #3c3c3c;overflow: hidden;cursor:pointer;}
    .pagination-flickr .previous,.pagination-flickr .next,.pagination-flickr .tiaozhuanBtn{width: 71px;}
    .pagination-flickr .active{color: #f5520b;}
    .pagination-flickr .shenglve{border: none;background: inherit;cursor: default;}
    .pagination-flickr .tiaozhuan input{appearance:none;-moz-appearance:none;-webkit-appearance:none;width: 31px;height: 31px;line-height: 31px;font-size: 14px;}
    .mask{position: fixed;top: 50%;left: 50%;background-color: rgba(0,0,0,.5);z-index: 100;display: none;width: 880px;height: 390px;margin-top: -195px;margin-left: -440px;}
    .mask img{max-width: 100%;max-height: 100%;display: block;margin: 0 auto;}
    .mask .xx{background: url(/img/xx.png) no-repeat;width: 40px;height: 40px;position: absolute;right: 0;top: 0;background-size: 40px 40px;}

    </style>
     <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body style="background: #fafafa;">
<div class="backStageLogo">
    <div class="backStageLogoContent">
        <h2>厂商后台</h2>
    </div>
</div>
<div class="mainBody">
    <div class="sideBar">
        <div class="roundImpact"></div>
        <div class="userInfo">
            <div class="userIcon"></div>
            <p class="userName">${userName?default('')}</p>
        </div>
        <ul class="pageList">
            <li class="onePageList">
                <p>
                    <i class="iconfont listIconFont">&#xe80e;</i>
                    <a href="http://localhost:7077/index" style="text-decoration: none;font-weight: bold;">订单管理</a>
                </p>
            </li>
            <li class="onePageList onePageList_active">
                <p>
                    <i class="iconfont listIconFont">&#xe715;</i>
                    <a href="http://localhost:7077/order/index" style="text-decoration: none;color: #fff;font-weight: bold;">收入管理</a>
                </p>
            </li>
            <li class="onePageList">
                <p>
                    <i class="iconfont listIconFont">&#xe67f;</i>
                    <a href="http://localhost:7077/order/index" style="text-decoration: none;font-weight: bold;">账户设置</a>
                </p>
            </li>
        </ul>
    </div>
    <div class="orderArea">

<p class="myMoney">我的收入</p>
        <div class="allCash">
            <div class="oneCash">
                <p>未到账货款</p>
                <span class="cashNum">${unReached}</span><span>元</span>
            </div>
            <div class="oneCash">
                <p>已到账货款</p>
                <span class="cashNum">${reached}</span><span>元</span>
            </div>
            <div class="oneCash">
                <p>累计货款总额</p>
                <span class="cashNum">${sum}</span><span>元</span>
            </div>
        </div>

        <div class="allOrderPage">
        <div class="pageButtonArea">
            <div class="pageButtonDiv pageButtonOn">
                <div class="pageButton">全部订单</div>
            </div>
        </div>
<#list orderInfos as mkey>

        <table class="oneOrder" style="border-collapse:collapse;">
    <tr>
        <td class="orderTime">${mkey.paidTime?default('')}</td>
        <td class="orderNumber"><span style="color: #969696">订单号：</span><span class="fororderID">${mkey.orderId}</span></td>
        <td class="cashHead"><span>金额（元）</span></td>
        <td class="shouhuorenxinxi"><span>收货人信息</span></td>

        <#if mkey.orderState = 23>
            <td rowspan=2 class="orderEditConfirmed orderEdit" style="border-color: #e5e5e5;">
                    <div class="orderEditHeadConfirmed">━ 已收款 ━</div>
                    <p>查看电子回执单以确认收款：</p>
                    <div class="urlhoder" style="display: none;">${mkey.businessPaidVoucher?default("")}</div>
                    <div class="fapiao" style="position: relative;background: url('${mkey.businessPaidVoucher?default("")}');background-size: 176px 78px;"><div style="height: 100%;width: 100%;position: absolute;background:url(/img/clickToCheck.png) no-repeat;"></div></div>

            </td>
        <#elseif mkey.orderState = 22>
            <td rowspan=2 class="orderEditForConfirm orderEdit">
            <div class="orderEditHeadForConfirm">待收款</div>
                    <p>查看电子回执单以确认收款：</p>
                    <div class="urlhoder" style="display: none;">${mkey.businessPaidVoucher?default("")}</div>
                    <div class="fapiao" style="position: relative;background: url('${mkey.businessPaidVoucher?default("")}');background-size: 176px 78px;"><div style="height: 100%;width: 100%;position: absolute;background:url(/img/clickToCheck.png) no-repeat;"></div></div>
                    <p style="margin-left: 40px;color: #828382;font-size: 12px;line-height: 24px;" class="fahuoshijian1">发货时间：${mkey.logisticsTime?default('')}</p>
                    <div class="tijiaoButton">确认收款</div>
            </td>
        <#else>
            <td rowspan=2 class="orderEditConfirm orderEdit">
                <div class="orderEditHeadConfirm">未收款</div>
                    <p>查看电子回执单以确认收款：</p>
                    <div class="fapiao" style="position: relative;background: url(/img/emptyImg.png);"></div>
                    <div class="tijiaoButton">确认收款</div>


            </td>
        </#if>
    </tr>
    <tr>
        <td colspan=2 class="allItem">
        <#list mkey.orderItems as mmkey>
                <div class="orderItemInfo">
                                    <div class="orderItemPhoto">
                                        <img src="http://101.200.78.145${mmkey.imgUrl?default('')}" alt="">
                                    </div>
                                    <div class="orderItemName">
                                        <p>${mmkey.goodsName}</p>
                                        <span>×</span><span>${mmkey.goodsAmount}</span>
                                    </div>
                                </div>
                                </#list>
        </td>
        <td class="orderItemPayInfo">
            <p>总额：<span>${mkey.orderPaidFee}</span></p>
        </td>
        <td class="orderManInfo">
            <p>${mkey.toAddress}</br>${mkey.receiveUser}  ${mkey.toMobile}</p>

        </td>
    </tr>

</table>

</#list>
            </div>

            <ul class="pagination-flickr">
                <li class="dataStore" data-pageNum="1" style="display: none;"></li>
                <li class="previous"><< 上一页</li>
                <li class="changeBtn active">1</li>
                <li class="changeBtn">2</li>
                <li class="changeBtn">3</li>
                <li class="changeBtn">4</li>
                <li class="changeBtn">5</li>
                <li class="changeBtn">6</li>
                <li class="next">下一页 >></a></li>
                <li class="shenglve">向第</li>
                <li class="tiaozhuan"><input type="text"></li>
                <li class="shenglve">页</li>
                <li class="tiaozhuanBtn">跳转</li>
            </ul>

        </div>




    </div>


</div>




<div class="mask"><img src="" alt=""><div class="xx"></div></div>


<script type="text/javascript">

//ajax获取后续的数据
function ajaxList(offset){
    $offset=10*(offset-1)+''
    $.get("test.cgi", $offset,
          function(data){
          alert("Data Loaded: " + data);
});
}
function chushihua(){
    $max=parseInt($(".dataStore").attr("data-pageNum"))
    $changeBtn=$(".changeBtn")
    if ($max<=6){
        for (var i = 0; i <6; i++) {
            $changeBtn.eq(i).html(i+1)
            if(i>=$max){
                $changeBtn.eq(i).css("display","none")
            }
        }
    }else{
        $changeBtn.eq(0).html(1)
        $changeBtn.eq(1).html(2)
        $changeBtn.eq(2).html(3)
        $changeBtn.eq(3).html(4)
        $changeBtn.eq(4).html("...").addClass("shenglve")
        $changeBtn.eq(5).html($max)
    }
}
function chongpai(index){
    $max=parseInt($(".dataStore").attr("data-pageNum"))
    $changeBtn=$(".changeBtn")
    if(index<=3){
        chushihua()
        $changeBtn.removeClass("active")
        $changeBtn.eq(index-1).addClass("active")
    }else if(index<$max-2){
        $changeBtn.removeClass("active")
        $changeBtn.eq(0).html(index-2)
        $changeBtn.eq(1).html(index-1)
        $changeBtn.eq(2).html(index).addClass("active")
        $changeBtn.eq(3).html(index+1)
        $changeBtn.eq(4).html("...").addClass("shenglve")
        $changeBtn.eq(5).html($max)
    }else{
        $changeBtn.removeClass("active").removeClass("shenglve")
        $changeBtn.eq(0).html($max-5)
        $changeBtn.eq(1).html($max-4)
        $changeBtn.eq(2).html($max-3)
        $changeBtn.eq(3).html($max-2)
        $changeBtn.eq(4).html($max-1)
        $changeBtn.eq(5).html($max)
        $changeBtn.each(function(){
            if (parseInt($(this).html())===index){
                $(this).addClass("active")
            }
        })
    }
}

    ;(function($,window,document,undefined){

    $.fn.ImgsCarousel=function(){
        chushihua()
        $max=parseInt($(".dataStore").attr("data-pageNum"))
        $changeBtn=$(".changeBtn")
        $changeBtn.on("click",function(){
            if ($(this).hasClass("active")) {return}
            if ($(this).html()==="...") {return}
            $clickIndex=parseInt($(this).html())
            chongpai($clickIndex)

        })
         $(".previous").on("click",function(){
            $index=parseInt($(".active").html())
            if ($index===1) {return}
            chongpai($index-1)
         })
         $(".next").on("click",function(){
            $index=parseInt($(".active").html())
            if ($index===$max) {return}
            chongpai($index+1)
         })
         $(".tiaozhuanBtn").on("click",function(){
            $index=parseInt($(".tiaozhuan").find("input").val())
            if ($index>$max) {return}
            if ($index<1) {return}
            $indexNow=parseInt($(".active").html())
            if ($index===$indexNow) {return}
            chongpai($index)
         })
}
})(jQuery,window,document);


$(document).ready(function(){
$(".pagination-flickr").ImgsCarousel()

$(".fapiao").on("click",function(){
    console.log("ddd")
    if ($(this).siblings(".urlhoder").html()) {
        console.log("dddccccc")
        $(".mask").find("img").attr("src",$(this).siblings(".urlhoder").html())
        $(".mask").show()
    }
})
$(".xx").on("click",function(){
$(".mask").hide()
})

$(".tijiaoButton").on("click",function(){
if ($(this).parent().hasClass("orderEditForConfirm")) {
    var $that=$(this)
    //ajax
    var r=confirm("请确认收到款项！");
if (r==true)
  {
  var orderId=$(this).parent().siblings(".orderNumber").find(".fororderID").html()
    var postURL='/order/business_paid/confirm/'+orderId
$.post(postURL, function(msg){
    console.log(msg)
   if(msg.success){
                $that.parent().removeClass("orderEditForConfirm").addClass("orderEditConfirmed").css("border-color","#e5e5e5")
                $that.parent().find("div").eq(0).removeClass("orderEditHeadForConfirm").addClass("orderEditHeadConfirmed").html("━ 已收款 ━")
                $that.siblings(".fahuoshijian1").hide()
                $that.hide()
            }
  })
}
else
  {
  return;
  }
}
    
 });

})



</script>
</body>
</html>