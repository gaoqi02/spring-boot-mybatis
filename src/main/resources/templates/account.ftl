<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <style type="text/css">
    html,body,div,span,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,abbr,address,cite,code,del,dfn,em,img,ins,kbd,q,samp,small,strong,sub,sup,var,b,i,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,figcaption,figure,footer,header,hgroup,menu,nav,section,summary,time,mark,audio,video{margin:0;padding:0;border:0;outline:0;font-size:100%;vertical-align:baseline;background:transparent;font-family:"Microsoft YaHei"}body{line-height:1}:focus{outline:1}article,aside,canvas,details,figcaption,figure,footer,header,hgroup,menu,nav,section,summary{display:block}nav ul{list-style:none}blockquote,q{quotes:none}blockquote:before,blockquote:after,q:before,q:after{content:'';content:none}a{margin:0;padding:0;border:0;font-size:100%;vertical-align:baseline;background:transparent}ins{background-color:#ff9;color:#000;text-decoration:none}mark{background-color:#ff9;color:#000;font-style:italic;font-weight:bold}del{text-decoration:line-through}abbr[title],dfn[title]{border-bottom:1px dotted #000;cursor:help}table{border-collapse:collapse;border-spacing:0}hr{display:block;height:1px;border:0;border-top:1px solid #ccc;margin:1em 0;padding:0}input,select{vertical-align:middle}
    /*URL全部改为绝对路径*/
    @font-face {font-family: 'iconfont';
        src: url('iconfont.eot'); /* IE9*/
        src: url('iconfont.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */
        url('iconfont.woff') format('woff'), /* chrome、firefox */
        url('iconfont.ttf') format('truetype'), /* chrome、firefox、opera、Safari, Android, iOS 4.2+*/
        url('iconfont.svg#iconfont') format('svg'); /* iOS 4.1- */
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
    .disNone{display: none;}
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
    .pageButtonArea{display: inline-block;width: 1000px;height: 40px;margin: 20px 0 20px 20px;border-bottom: 2px solid #e8e8e8;}
    .pageButtonDiv{width: 110px;height: 40px;float: left;text-align: center;font-size: 14px;cursor: pointer;}
    .pageButton{width: 109px;height: 14px;line-height: 14px;border-right: 1px solid #e8e8e8;margin-top: 10px;}
    .pageButtonOn{color: #3696ef;border-bottom: 2px solid #3696ef;}
    .pageButton span{color: #3696ef;}
    .basicInfo{width: 1000px;margin-left: 20px;}
    .accountInfoLine{height: 70px;width: 1000px;border-bottom: 1px dashed #dcdcdc;line-height: 70px;}
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
            <p class="userName">${userName}</p>
        </div>
        <ul class="pageList">
            <li class="onePageList">
                <p>
                    <i class="iconfont listIconFont">&#xe80e;</i>
                    <a href="http://localhost:7077/index" style="text-decoration: none;font-weight: bold;">订单管理</a>
                </p>
            </li>
            <li class="onePageList">
                <p>
                    <i class="iconfont listIconFont">&#xe715;</i>
                    <a href="http://localhost:7077/order/index" style="text-decoration: none;font-weight: bold;">收入管理</a>
                </p>
            </li>
            <li class="onePageList onePageList_active">
                <p>
                    <i class="iconfont listIconFont">&#xe67f;</i>
                    <a href="http://localhost:7077/order/index" style="text-decoration: none;color: #fff;font-weight: bold;">账户设置</a>
                </p>
            </li>
        </ul>
    </div>
    <div class="orderArea">
        <div class="pageButtonArea">
            <div class="pageButtonDiv pageButtonOn">
                <div class="pageButton">基本信息</div>
            </div>
            <div class="pageButtonDiv">
                <div class="pageButton">账户安全</div>
            </div>
        </div>
        <div class="basicInfo">
        <div class="userIcon" style="background-color: black"></div>
        </div>
        <div class="basicInfo disNone">
            <p style="height: 40px;line-height: 40px;background-color: #fffce9;"><span style="font-size: 14px;font-weight: bold;margin-left: 25px;">安全等级：</span>
            <span style="display: inline-block;width: 100px;height: 10px;background-color: #e5e5e5;border-radius: 10px;position: relative;margin-left: 25px;">
                <span style="display: inline-block;width: 80px;height: 10px;background-color: #7fad3c;border-radius: 10px;position: absolute;left: 0;z-index: 1;"></span>
            </span>
            <span style="font-size: 14px;font-weight: bold;color: #7fad3c;margin-left: 25px;">良好</span>
            <span style="font-size: 12px;color: #e15e0f;margin-left: 100px;">为了更好的保护您的账户安全，请您尽快修改登录密码。</span>
            </p>
            <p class="accountInfoLine">
                <span style="font-size: 14px;font-weight: bold;margin-left: 60px;">登录密码</span>
                <span style="font-size: 12px;margin-left: 50px;color: #646464;">初始密码为买线网平台为厂商设置的，建议初次登录后，请立即更改。</span>
                <a href="http://localhost:7077/pwd/forget" style="color: #1d61be;font-size: 12px;text-decoration: none;margin-left: 345px;">修改</a>
            </p>
            <p class="accountInfoLine">
                <span style="font-size: 14px;font-weight: bold;margin-left: 60px;">手机验证</span>
                <span style="font-size: 12px;margin-left: 50px;color: #646464;">您的手机号为：</span>
                <span style="font-size: 14px;font-weight: bold;">13888888888</span>

            </p>
            
        </div>


    </div>
    </div>


    <script type="text/javascript">
        $(document).ready(function(){
            for (var i = 0; i < $(".pageButtonDiv").length; i++) {
                $(".pageButtonDiv").eq(i).on("click",function(){
                    var indexButton=$(".pageButtonDiv").index($(this))
                    $(".basicInfo").hide().eq(indexButton).show()
                    $(".pageButtonDiv").removeClass("pageButtonOn").eq(indexButton).addClass("pageButtonOn")
                })
            }


        });







    </script>

    </body>
</html>